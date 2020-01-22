package sample.models.users;

import sample.models.people.Person;
import sample.utils.DialogUtils;

public class User {
    private String login;
    private String haslo;
    private UserState userState;
    private Person person;

    public User(String login, String haslo, Person person) {
        this.login = login;
        this.haslo = haslo;
        userState = WYLOGOWANY;
        this.person = person;
    }

    private class LoggedInState extends UserState {
        public void logIn() {
            DialogUtils.dialogLogin();
        }

        public void logOut() {
            DialogUtils.dialogLogoutSuccess();
            userState = WYLOGOWANY;
        }
    }

    private class LoggedOutState extends UserState {
        public void logIn() {
            DialogUtils.dialogLoginSuccess();
            userState = ZALOGOWANY;
        }

        public void logOut() {
            DialogUtils.dialogLogout();
        }
    }

    private final UserState ZALOGOWANY = new LoggedInState(),
                            WYLOGOWANY = new LoggedOutState();

    public void logIn() {
        userState.logIn();
    }

    public void logOut() {
        userState.logOut();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean checkActualState() {
        if(userState == ZALOGOWANY) return true;
        else return false;
    }
}
