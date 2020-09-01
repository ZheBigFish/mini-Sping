package com.ziyu.minispring.bean;

import lombok.Data;

/**
 * @ClassName Bean
 * @Date
 * @Author
 * @Description TODO
 **/
@Data
public class Bean {

    private Object obj;

    private String beanName;

    public Bean(Object obj) {
        this.obj = obj;
    }
}
