package sample.models.exercises;

import javafx.beans.property.SimpleStringProperty;

public abstract class Exercise {
    String name = toString();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
