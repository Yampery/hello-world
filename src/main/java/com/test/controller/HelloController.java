package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @decription HelloController
 * <p></p>
 * @author Yampery
 * @date 2017/11/28 14:26
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }
}
