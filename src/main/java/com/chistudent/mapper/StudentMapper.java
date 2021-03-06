package com.chistudent.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chistudent.model.Student;

@Mapper
public interface StudentMapper {
    List<Student> getAllStudent();

    Student getStudent(int id);

    int updateByPkey(int id);

    int insert(String name, int age, int status, int departementId,
            String email);

}