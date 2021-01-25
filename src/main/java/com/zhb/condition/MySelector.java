package com.zhb.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//自定义逻辑注册需要导入的组件
public class MySelector implements ImportSelector {

    //返回值就是导入到容器中组件的全类名
    //annotationMetadata 当前标注@Import注解的类的所有注解信息
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        //注意不能返回null，否则会报空指针异常
        return new String[]{"com.zhb.bean.Blue","com.zhb.bean.Red"};
    }
}
