package com.wuml.component.Lazy;

import lombok.Data;

/**
 * @author by wml on 2019/10/17.
 */
@Data
public class LazyWorker {
    String name;
    String age;
    public LazyWorker(String name,String age){
        this.age = age;
        this.name = name;
    }
}
