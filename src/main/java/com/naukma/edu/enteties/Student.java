package com.naukma.edu.enteties;

public class Student {
    private int studentId;
    private String pib;
    private int course;

    public Student() {
    }

    public Student(String pib, int course) {
        this.pib = pib;
        this.course = course;
    }

    public Student(int studentId, String pib, int course) {
        this.studentId = studentId;
        this.pib = pib;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "com.naukma.edu.enteties.Student{" +
                "studentId=" + studentId +
                ", pib='" + pib + '\'' +
                ", course=" + course +
                '}';
    }
}
