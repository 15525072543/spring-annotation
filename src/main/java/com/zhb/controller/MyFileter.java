package com.zhb.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @ClassName: MyFileter
 * @Description:
 * @date: 2020/11/29
 * @author zhb
 */
public class MyFileter implements TypeFilter {
    /**
     *
     * @param metadataReader:读取正在扫描的类的信息
     * @param metadataReaderFactory：可以获取到其他任何类的信息
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取正在扫描的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类资源（类的路径）
        Resource resource = metadataReader.getResource();
        System.out.println("--->"+classMetadata.getClassName());
        if(classMetadata.getClassName().contains("er")){
            return true;
        }
        return false;
    }
}
