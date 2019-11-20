package com.suixingpay.patent.log.logaop;

import com.suixingpay.patent.entity.Log;
import com.suixingpay.patent.entity.User;
import com.suixingpay.patent.log.logvalue.LogValue;
import com.suixingpay.patent.log.mapper.LogMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Aspect
@Component
public class LogAOP{

    @Autowired
    private LogMapper logMapper;

    private Log logData;

    @Pointcut(value = "@annotation(com.suixingpay.patent.log.logvalue.LogValue) && @annotation(org.springframework.transaction.annotation.Transactional)")
    public void setLogData() {

    }

    @Around(value = "setLogData() && @annotation(logValue)")
    public void around(ProceedingJoinPoint proceedingJoinPoint, JoinPoint joinPoint, LogValue logValue) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String url = request.getRequestURI();
        User user =(User) session.getAttribute("user");
        try {
            if (user == null) {
                user.setUserId((long) -1);
                throw new RuntimeException();
            }
        } catch (RuntimeException r) {
            r.printStackTrace();
            System.out.println("user为空，session没有user数据！");
        }
        StringBuilder beforeLog = new StringBuilder();
        //反射
        if (logValue != null && logValue.value() != 0) {
            try {
                if (logValue.value() <= 0 || (logValue.value() >= joinPoint.getArgs().length)) {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("value不能小于0或者大于形参！");
                System.exit(1);
            }
            beforeLog.append("修改前数据：");
            for (int i = 0; i < logValue.value(); i++) {
                beforeLog.append(reflex(joinPoint.getArgs()[i + 1]));
            }
        }
        logData = getBeforeLog(new Date(), user.getUserId(),
                new Integer(1), logValue.TYPE().toString(),
                new Integer(1), "user信息:" + user.toString() + "||", "url:" + url + "||",
                beforeLog.toString());
    }

    private String reflex(Object entity) {

        return null;
    }

    private Log getBeforeLog(Date logTime, Long userId, Integer logType, String logMethod, Integer logState, String... str) {
        Log log = new Log();
        log.setLogMethod(logMethod);
        log.setUserId(userId);
        log.setLogState(logState);
        log.setLogTime(logTime);
        log.setLogType(logType);
        StringBuilder logUserMessage = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            logUserMessage.append(str[i] + " && ");
        }
        log.setLogUserMessage(logUserMessage.toString());
        return log;
    }


    @After(value = "setLogData() && @annotation(logValue)")
    public void after(JoinPoint joinPoint, LogValue logValue) {
        setEntity(joinPoint);
    }

    private void setEntity(JoinPoint joinPoint) {
        Object[] entityObject = joinPoint.getArgs();
        StringBuilder logInfo = new StringBuilder();
        //跳过request
        for (int i = 1; i < entityObject.length - 1; i++) {
            logInfo.append(entityObject[i].toString());
        }
        logInfo.append(entityObject[entityObject.length - 1]);
        logData.setLogInfo(logInfo.toString());
        try {
            if (logMapper.addUserMessageLog(logData) != 0) {
                throw new RuntimeException();
            }
        } catch (RuntimeException r) {
            r.printStackTrace();
            System.out.println("日志记录异常！");
        }
    }

}
