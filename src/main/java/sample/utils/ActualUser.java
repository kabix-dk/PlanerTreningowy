package sample.utils;

import sample.models.people.Admin;
import sample.models.people.PeopleBase;
import sample.models.people.Trainer;
import sample.models.users.User;

import java.util.ArrayList;

public class ActualUser {

    private static PeopleBase peopleBase = new PeopleBase();
    private static User user = new User("Daniel", "123", new Admin("Daniel", "Kozak"));
    private static ArrayList<User> users = new ArrayList<>();

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        ActualUser.user = user;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void addUserToBase(User user) {
        users.add(user);
    }

    public static PeopleBase getPeopleBase() {
        return peopleBase;
    }
}
