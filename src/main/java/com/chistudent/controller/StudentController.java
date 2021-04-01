package com.chistudent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chistudent.mapper.StudentMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentMapper mapper;

    @GetMapping("/list")
    String showAllStudent(Model model) {
        model.addAttribute("list", mapper.getAllStudent());
        return "list";
    }

//    @GetMapping(path = "{id}")
//    Student showStudent(@PathVariable int id) {
//        return mapper.getStudent(id);
//    }
//
//    @PostMapping
//    String addStudent() {
//        mapper.insert("kanako", 20, 3, 4, "kanako@example.com");
//        return "追加しました";
//    }
//
//    @PutMapping(path = "{id}")
//    String updateByPkey(@PathVariable int id) {
//        mapper.updateByPkey(id);
//        return "更新に成功しました";
//    }

}
