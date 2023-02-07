package com.javarush.task.task29.task2909.human;

import java.util.*;

public class University{

    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }


//    public University(String name, int age) {
//       super(name, age, 0);
//    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) {
                return student;
            }
        }
        return null;

    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        double maxGrade = 0;
        for (Student student : students) {
            double currentGrade = student.getAverageGrade();
            if (currentGrade > maxGrade) maxGrade = currentGrade;
        }

        return getStudentWithAverageGrade(maxGrade);
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        double minGrade = students.get(0).getAverageGrade();
        for (Student student : students) {
            double currentGrade = student.getAverageGrade();
            if (currentGrade < minGrade) minGrade = currentGrade;
        }

        return getStudentWithAverageGrade(minGrade);
    }

    public void expel(Student student) {
        //TODO:
        students.remove(student);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}