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
     * @param metadataReader:��ȡ����ɨ��������Ϣ
     * @param metadataReaderFactory�����Ի�ȡ�������κ������Ϣ
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //��ȡ��ǰע�����Ϣ
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //��ȡ����ɨ�������Ϣ
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //��ȡ��ǰ����Դ�����·����
        Resource resource = metadataReader.getResource();
        System.out.println("--->"+classMetadata.getClassName());
        if(classMetadata.getClassName().contains("er")){
            return true;
        }
        return false;
    }
}
