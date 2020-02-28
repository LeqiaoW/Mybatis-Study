package com.dao;

import com.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有学生
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
