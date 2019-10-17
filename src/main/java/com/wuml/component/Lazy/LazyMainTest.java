package com.wuml.component.Lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by wml on 2019/10/17.
 */
public class LazyMainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LazyConfig.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String str:beanDefinitionNames){
            System.out.println( str);
        }
        LazyWorker bean = applicationContext.getBean(LazyWorker.class);
        System.out.println(bean);

    }
}
