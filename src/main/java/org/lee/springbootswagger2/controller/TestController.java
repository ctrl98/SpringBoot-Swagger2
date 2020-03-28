package org.lee.springbootswagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试接口文档")
@RequestMapping("/test")
public class TestController {

    @GetMapping("/people")
    @ApiOperation("测试人类的接口")
    public String Find(){
        return "Hello world";
    }
}
