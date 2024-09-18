package com.booleanuk.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String dateOfBirth;

    @Column
    private String courseTitle;

    @Column
    private String courseStartDate;

    @Column
    private String avgGrade;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String firstName, String lastName, String dateOfBirth, String courseTitle, String courseStartDate, String avgGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.courseTitle = courseTitle;
        this.courseStartDate = courseStartDate;
        this.avgGrade = avgGrade;
    }


}
