package com.atyichen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 声明为一个spring的bean
@Controller
public class UserController {
    // 设置当前请求的访问路径
    @RequestMapping("save")
    // 设置当前操作的返回值类型(默认把返回的东西整体作为返回值 给到外面)
    @ResponseBody
    public String save() {
        // 定义一个请求
        System.out.println("user save running");
        return "{'module':'springmvc'}";
    }
}
