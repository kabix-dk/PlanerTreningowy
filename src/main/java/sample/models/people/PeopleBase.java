package sample.models.people;

import java.util.ArrayList;

public class PeopleBase extends Person{
    private ArrayList<Person> peopleList;

    public ArrayList<Person> getArray() {
        return peopleList;
    }
    public void addToArray(Person person) {
        peopleList.add(person);
    }
}
