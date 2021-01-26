package com.zhb.bean;

import org.springframework.beans.factory.FactoryBean;

//创建一个Spring提供的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {

    //返回一个Color对象，这个对象会添加到容器中
    public Color getObject() throws Exception {
        return new Color();
    }

    //返回对象的类型
    public Class<?> getObjectType() {
        return Color.class;
    }

    /* 是单例？
     * true：这个Bean是单实例，在容器中只保存一份
     * false：多实例，每次获取都会创建一个新的bean
     */
    public boolean isSingleton() {
        return false;
    }
}
