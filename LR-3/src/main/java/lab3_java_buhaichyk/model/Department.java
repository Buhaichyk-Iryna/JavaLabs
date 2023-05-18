package lab3_java_buhaichyk.model;

import java.util.ArrayList;
import java.util.List;

public class Department extends UniversityStructure {
    private String name;
    private Human head;
    private List<Group> groups;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        this.groups = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    @Override
    public String toString() {
        String result = "Department: " + name + '\n' +
                "Department head: " + head.toString() + '\n';
        for (Group group : groups) {
            result += group.toString() + '\n';
        }
        return result;
    }
}
