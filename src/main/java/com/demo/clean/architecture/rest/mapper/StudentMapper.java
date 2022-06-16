package com.demo.clean.architecture.rest.mapper;

import com.demo.clean.architecture.entities.Student;
import com.demo.clean.architecture.rest.dto.StudentDto;

public class StudentMapper {

    public static StudentDto toDto(Student entity) {
        if (entity == null) {
            return null;
        }

        StudentDto studentDto = new StudentDto();
        studentDto.setName(entity.getName());
        studentDto.setAge(entity.getAge());

        return studentDto;
    }
}
