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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getGroup(), student.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), group);
    }
}
