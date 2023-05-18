package lab3_java_buhaichyk.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department extends UniversityStructure {
    private String departamentName;
    private Human head;
    private List<Group> groups;

    public Department(String name, Human head) {
        this.departamentName = name;
        this.head = head;
        this.groups = new ArrayList();
    }



    public String getDepartamentName() {
        return departamentName;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    @Override
    public String toString() {
        String result = "Department: " + departamentName + '\n' +
                "Department head: " + head.toString() + '\n';
        for (Group group : groups) {
            result += group.toString() + '\n';
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return Objects.equals(departamentName, departamentName) && Objects.equals(head, that.head) && Objects.equals(groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamentName, head, groups);
    }
}
