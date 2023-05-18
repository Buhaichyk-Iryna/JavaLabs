package lab3_java_buhaichyk;

import lab3_java_buhaichyk.controller.JsonManager;
import lab3_java_buhaichyk.controller.UniversityCreator;
import lab3_java_buhaichyk.model.University;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsonManagerTest {
    @Test
    public void JsonConvertTest() {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();

        JsonManager.SaveToFile(university, "university.json");
        University newUniversity = JsonManager.ReadFromFile("university.json");
        assertEquals(university, newUniversity);
    }
}
