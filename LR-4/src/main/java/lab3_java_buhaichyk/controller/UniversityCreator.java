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

        Human dean2 = new Human("Darya", "Dodon", "Oleg", Sex.FEMALE);
        Faculty faculty2 = facultyCreator.createFaculty("Faculty of Management", dean2);
        university.addFaculty(faculty2);

        Human head = new Human("Oleg", "Moroz", "Lion", Sex.MALE);
        Department department = departmentCreator.createDepartment("Programming", head);
        faculty.addDepartment(department);

        Human head2 = new Human("Pavlo", "Zero", "Alex", Sex.MALE);
        Department department2 = departmentCreator.createDepartment("English theory", head2);
        faculty.addDepartment(department2);

        Human head3 = new Human("Gregory", "Monday", "Sergio", Sex.MALE);
        Department department3 = departmentCreator.createDepartment("Literature", head3);
        faculty2.addDepartment(department3);

        Human head4 = new Human("Marina", "Friday", "Max", Sex.FEMALE);
        Department department4 = departmentCreator.createDepartment("Theory of Management", head4);
        faculty2.addDepartment(department4);

        Group group = groupCreator.createGroup("Basic Java");
        department.addGroup(group);
        Group group2 = groupCreator.createGroup("Management Theory");
        department.addGroup(group2);
        Group group3 = groupCreator.createGroup("Ancient Literature");
        department2.addGroup(group3);
        Group group4 = groupCreator.createGroup("Modern Literature");
        department2.addGroup(group4);
        Group group5 = groupCreator.createGroup("English Literature");
        department3.addGroup(group5);
        Group group6 = groupCreator.createGroup("Management Practice");
        department3.addGroup(group6);
        Group group7 = groupCreator.createGroup("Management Theory");
        department4.addGroup(group7);
        Group group8 = groupCreator.createGroup("Practice Theory");
        department4.addGroup(group8);


        Student student1 = studentCreator.createStudent("Nastya", "Budz", "Mykola", Sex.FEMALE);
        Student student2 = studentCreator.createStudent("Iryna", "Buhaichyk", "Sergio", Sex.OTHER);
        Student student3 = studentCreator.createStudent("Nastya", "Budz", "Mykola", Sex.FEMALE);
        Student student4 = studentCreator.createStudent("Iryna", "I", "A", Sex.OTHER);
        Student student5 = studentCreator.createStudent("S", "K", "Mykola", Sex.FEMALE);
        Student student6 = studentCreator.createStudent("Iryna", "Q", "U", Sex.OTHER);
        Student student7 = studentCreator.createStudent("Nastya", "j", "M", Sex.MALE);
        Student student8 = studentCreator.createStudent("Iryna", "W", "Sergio", Sex.OTHER);
        Student student9 = studentCreator.createStudent("G", "M", "T", Sex.FEMALE);
        Student student10 = studentCreator.createStudent("Iryna", "T", "P", Sex.MALE);
        Student student11 = studentCreator.createStudent("Nastya", "E", "Mykola", Sex.FEMALE);
        Student student12 = studentCreator.createStudent("F", "J", "Q", Sex.OTHER);
        Student student13 = studentCreator.createStudent("Nastya", "G", "Mykola", Sex.MALE);
        Student student14 = studentCreator.createStudent("Iryna", "B", "Z", Sex.OTHER);
        Student student15 = studentCreator.createStudent("Nastya", "D", "S", Sex.FEMALE);
        Student student16 = studentCreator.createStudent("X", "A", "Sergio", Sex.MALE);
        group.addStudent(student1);
        group.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group3.addStudent(student5);
        group3.addStudent(student6);
        group4.addStudent(student7);
        group4.addStudent(student8);
        group5.addStudent(student9);
        group5.addStudent(student10);
        group6.addStudent(student11);
        group6.addStudent(student12);
        group7.addStudent(student13);
        group7.addStudent(student14);
        group8.addStudent(student15);
        group8.addStudent(student16);

        //System.out.println(university.toString());

        return university;
    }
}
