package com.zhb.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//�Զ����߼�ע����Ҫ��������
public class MySelector implements ImportSelector {

    //����ֵ���ǵ��뵽�����������ȫ����
    //annotationMetadata ��ǰ��ע@Importע����������ע����Ϣ
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        //ע�ⲻ�ܷ���null������ᱨ��ָ���쳣
        return new String[]{"com.zhb.bean.Blue","com.zhb.bean.Red"};
    }
}
