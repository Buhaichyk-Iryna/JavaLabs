package lab3_java_buhaichyk.controller;

import lab3_java_buhaichyk.model.Department;
import lab3_java_buhaichyk.model.Human;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}