package com.wuml.component.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author by wml on 2019/10/17.
 */
@Configuration
public class ScopeConfig {

    @Bean("scopeWorker1")
    public ScopeWorker1 getWorker(){
        return new ScopeWorker1("123","18");
    }

    @Scope(value = "prototype")
    @Bean
    public ScopeWorker2 scopeWorker2(){
        return new ScopeWorker2("123","18");
    }
}
