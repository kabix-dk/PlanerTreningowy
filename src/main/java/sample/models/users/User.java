package sample.models.users;

public class User {
    private UserState userState;

    private class LoggedInState extends UserState {

    }

    private class LoggedOutState extends UserState {

    }

    private final UserState ZALOGOWANY = new LoggedInState(),
                            WYLOGOWANY = new LoggedOutState();

    public User() {
        userState = WYLOGOWANY;
    }
}
