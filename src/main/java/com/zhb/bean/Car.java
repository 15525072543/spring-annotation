package com.zhb.bean;

/**
 * @ClassName: Car
 * @Description:
 * @date: 2021/2/3
 * @author zhb
 */
public class Car {
    public Car(){
        System.out.println("Car 对象创建了。。。。。。");
    }

    public void init(){
        System.out.println("Car 初始化方法。。。。。。");
    }

    public void destory(){
        System.out.println("Car 销毁方法执行。。。。。。。。");
    }
}
