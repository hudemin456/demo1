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

    /**
     * 查询一个女生
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    @PutMapping(value = "/girls/{id}")
    public Girl girlupdate(@PathVariable("id") Integer id,
                           @RequestParam("cpuSize") String cpuSize,
                           @RequestParam("age") Integer age) {
        Girl g = new Girl();
        g.setId(id);
        g.setCpuSize(cpuSize);
        g.setAge(age);
        return girlRepository.save(g);

    }

    //PathVariable是获得URL中的数据
    //RequestParam获得参数中的值


    @DeleteMapping(value = "/girls/{id}")
    public void del(@PathVariable("id") Integer id) {

        girlRepository.delete(id);

    }

}
