package com.wuml.component.scope;

import lombok.Data;

/**
 * @author by wml on 2019/10/17.
 */
@Data
public class ScopeWorker1 {
    String name;
    String age;
    public ScopeWorker1(String name,String age){
        this.age = age;
        this.name = name;
    }
}
