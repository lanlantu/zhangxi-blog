package com.lanlantu.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author lanlantu
 * @Date 2022/5/21 13:42
 */

@Api(tags = "首页模块")
@RestController
public class LoginController {

//public static final Logger log =LoggerFactory.getLogger(LoginController.class);

    @ApiOperation(value = "主页")
    @GetMapping("/zhuye")
    public String login(){
        return "主页";
    }
}
