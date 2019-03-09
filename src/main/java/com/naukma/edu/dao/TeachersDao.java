package com.naukma.edu.dao;

import com.naukma.edu.enteties.Teacher;

public interface TeachersDao {

    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);

}
