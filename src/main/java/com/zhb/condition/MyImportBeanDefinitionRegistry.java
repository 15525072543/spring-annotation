package com.zhb.condition;


import com.zhb.bean.Color;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {

    /**
     * annotationMetadata 当前类的注解信息
     * BeanDefinitionRegistry：BeanDefinition注册类
     *      把所有需要添加到容器中的Bean
     *      BeanDefinitionRegistry.registerBeanDefinition() 手工注册进来
     */
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        boolean hasBlue = registry.containsBeanDefinition("com.zhb.bean.Blue");
        boolean hasRed = registry.containsBeanDefinition("com.zhb.bean.Red");
        if (hasBlue && hasRed){
            //指定Bean的定义信息（Bean的类型......）
            RootBeanDefinition definition = new RootBeanDefinition(Color.class);
            //注册一个bean，指定bean的名称
            registry.registerBeanDefinition("MyColor",definition);
        }

    }
}
