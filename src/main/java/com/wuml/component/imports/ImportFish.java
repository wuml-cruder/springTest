package com.wuml.component.imports;

import lombok.Data;

/**
 * @author by wml on 2019/10/17.
 */
@Data
public class ImportFish {
    String name;
    String age;
    public ImportFish(){

    }

    public ImportFish(String name,String age){
        this.age = age;
        this.name = name;
    }
}
