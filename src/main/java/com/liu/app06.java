package com.liu;

import com.liu.entity.Student;
import com.liu.service.StudentService;
import com.liu.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app06 {
    public static void main(String[] args) {
        String path[]=new String[]{"spring-mvc.xml","spring-mybatis.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);

        StudentService studentService = (StudentService)ctx.getBean("studentService");
        Student student=new Student();
        studentService.addStudent(student);
    }
}
