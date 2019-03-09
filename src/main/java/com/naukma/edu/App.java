package com.naukma.edu;

import com.naukma.edu.enteties.Student;
import com.naukma.edu.enteties.Teacher;
import com.naukma.edu.workers.WorkWithStudents;
import com.naukma.edu.workers.WorkWithTeacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        WorkWithStudents worker =
                (WorkWithStudents) context.getBean("worker");

        Student testStudent = new Student("Vlad Valt", 5);
        worker.saveStudentToDb(testStudent);
        System.out.println(worker.getStudentById(1));


        WorkWithTeacher workWithTeacher =
                (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTeacher(teacher);

    }
}
