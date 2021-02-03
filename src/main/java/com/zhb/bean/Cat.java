package com.zhb.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;

/**
 * @ClassName: Cat
 * @Description:
 * @date: 2021/2/3
 * @author zhb
 */
@Component
public class Cat implements InitializingBean,DisposableBean{

    public Cat(){
        System.out.println("cat ���췽��������������");
    }

    public void destroy() throws Exception {
        System.out.println("cat ���١���������������");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat ��ʼ��������������");
    }
}
