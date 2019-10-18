package com.wuml.component.conditional;

import com.wuml.component.bean.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author by wml on 2019/10/17.
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional({SystemCondition.class})
    public Worker worker(){
        Worker worker = new Worker();
        worker.setName("wuml");
        worker.setAge("18");
        return worker;
    }
}
