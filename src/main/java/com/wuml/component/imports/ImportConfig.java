package com.wuml.component.imports;

import com.wuml.component.bean.Worker;
import com.wuml.component.factorybean.FactoryBeanDolphin;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author by wml on 2019/10/17.
 */
@Configuration
/**
 * @link Configuration @Configuration}, {@link ImportSelector},
 * {@link ImportBeanDefinitionRegistrar}, or regular component classes to import.**/
//Worker.class自定义注册，ImporterSelector.class实现ImportSelector接口，ImportBeanDef实现ImportBeanDefinitionRegistrar
@Import({Worker.class,ImporterSelector.class,ImportBeanDef.class})
public class ImportConfig {

}
