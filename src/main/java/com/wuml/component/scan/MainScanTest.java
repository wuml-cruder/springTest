package com.wuml.component.scan;

import com.wuml.component.scan.BeanScanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by wml on 2019/10/16.
 */
public class MainScanTest {
    public static void main( String[] args )
    {
        ApplicationContext ApplicationContext = new AnnotationConfigApplicationContext(BeanScanConfig.class);

        String[] beanDefinitionNames = ApplicationContext.getBeanDefinitionNames();
        for(String str:beanDefinitionNames){
            System.out.println( str);
        }


    }
}
