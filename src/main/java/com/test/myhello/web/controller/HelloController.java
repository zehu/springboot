package com.test.myhello.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 胡泽
 * @Date 2019/4/15 21:58
 * @Version 1.0
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("hello")
    public  String  hello(){
        return "Hello,World";
    }
}
