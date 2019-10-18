package com.wuml.component.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by wml on 2019/10/17.
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        Dolphin bean = (Dolphin)annotationConfigApplicationContext.getBean("factoryBeanDolphin");
        System.out.println(bean);
        System.out.println(bean.getClass().getName());
        Object factoryBeanDolphin = annotationConfigApplicationContext.getBean("&factoryBeanDolphin");
        System.out.println(factoryBeanDolphin.getClass().getName());



    }
}
