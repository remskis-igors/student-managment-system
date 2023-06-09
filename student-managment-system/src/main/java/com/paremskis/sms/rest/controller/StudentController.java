package com.paremskis.sms.rest.controller;

import com.paremskis.sms.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    //handler method to handle list students and return mode view
    @ApiOperation("get students")
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }


}
