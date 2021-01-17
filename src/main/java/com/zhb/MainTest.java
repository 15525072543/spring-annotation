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
         * ��ȡʹ��xml�����ļ���ʽע��spring�����Ķ���
         */
        ApplicationContext applicationContext_xml = new ClassPathXmlApplicationContext("beans.xml");
        Person person_xml = (Person)applicationContext_xml.getBean("person");
        System.out.println("xml��ʽע���bean:" + person_xml);

        /*
         * ��ȡʹ�������෽ʽע��spring�����Ķ���
         */
        ApplicationContext applicationContext_class = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person_class = applicationContext_class.getBean(Person.class);
        System.out.println("class��ʽע���bean:" + person_class);

        //��ȡbean�����id
        String[] beanNames = applicationContext_class.getBeanNamesForType(Person.class);
        for (String beanName : beanNames) {
            System.out.println("Bean�����idΪ: " + beanName);
        }
    }
}
