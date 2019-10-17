package com.wuml.component.Lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author by wml on 2019/10/17.
 */
@Configuration
public class LazyConfig {

    @Lazy
    @Bean
    public LazyWorker lazyWorker(){
        System.out.println("import lazyWorker bean");
        return new LazyWorker("wuml","20");
    }
}
