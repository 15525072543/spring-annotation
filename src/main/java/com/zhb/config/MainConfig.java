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
//��������spring����һ�������� ���ú������ļ���ͬ
@Configuration
//value:ָ��Ҫɨ��İ�
// excludeFilters:ָ��ɨ���ʱ����ʲô�����ų���Щ���
// includeFilters:ָ��ɨ���ʱ����ʲô�����ų���Щ���

// FilterType.ANNOTATION������ע�ⷽʽ
// FilterType.ASSIGNABLE_TYPE�����ո���������
// ASPECTJ������ASPECTJ���ʽ
// REGEX������������ʽ
// CUSTOM��ʹ���Զ������

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

    //��������ע��һ��Bean; ����Ϊ����ֵ����; idĬ���Ƿ�������Ϊid
    @Bean(value = "����bean��id")
    public Person person01(){
        return new Person("zhb","18");
    }
}
