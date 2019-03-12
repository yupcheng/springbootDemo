package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yupcheng
 * @Description TODO
 * @Date 3-12 15:57
 * @Version 1.0
 **/
@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("index")
    public String hello()
    {
        return "hello world!";
    }
}
