package com.suixingpay.tp.controller;

import com.suixingpay.patent.entity.User;
import com.suixingpay.tp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping(value = "/login")
    public User login(@RequestParam("userStaff") String userStaff,
            @RequestParam("passWord") String passWord
            //@RequestParam("verifyCode") String verifyCode,
           // HttpSession session
            //

    ) {
        //if (StringUtils.isEmpty(verifyCode)) {
           // session.setAttribute("errorMsg", "验证码不能为空");
           // return "admin/login";
       // }
        //if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
          //  session.setAttribute("errorMsg", "用户名或密码不能为空");
           // return "admin/login";
       // }
       // String kaptchaCode = session.getAttribute("verifyCode") + "";
        //if (StringUtils.isEmpty(kaptchaCode) || !verifyCode.equals(kaptchaCode)) {
//            session.setAttribute("errorMsg", "验证码错误");
//            return "admin/login";
//        }
        User adminUser = userService.login(userStaff, passWord);
//        if (adminUser != null) {
//           // session.setAttribute("loginUser", adminUser.getNickName());
//           // session.setAttribute("loginUserId", adminUser.getAdminUserId());
//            //session过期时间设置为7200秒 即两小时
//            //session.setMaxInactiveInterval(60 * 60 * 2);
//            return "redirect:/admin/index";
//        } else {
//            session.setAttribute("errorMsg", "登陆失败");
//            return "admin/login";
//        }
        return  adminUser;
    }
}
