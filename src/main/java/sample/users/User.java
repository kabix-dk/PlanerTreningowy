package sample.users;

import sample.models.users.UserState;

public class User {
    private sample.models.users.UserState userState;

    private class LoggedInState extends sample.models.users.UserState {

    }

    private class LoggedOutState extends sample.models.users.UserState {

    }

    private final UserState ZALOGOWANY = new LoggedInState(),
                            WYLOGOWANY = new LoggedOutState();

    public User() {
        userState = WYLOGOWANY;
    }
}
