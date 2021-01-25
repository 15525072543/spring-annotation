package com.zhb.config;

import com.zhb.bean.Blue;
import com.zhb.bean.Person;
import com.zhb.bean.Red;
import com.zhb.condition.LinuxCondition;
import com.zhb.condition.MySelector;
import com.zhb.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @ClassName: MainConfing2
 * @Description:
 * @date: 2020/12/3
 * @author zhb
 */
@Configuration
@Conditional(WindowsCondition.class) //表明当满足当前条件时, 给类中所有配置的bean才能生效.
@Import({MySelector.class})//@Import 快速导入组件，id默认是组件的全类名
public class MainConfig2 {

    /**
     * prototype:多实例的       ioc容器启动并不会调用方法创建对象放在容器中。每次获取的时候才会调用方法创建对象。
     * singleton:单实例的（默认） ioc容器启动       ioc启动对调用方法创建对象放到ioc容器中。以后每次获取就是直接从容器（map.get()）中拿。
     * request:同一次请求创建一个实例
     * session:同一个session创建一个实例
     *
     *
     *
     * 懒加载 (针对单实例bean, 默认在容器启动的时候创建对象):
     *          容器启动不创建对象, 第一次使用(获取)Bean创建对象, 并初始化.
     *
     *
     * @return
     */
    @Scope("singleton")
    @Lazy
    @Bean("person") //默认是单实例的
    public Person person(){
        System.out.println("ioc配置类启动了。。。");
        return new Person("张三", "25");
    }

    /**
     * 如果系统是windows, 给容器中注册("bill")
     * 如果系统是linux系统, 给容器中注册("linus")
     * Conditional : 按照一定的条件进行判断, 满足条件给容器中注册bean
     * @return
     */
    @Conditional(WindowsCondition.class)
    @Bean("bill")
    public Person person01(){
        return  new Person("Bill Getes","62");
    }

    @Conditional(LinuxCondition.class)
    @Bean("linus")
    public Person person02(){
        return  new Person("linus","48");
    }

}
