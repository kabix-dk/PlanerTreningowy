package sample.utils;

import sample.models.people.Trainer;
import sample.models.users.User;

public class ActualUser {

    private static User user = new User("Daniel", "123", new Trainer("Daniel", "Kozak"));

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        ActualUser.user = user;
    }
}
