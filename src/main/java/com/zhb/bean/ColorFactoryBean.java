package com.zhb.bean;

import org.springframework.beans.factory.FactoryBean;

//����һ��Spring�ṩ��FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {

    //����һ��Color��������������ӵ�������
    public Color getObject() throws Exception {
        return new Color();
    }

    //���ض��������
    public Class<?> getObjectType() {
        return Color.class;
    }

    /* �ǵ�����
     * true�����Bean�ǵ�ʵ������������ֻ����һ��
     * false����ʵ����ÿ�λ�ȡ���ᴴ��һ���µ�bean
     */
    public boolean isSingleton() {
        return false;
    }
}
