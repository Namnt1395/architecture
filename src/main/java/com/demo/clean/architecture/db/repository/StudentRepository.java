package com.demo.clean.architecture.db.repository;

import com.demo.clean.architecture.db.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

    StudentModel findByName(String name);
}
