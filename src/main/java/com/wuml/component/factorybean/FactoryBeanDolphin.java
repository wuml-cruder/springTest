package com.wuml.component.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author by wml on 2019/10/17.
 */
public class FactoryBeanDolphin implements FactoryBean<Dolphin> {

    @Override
    public Dolphin getObject() throws Exception {
        return new Dolphin("10","10");
    }

    @Override
    public Class<?> getObjectType() {
        return Dolphin.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
