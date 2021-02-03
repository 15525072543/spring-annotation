package com.zhb.config;

import com.zhb.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MainConfigOfLifeCycle
 * @Description:
 * @date: 2021/2/3
 * @author zhb
 */

@ComponentScan("com.zhb.bean")
@Configuration
public class MainConfigOfLifeCycle {

    @Bean(destroyMethod = "destory",initMethod = "init")
    public Car Car(){
        return new Car();
    }
}
