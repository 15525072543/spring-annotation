package com.zhb.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.naming.Context;

/**
 * @ClassName: LinuxCondition
 * @Description:
 * @date: 2020/12/22
 * @author zhb
 */
public class LinuxCondition implements Condition {

    /**
     * �Ƿ���linuxϵͳ
     * @param conditionContext: �ж�������ʹ�õ�������(����)
     * @param annotatedTypeMetadata: ע����Ϣ
     * @return
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //1.�ܻ�ȡ��ioc����ʹ�õ�beanfactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //2.��ȡ�������
        ClassLoader classLoader = conditionContext.getClassLoader();
        //3.��ȡ��ǰ������Ϣ
        Environment environment = conditionContext.getEnvironment();
        //4.��ȡ��bean�����ע����
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        String property = environment.getProperty("os.name");
        if (property.contains("linux")){
            return true;
        }
        return false;
    }
}
