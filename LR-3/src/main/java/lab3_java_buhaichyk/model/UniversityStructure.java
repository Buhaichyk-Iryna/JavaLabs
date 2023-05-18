package lab3_java_buhaichyk.model;

public abstract class UniversityStructure {
    private String name;
    private Human headmaster;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(Human head) {
        this.headmaster = head;
    }
}
