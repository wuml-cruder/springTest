package com.wuml.component.bean;

import com.wuml.component.bean.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author by wml on 2019/10/16.
 */
@Configuration
@ComponentScan
public class BeanConfig {

    @Bean("workerBean")
    public Worker worker(){
        Worker worker = new Worker();
        worker.setName("123");
        worker.setAge("18");
        return worker;
    }
}
