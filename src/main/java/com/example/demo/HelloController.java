package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


   @Autowired
   private GirlProperties girlProperties;


    //Controller的使用
    //pathvariable获得URL中的数据
    //requestparam获得请求参数的值
    //getmapping组合注解


    @RequestMapping(value="/say",method = RequestMethod.GET)
    public String Say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "id:"+id;
    }

    //使用/say/{参数名}的方式来获得值  然后用pathvariable获得URL中的数据

    //使用传统的?id=sss  就用requestparam获得请求参数的值

}
