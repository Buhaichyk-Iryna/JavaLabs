package lab3_java_buhaichyk.controller;

import lab3_java_buhaichyk.model.Faculty;
import lab3_java_buhaichyk.model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human headmaster) {
        return new Faculty(name, headmaster);
    }
}
