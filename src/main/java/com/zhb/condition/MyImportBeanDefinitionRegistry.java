package com.zhb.condition;


import com.zhb.bean.Color;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {

    /**
     * annotationMetadata ��ǰ���ע����Ϣ
     * BeanDefinitionRegistry��BeanDefinitionע����
     *      ��������Ҫ��ӵ������е�Bean
     *      BeanDefinitionRegistry.registerBeanDefinition() �ֹ�ע�����
     */
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        boolean hasBlue = registry.containsBeanDefinition("com.zhb.bean.Blue");
        boolean hasRed = registry.containsBeanDefinition("com.zhb.bean.Red");
        if (hasBlue && hasRed){
            //ָ��Bean�Ķ�����Ϣ��Bean������......��
            RootBeanDefinition definition = new RootBeanDefinition(Color.class);
            //ע��һ��bean��ָ��bean������
            registry.registerBeanDefinition("MyColor",definition);
        }

    }
}
