package lab3_java_buhaichyk.controller;

import com.google.gson.Gson;
import lab3_java_buhaichyk.model.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public class JsonManager {
    private static Gson gson = new Gson();
    public static String ConvertToJson(University university)
    {
        return gson.toJson(university);
    }

    public static University ReadFromJson(String json)
    {
        return gson.fromJson(json, University.class);
    }

    public static void SaveToFile(University university, String fileName)
    {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(ConvertToJson(university));
        } catch (IOException e) {

        }
    }

    public static University ReadFromFile(String fileName)
    {
        try (FileReader reader = new FileReader(fileName)) {

            StringBuilder content = new StringBuilder();
            int character;

            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }

            String text = content.toString();
            return ReadFromJson(text);

        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }
}
