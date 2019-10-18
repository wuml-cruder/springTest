package com.wuml.component.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by wml on 2019/10/17.
 */
@Configuration
public class BeanConfig {

    @Bean("factoryBeanDolphin")
    public FactoryBeanDolphin get(){
        return new FactoryBeanDolphin();
    }
}
