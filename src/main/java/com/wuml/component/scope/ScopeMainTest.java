package com.wuml.component.scope;

import com.wuml.component.scope.ScopeConfig;
import com.wuml.component.scope.ScopeWorker2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by wml on 2019/10/17.
 */
public class ScopeMainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);

        Object scopeWoker10 = applicationContext.getBean("scopeWorker1");
        Object scopeWoker11 = applicationContext.getBean("scopeWorker1");
        ScopeWorker2 scopeWoker20 =(ScopeWorker2)applicationContext.getBean("scopeWorker2");
        ScopeWorker2 scopeWoker21 =(ScopeWorker2)applicationContext.getBean("scopeWorker2");
        System.out.println(scopeWoker10==scopeWoker11);
        System.out.println(scopeWoker20==scopeWoker21);
    }
}
