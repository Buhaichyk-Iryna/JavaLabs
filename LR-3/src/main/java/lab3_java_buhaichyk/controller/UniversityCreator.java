package lab3_java_buhaichyk.controller;

import lab3_java_buhaichyk.model.*;

public class UniversityCreator {
    public University createUniversity(String name, Human headmaster) {
        return new University(name, headmaster);
    }

    public University createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Human headmaster = new Human("Oleksandr", "Snow", "Oleksandr", Sex.MALE);
        University university = universityCreator.createUniversity("SUPER PRESTIGE MIT", headmaster);


        Human dean = new Human("Iryna", "Ydovik", "Michael", Sex.FEMALE);
        Faculty faculty = facultyCreator.createFaculty("Faculty of Information Technology", dean);
        university.addFaculty(faculty);


        Human head = new Human("Oleg", "Moroz", "Lion", Sex.MALE);
        Department department = departmentCreator.createDepartment("Programming", head);
        faculty.addDepartment(department);


        Group group = groupCreator.createGroup("Basic Java");
        department.addGroup(group);


        Student student1 = studentCreator.createStudent("Nastya", "Budz", "Mykola", Sex.FEMALE);
        Student student2 = studentCreator.createStudent("Iryna", "Buhaichyk", "Sergio", Sex.OTHER);
        group.addStudent(student1);
        group.addStudent(student2);

        System.out.println(university.toString());

        return university;
    }
}
