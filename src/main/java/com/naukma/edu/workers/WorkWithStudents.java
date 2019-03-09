package com.naukma.edu.workers;

import com.naukma.edu.dao.StudentDAO;
import com.naukma.edu.enteties.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents {

    @Autowired
    private StudentDAO studentDAO;

    public void saveStudentToDb(Student student) {
        if ((student!=null) && (student.getPib() != null) && (!"".equals(student.getPib())) && (student.getCourse() > 0)){
            studentDAO.addStudent(student);
            System.out.println("com.naukma.edu.enteties.Student have been saved " + student);
        }
    }

    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }
}
