package com.ziyu.minispring.spring.scanner;

import com.ziyu.minispring.spring.annotation.Controller;
import com.ziyu.minispring.spring.annotation.Service;
import com.ziyu.minispring.spring.bean.Bean;
import com.ziyu.minispring.spring.factory.BeanFactory;

import java.lang.annotation.Annotation;

/**
 * @ClassName Scanner
 * @Date
 * @Author
 * @Description TODO
 **/
public class Scanner {

    public static void scanner(String name) throws Exception {
        Class aClass = Class.forName(name);
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Service) {
                BeanFactory.createBean(aClass.getName(), new Bean(aClass.getConstructor().newInstance()));
            }
            if (annotation instanceof Controller) {
                BeanFactory.createBean(aClass.getName(), new Bean(aClass.getConstructor().newInstance()));
            }
        }
    }

}
