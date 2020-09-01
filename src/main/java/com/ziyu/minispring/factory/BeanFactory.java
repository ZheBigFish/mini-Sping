package com.ziyu.minispring.factory;

import com.ziyu.minispring.bean.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName BeanFactory
 * @Date
 * @Author
 * @Description TODO
 **/
public class BeanFactory {

    public static Map<String, Bean> beanFactory = new HashMap<String, Bean>();

    public static void createBean(String name, Bean bean) {
        beanFactory.put(name, bean);
    }

    public static Bean getBean(String name) {
        return beanFactory.get(name);
    }

}
