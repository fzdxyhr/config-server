package com.yhr.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YHR on 2017/5/6.
 */
@RestController
@RequestMapping("/v1")
public class UserController {

    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
