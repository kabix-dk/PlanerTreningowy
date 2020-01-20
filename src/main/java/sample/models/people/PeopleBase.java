package sample.models.people;

import java.util.ArrayList;

public class PeopleBase extends Person{
    private ArrayList<Person> peopleList = new ArrayList<Person>();

    public void addToArray(Person person) {
        peopleList.add(person);
    }
    public ArrayList<Person> getArray() {
        return peopleList;
    }
}
