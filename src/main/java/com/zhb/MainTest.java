package com.zhb;

import com.zhb.bean.Person;
import com.zhb.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainTest
 * @Description:
 * @date: 2020/11/8
 * @author zhb
 */
public class MainTest {
    public static void main(String[] args) {
        /*
         * 获取使用xml配置文件方式注入spring容器的对象
         */
        ApplicationContext applicationContext_xml = new ClassPathXmlApplicationContext("beans.xml");
        Person person_xml = (Person)applicationContext_xml.getBean("person");
        System.out.println("xml方式注入的bean:" + person_xml);

        /*
         * 获取使用配置类方式注入spring容器的对象
         */
        ApplicationContext applicationContext_class = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person_class = applicationContext_class.getBean(Person.class);
        System.out.println("class方式注入的bean:" + person_class);

        //获取bean对象的id
        String[] beanNames = applicationContext_class.getBeanNamesForType(Person.class);
        for (String beanName : beanNames) {
            System.out.println("Bean对象的id为: " + beanName);
        }
    }
}
