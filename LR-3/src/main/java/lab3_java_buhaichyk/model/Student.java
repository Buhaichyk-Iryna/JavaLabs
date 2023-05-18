package lab3_java_buhaichyk.model;

import java.util.Objects;

public class Student extends Human {
    private Group group;

    public Student(String firstName, String lastName, String patronymic, Sex gender, Group group) {
        super(firstName, lastName, patronymic, gender);
        this.group = group;
    }

    public Student(String firstName, String lastName, String patronymic, Sex gender) {
        super(firstName, lastName, patronymic, gender);
    }

    public Group getGroup() {
        return this.group;
    }
}
