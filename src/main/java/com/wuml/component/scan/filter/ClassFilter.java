package com.wuml.component.scan.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author by wml on 2019/10/16.
 */
public class ClassFilter implements TypeFilter{
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //得到类的注解信息 metadataReader.getAnnotationMetadata();
        //得到类信息  metadataReader.getClassMetadata();
        //得到类路径
        Resource resource = metadataReader.getResource();
        //自己定义一个扫描规则 当我的类名字是包含Worker才OK
        if(resource.getFilename().contains("Worker")){
            return true;
        }
        return false;
    }
}
