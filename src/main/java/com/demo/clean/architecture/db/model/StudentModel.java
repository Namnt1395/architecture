package com.demo.clean.architecture.db.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "student")
@Entity
@Data
public class StudentModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int age;
}
