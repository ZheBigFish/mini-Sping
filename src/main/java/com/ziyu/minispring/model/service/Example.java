package com.ziyu.minispring.model.service;

import com.ziyu.minispring.spring.annotation.Autowired;
import com.ziyu.minispring.spring.annotation.Service;

/**
 * @ClassName Example
 * @Date
 * @Author
 * @Description TODO
 **/
@Service
public class Example {

    @Autowired
    private Father father;

    private String value;

    public Example(String value) {
        this.value = value;
    }

    public Example() { }

    public void out(){
        System.out.println(value);
    }

}
