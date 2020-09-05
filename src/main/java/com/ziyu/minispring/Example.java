package com.ziyu.minispring;

import com.ziyu.minispring.annotation.Service;

/**
 * @ClassName Example
 * @Date
 * @Author
 * @Description TODO
 **/
@Service()
public class Example {

    private String value;

    public Example(String value) {
        this.value = value;
    }

    public Example() { }

    public void out(){
        System.out.println(value);
    }

}
