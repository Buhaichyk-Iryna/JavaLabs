package lab3_java_buhaichyk.controller;

import lab3_java_buhaichyk.model.Sex;
import lab3_java_buhaichyk.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String parentage, Sex gender) {
        return new Student(firstName, lastName, parentage, gender);
    }
}