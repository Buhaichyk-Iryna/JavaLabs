package lab3_java_buhaichyk.model;

import java.util.Objects;

public abstract class UniversityStructure {
    protected String name;
    protected Human headmaster;

    public String getDepartamentName() {
        return name;
    }

    public void setUniversityName(String universityName) {
        this.name = universityName;
    }

    public Human getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(Human head) {
        this.headmaster = head;
    }
}
