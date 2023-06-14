package com.paremskis.sms.rest.controller;

import com.paremskis.sms.model.Student;
import com.paremskis.sms.model.mapper.StudentMapper;
import com.paremskis.sms.model.request.AddStudentRequest;
import com.paremskis.sms.persistence.StudentRepository;
import com.paremskis.sms.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Tag(name = "Stundent Controller")
@Validated
@RestController
@RequestMapping(path = "/students", produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    private final StudentRepository studentRepository;

    //handler method to handle list students and return mode view
    @Operation(summary = "get students", description = "gets all students")
    @GetMapping()
    public Object listStudents() {
        return studentRepository.findAll();
    }

    @PutMapping()
    public Object putStudent(
            @RequestBody @Valid AddStudentRequest addStudentRequest){
        studentRepository.save(StudentMapper.map(addStudentRequest));
        return listStudents();
    }
}
