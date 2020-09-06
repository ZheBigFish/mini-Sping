package com.ziyu.minispring.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


/**
 * 配置bean的作用域
 *      singleton：单例，即容器里只有一个实例对象
 *      prototype：多对象，每一次请求都会产生一个新的bean实例
 *      request：对每一次HTTP请求都会产生一个新的bean
 */
@Target(ElementType.TYPE)
public @interface Scope {

    String value() default "singleton";

}
