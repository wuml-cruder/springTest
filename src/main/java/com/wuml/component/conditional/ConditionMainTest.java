package com.wuml.component.conditional;

import com.wuml.component.bean.Worker;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by wml on 2019/10/17.
 */
public class ConditionMainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);
        Worker bean = annotationConfigApplicationContext.getBean(Worker.class);
        System.out.println(bean);
    }
}
