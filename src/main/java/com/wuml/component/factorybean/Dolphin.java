package com.wuml.component.factorybean;

import lombok.Data;

/**
 * @author by wml on 2019/10/17.
 */
@Data
public class Dolphin {
    String name;
    String age;
    public Dolphin(){

    }

    public Dolphin(String name,String age){
        this.age = age;
        this.name = name;
    }
}
