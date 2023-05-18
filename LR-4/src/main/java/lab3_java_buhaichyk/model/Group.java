package lab3_java_buhaichyk.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private String groupName;
    private List<Student> students;

    public Group(String name) {
        this.groupName = name;
        this.students = new ArrayList();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        String result = "Group: " + groupName + '\n';
        for (Student student : students) {
            result += "Student: " + student.toString() + '\n';
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group group)) return false;
        return Objects.equals(groupName, group.groupName) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, students);
    }
}
