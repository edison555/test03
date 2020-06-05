package com.eloam.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: miss[494977551@qq.com]
 * @Date: Create in 15:58 2020/6/5
 * @DESC:
 **/
@RestController
public class Demo {

    @RequestMapping({"/","/index"})
    public String str(){
        return "ok";
    }
}
