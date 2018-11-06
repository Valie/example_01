package com.a_service.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Takioo
 * @Date 2018/11/5 16:11
 **/

@SpringBootApplication
@RestController
public class HelloControl {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name + ", I am from: " + port;
    }

}
