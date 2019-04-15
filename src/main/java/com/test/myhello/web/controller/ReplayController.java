package com.test.myhello.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ReplayController
 * @Description TODO
 * @Author 胡泽
 * @Date 2019/4/15 22:30
 * @Version 1.0
 */
@RestController
public class ReplayController {
    @RequestMapping("replay")
    public String replay(String name){
        return "我返回的数字是："+name;
    }
}
