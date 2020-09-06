package com.ziyu.minispring.model.service;

import com.ziyu.minispring.spring.annotation.Autowired;
import com.ziyu.minispring.spring.annotation.Service;

/**
 * @ClassName Father
 * @Date
 * @Author
 * @Description TODO
 **/
@Service
public class Father {

    @Autowired
    private Example example;

    public void say() {
        System.out.println("我是你爸爸");
    }

}
