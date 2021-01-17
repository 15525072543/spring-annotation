package com.zhb.config;

import com.zhb.bean.Person;
import com.zhb.controller.MyFileter;
import com.zhb.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @ClassName: MainConfig
 * @Description:
 * @date: 2020/11/8
 * @author zhb
 */
//告诉配置spring这是一个配置类 作用和配置文件相同
@Configuration
//value:指定要扫描的包
// excludeFilters:指定扫描的时候按照什么规则排除那些组件
// includeFilters:指定扫描的时候按照什么规则排除那些组件

// FilterType.ANNOTATION：按照注解方式
// FilterType.ASSIGNABLE_TYPE：按照给定的类型
// ASPECTJ：按照ASPECTJ表达式
// REGEX：按照正则表达式
// CUSTOM：使用自定义规则

@ComponentScans(value = {
    // @ComponentScan(value = "com.zhb",excludeFilters = {
    //     @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,Service.class})
    // }),
    // @ComponentScan(value = "com.zhb",includeFilters = {
    //     @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,Service.class})
    // },useDefaultFilters = false),
    @ComponentScan(value = "com.zhb",includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFileter.class})
    },useDefaultFilters = false)
})
    public class MainConfig {

    //给容器中注册一个Bean; 类型为返回值类型; id默认是方法名作为id
    @Bean(value = "我是bean的id")
    public Person person01(){
        return new Person("zhb","18");
    }
}
