package lab3_java_buhaichyk.model;

import java.util.ArrayList;
import java.util.List;

public class University extends UniversityStructure{
    private String name;
    private Human headmaster;
    private List<Faculty> faculties;

    public University(String name, Human headmaster) {
        this.name = name;
        this.headmaster = headmaster;
        faculties = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(Human headmaster) {
        this.headmaster = headmaster;
    }

    public String getName() {
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
}
