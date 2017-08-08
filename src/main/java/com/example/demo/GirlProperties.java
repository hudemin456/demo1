package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/8 0008.
 */

//添加一个component注解来支持导入配置文件，ConfigurationProperties用来指定配置文件中的具体配置
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String cpuSize;

    private int age;

    public String getCpuSize() {
        return cpuSize;
    }

    public void setCpuSize(String cpuSize) {
        this.cpuSize = cpuSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
