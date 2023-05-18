package lab3_java_buhaichyk.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends UniversityStructure{
    private String facultyName;
    private Human head;
    private List<Department> departments;

    public Faculty(String name, Human head) {
        this.facultyName = name;
        this.head = head;
        this.departments = new ArrayList();
    }

    public String getDepartamentName() {
        return facultyName;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    @Override
    public String toString() {
        String result = "Faculty: " + facultyName + '\n' +
                "Faculty head: " + head.toString() + '\n';
        for (Department department : departments) {
            result += department.toString() + '\n';
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return Objects.equals(facultyName, faculty.facultyName) && Objects.equals(headmaster, faculty.headmaster) && Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyName, headmaster, departments);
    }
}
