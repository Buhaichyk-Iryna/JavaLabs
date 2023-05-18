package lab3_java_buhaichyk.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends UniversityStructure{
    private String name;
    private Human head;
    private List<Department> departments;

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    @Override
    public String toString() {
        String result = "Faculty: " + name + '\n' +
                "Faculty head: " + head.toString() + '\n';
        for (Department department : departments) {
            result += department.toString() + '\n';
        }
        return result;
    }
}
