package com.wuml.component.imports;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author by wml on 2019/10/17.
 */
public class ImportBeanDef implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean importWater = registry.containsBeanDefinition("com.wuml.component.imports.ImportWater");
        if(importWater){
            System.out.println("有水----------加载鱼");
            //有水才有鱼
            registry.registerBeanDefinition("importFish",new RootBeanDefinition(ImportFish.class));
        }
    }
}
