package com.suixingpay.log.logvalue;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
*调用此注解 必须 有 HttpServletRequest且为第一个参数
*必须配合@Transactional才能生效
* @author 周波
 */


@Target(ElementType.METHOD)
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface LogValue{

    /*
    *NULLTYPE,  默认值
    * UPDATA,
    * DELETE,
    * INSERT
     */
    OPERATIONTYPE[] TYPE() default OPERATIONTYPE.NULLTYPE;

    /*
     *当type为updata时，可以配置entityValue的个数，必须和entityValue对应
     * 内容为修改实体类的类名
     * 从第二参数起一一对应
     * 实体类中包含应有的key
     */
    int value() default 0;

}
