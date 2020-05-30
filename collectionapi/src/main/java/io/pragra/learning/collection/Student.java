package io.pragra.learning.collection;

import java.util.Date;
import java.util.Objects;

public class Student {
    private String name;
    private String courseName;
    private Date enrollmentDate;

    public Student(String name, String courseName, Date enrollmentDate) {
        this.name = name;
        this.courseName = courseName;
        this.enrollmentDate = enrollmentDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                '}';
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(courseName, student.courseName);
    }



}
