package lab3_java_buhaichyk.model;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex gender;

    public Human(String firstName, String lastName, String patronymic, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public Sex getGender() {
        return this.gender;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.patronymic + " " + this.gender;
    }
}
