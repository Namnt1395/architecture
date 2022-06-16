package com.demo.clean.architecture.usecases.student;

import com.demo.clean.architecture.entities.Student;
import com.demo.clean.architecture.usecases.adapter.StudentAdapter;
import org.springframework.beans.factory.annotation.Autowired;

public class FindStudentUseCase {
    @Autowired
    private StudentAdapter adapter;

    public Student find(String name) {
        return adapter.findByName(name);
    }
}
