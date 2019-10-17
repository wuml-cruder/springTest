package com.wuml.component.scan;

import com.wuml.component.scan.filter.ClassFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author by wml on 2019/10/16.
 */
@Configuration
@ComponentScan(includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = ClassFilter.class),
},useDefaultFilters = false)
public class BeanScanConfig {

}
