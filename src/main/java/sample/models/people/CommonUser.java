package sample.models.people;

public class CommonUser extends Person {
    public CommonUser(String username, String password) {
        super.username = username;
        super.password = password;
        super.rola = toString();
    }

    @Override
    public String toString() {
        return "Użytkownik";
    }
}
