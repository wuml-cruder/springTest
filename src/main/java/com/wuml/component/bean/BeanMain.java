package com.wuml.component.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wml
 */
public class BeanMain
{
    public static void main( String[] args )
    {
        //ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext ApplicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        Worker worker = (Worker)ApplicationContext.getBean("workerBean");
        System.out.println( worker.toString());

    }
}
