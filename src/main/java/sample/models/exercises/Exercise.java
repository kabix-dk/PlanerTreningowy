package sample.models.exercises;

public abstract class Exercise {
    String name = toString();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Exercise: ";
    }
}
