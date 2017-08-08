package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 查看所有女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> findAll(){

        return girlRepository.findAll();
    }

    /**
     * 新增一个女生
     * @param cpuSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cpuSize") String cpuSize,
                           @RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setCpuSize(cpuSize);
        girl.setAge(age);

        return girlRepository.save(girl);

    }
}
