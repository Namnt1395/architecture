package com.demo.clean.architecture.configuration;

import com.demo.clean.architecture.db.adapterimpl.StudentAdapterImpl;
import com.demo.clean.architecture.usecases.adapter.StudentAdapter;
import com.demo.clean.architecture.usecases.student.FindStudentUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {
    @Bean
    public FindStudentUseCase findStudentByNameUseCase(StudentAdapter studentAdapter) {
        return new FindStudentUseCase();
    }

    @Bean
    public StudentAdapter studentAdapter() {
        return new StudentAdapterImpl();
    }
}
