package com.chistudent.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chistudent.mapper.StudentMapper;
import com.chistudent.model.Student;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("student")
public class StudentController {

    private final StudentMapper mapper;

    @GetMapping
    List<Student> showAllStudent() {
        return mapper.getAllStudent();
    }

    @GetMapping(path = "{id}")
    Student showStudent(@PathVariable int id) {
        return mapper.getStudent(id);
    }

    @PutMapping(path = "{id}")
    String updateByPkey(@PathVariable int id) {
        mapper.updateByPkey(id);
        return "更新に成功しました";
    }

}
