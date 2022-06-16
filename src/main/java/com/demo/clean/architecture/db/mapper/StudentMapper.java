package com.demo.clean.architecture.db.mapper;

import com.demo.clean.architecture.db.model.StudentModel;
import com.demo.clean.architecture.entities.Student;

public class StudentMapper {

    public static Student toEntity(StudentModel model) {
        if (model == null) {
            return null;
        }

        Student student = new Student();
        student.setName(model.getName());
        student.setAge(model.getAge());

        return student;
    }
}
