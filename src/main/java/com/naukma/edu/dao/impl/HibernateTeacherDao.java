package com.naukma.edu.dao.impl;

import com.naukma.edu.dao.TeachersDao;
import com.naukma.edu.enteties.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateTeacherDao implements TeachersDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public HibernateTeacherDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }

    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }

    public void saveTeacher(Teacher teacher) {
        currentSession().update(teacher);
    }
}
