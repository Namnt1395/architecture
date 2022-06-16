package com.demo.clean.architecture.usecases.adapter;

import com.demo.clean.architecture.entities.Student;

public interface StudentAdapter {

    Student findByName(String name);
}
