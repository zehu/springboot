package com.test.web.controller;

import com.test.myhello.web.controller.HelloController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 胡泽
 * @Date 2019/4/15 23:01
 * @Version 1.0
 */
public class TestController {
     HelloController helloController=null;
    @Before
    public void setup(){
        helloController = new HelloController();
    }
@Test
     public  void hello(){
         String hello = helloController.hello();
         System.out.println(hello);
    Assert.assertTrue(hello.equals("Hello,World"));
     }

}
