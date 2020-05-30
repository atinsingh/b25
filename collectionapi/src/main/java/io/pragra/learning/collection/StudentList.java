package io.pragra.learning.collection;

public class StudentList {
    private Student [] students;

    public StudentList() {
        students = new Student[0];
    }

    public void addStudent(Student student) {
        int len = this.students.length;
        Student [] temp = new Student[len+1];
        for (int i = 0; i <students.length ; i++) {
            temp[i] = students[i];
        }
        temp[temp.length-1] = student;
        this.students = temp;
    }

    public void printArray(){
        for (Student st: students) {
            System.out.println(st);
        }
    }

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Vivek", "MS"));
//        studentList.addStudent(new Student("Navdeep", "Java"));
        studentList.printArray();

    }
}
