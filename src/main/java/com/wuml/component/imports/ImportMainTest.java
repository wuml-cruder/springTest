package com.wuml.component.imports;

import com.wuml.component.bean.Worker;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by wml on 2019/10/17.
 */
public class ImportMainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String str:beanDefinitionNames){
            System.out.println(str);
        }
        Worker bean = annotationConfigApplicationContext.getBean(Worker.class);
        bean.setName("999");
        bean.setAge("1");
        System.out.println(bean);
        ImportWater importWater = annotationConfigApplicationContext.getBean(ImportWater.class);
        importWater.setName("888");
        importWater.setAge("2");
        System.out.println(importWater);
        ImportFish importFish = annotationConfigApplicationContext.getBean(ImportFish.class);
        importFish.setName("777");
        importFish.setAge("3");
        System.out.println(importFish);

    }
}
