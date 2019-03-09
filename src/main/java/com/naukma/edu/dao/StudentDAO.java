package com.naukma.edu.dao;

import com.naukma.edu.enteties.Student;

public interface StudentDAO {

    void addStudent(Student student);
    Student getStudentById(int id);
}
