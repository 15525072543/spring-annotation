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
@Conditional(WindowsCondition.class) //���������㵱ǰ����ʱ, �������������õ�bean������Ч.
@Import({MySelector.class})//@Import ���ٵ��������idĬ���������ȫ����
public class MainConfig2 {

    /**
     * prototype:��ʵ����       ioc����������������÷�������������������С�ÿ�λ�ȡ��ʱ��Ż���÷�����������
     * singleton:��ʵ���ģ�Ĭ�ϣ� ioc��������       ioc�����Ե��÷�����������ŵ�ioc�����С��Ժ�ÿ�λ�ȡ����ֱ�Ӵ�������map.get()�����á�
     * request:ͬһ�����󴴽�һ��ʵ��
     * session:ͬһ��session����һ��ʵ��
     *
     *
     *
     * ������ (��Ե�ʵ��bean, Ĭ��������������ʱ�򴴽�����):
     *          ������������������, ��һ��ʹ��(��ȡ)Bean��������, ����ʼ��.
     *
     *
     * @return
     */
    @Scope("singleton")
    @Lazy
    @Bean("person") //Ĭ���ǵ�ʵ����
    public Person person(){
        System.out.println("ioc�����������ˡ�����");
        return new Person("����", "25");
    }

    /**
     * ���ϵͳ��windows, ��������ע��("bill")
     * ���ϵͳ��linuxϵͳ, ��������ע��("linus")
     * Conditional : ����һ�������������ж�, ����������������ע��bean
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
