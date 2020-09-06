package com.ziyu.minispring.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 表示将该类自动发现扫描组件
 */
@Target(ElementType.TYPE)
public @interface ComponentScan {

    /**
     * 扫描路径
     */
    String value();

}
