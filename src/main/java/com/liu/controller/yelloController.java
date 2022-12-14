package com.liu.controller;


import com.liu.entity.Student;
import com.liu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class yelloController {

    @Resource
    private StudentService studentService;

    //    让url请求过来，并且让视图解析器进行解析
    @RequestMapping(value = "/yellow/hello", method = RequestMethod.GET)
    public String hello() {
        Student student = new Student();
        student.setId(123);
        studentService.addStudent(student);
        return "hello";
    }

    @RequestMapping(value = "/yellow/nihao", method = RequestMethod.POST)
    public String nihao(@RequestParam("name")  String name) {
        System.out.println(name);
        Student student = new Student();
        student.setId(123);
        student.setEmail("ssddd");
        student.setAge(12);
        student.setName("fffff");
        studentService.addStudent(student);
        return "hello";
    }

//获取不到name值
    @RequestMapping(value = "/yellow/nihao22", method = RequestMethod.POST)
    public String nihao22(String name) {
        System.out.println(name);
        return "hello";
    }

//不行
    @PostMapping("/yellow/hello33")
    public String hello33(@RequestParam("name") String name) {
        String str = "" + name;
        System.out.println(str);
        return str;
    }
//获取不到 name值
    @PostMapping("/yellow/hello44")
    public String hello44(String name) {
        String str = "" + name;
        System.out.println(str);
        return str;
    }

    @RequestMapping(value = "/yellow/zaijian", method = RequestMethod.POST)
    public String zaijian(@RequestBody Student student) {
        System.out.println(student);
        return "999";
    }
}