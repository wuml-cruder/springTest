package com.wuml.component.imports;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author by wml on 2019/10/17.
 */
@Data
public class ImportWater {
    String name;
    String age;
    public ImportWater(){

    }

    public ImportWater(String name,String age){
        this.age = age;
        this.name = name;
    }
}
