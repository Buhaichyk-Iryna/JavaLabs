package lab3_java_buhaichyk.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University extends UniversityStructure{
    private List<Faculty> faculties;

    public University(String name, Human headmaster) {
        this.name = name;
        this.headmaster = headmaster;
        faculties = new ArrayList<>();
    }

    public void setUniversityName(String universityName) {
        this.name = universityName;
    }

    public Human getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(Human headmaster) {
        this.headmaster = headmaster;
    }

    public String getDepartamentName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        String result = "University: " + name + '\n' +
                "Headmaster: " + headmaster.toString() + '\n';
        for (Faculty faculty : faculties) {
            result += faculty.toString() + '\n';
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(headmaster, that.headmaster) && Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculties);
    }
}
