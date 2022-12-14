package com.liu.dao;

import com.liu.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public interface StudentDao {

     int insertStudent(Student student);
     List<Student> selectStudents();
}
