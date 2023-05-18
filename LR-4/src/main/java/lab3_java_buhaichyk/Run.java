package lab3_java_buhaichyk;

import lab3_java_buhaichyk.controller.JsonManager;
import lab3_java_buhaichyk.controller.UniversityCreator;
import lab3_java_buhaichyk.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();

        JsonManager.SaveToFile(university, "university.json");
        University newUniversity = JsonManager.ReadFromFile("university.json");
        System.out.println(newUniversity.toString());
    }
}
