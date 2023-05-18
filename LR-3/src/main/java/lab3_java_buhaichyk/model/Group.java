package lab3_java_buhaichyk.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        String result = "Group: " + name + '\n';
        for (Student student : students) {
            result += "Student: " + student.toString() + '\n';
        }
        return result;
    }
}
