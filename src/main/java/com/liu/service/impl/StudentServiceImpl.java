package com.liu.service.impl;

import com.liu.dao.StudentDao;
import com.liu.entity.Student;
import com.liu.service.StudentService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    //引用类型
    @Autowired
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        List<Student> students = studentDao.selectStudents();
        System.out.println("123");
        return 1;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }

}