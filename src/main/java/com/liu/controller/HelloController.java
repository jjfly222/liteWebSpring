package com.liu.controller;


import com.liu.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    //    让url请求过来，并且让视图解析器进行解析
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
//        mv.setEmail("sssssssssss");
        return "hello";
    }
//只有这个可以，但是格式有问题
    @RequestMapping(value = "/nihao", method = RequestMethod.POST)
    public String nihao(@RequestBody  String name) {
        System.out.println(name);
        return "hello";
    }

//获取不到name值
    @RequestMapping(value = "/nihao22", method = RequestMethod.POST)
    public String nihao22(String name) {
        System.out.println(name);
        return "hello";
    }

//不行
    @PostMapping("/hello33")
    public String hello33(@RequestParam("name") String name) {
        String str = "" + name;
        System.out.println(str);
        return str;
    }
//获取不到 name值
    @PostMapping("/hello44")
    public String hello44(String name) {
        String str = "" + name;
        System.out.println(str);
        return str;
    }

    @RequestMapping(value = "/zaijian", method = RequestMethod.POST)
    public String zaijian(@RequestBody Student student) {
        System.out.println(student);
        return "999";
    }
}