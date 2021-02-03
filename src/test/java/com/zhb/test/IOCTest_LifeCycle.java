package com.zhb.test;

import com.zhb.config.MainConfigOfLifeCycle;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: IOCTest_LifeCycle
 * @Description:
 * @date: 2021/2/3
 * @author zhb
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("容器创建完成。。。。。。");
        context.close();
    }
}
