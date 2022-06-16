package com.demo.clean.architecture.rest.controller;

import com.demo.clean.architecture.entities.Student;
import com.demo.clean.architecture.rest.dto.StudentDto;
import com.demo.clean.architecture.rest.mapper.StudentMapper;
import com.demo.clean.architecture.usecases.student.FindStudentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private FindStudentUseCase findStudentUseCase;

    @GetMapping("/find")
    public ResponseEntity<StudentDto> findByName(@RequestParam String name) {
        Student student = findStudentUseCase.find(name);

        return new ResponseEntity<>(StudentMapper.toDto(student), HttpStatus.OK);
    }
}
