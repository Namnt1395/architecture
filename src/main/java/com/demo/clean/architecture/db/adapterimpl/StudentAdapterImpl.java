package com.demo.clean.architecture.db.adapterimpl;

import com.demo.clean.architecture.db.mapper.StudentMapper;
import com.demo.clean.architecture.db.model.StudentModel;
import com.demo.clean.architecture.db.repository.StudentRepository;
import com.demo.clean.architecture.entities.Student;
import com.demo.clean.architecture.usecases.adapter.StudentAdapter;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentAdapterImpl implements StudentAdapter {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student findByName(String name) {
        StudentModel findByName = studentRepository.findByName(name);

        return StudentMapper.toEntity(findByName);
    }
}
