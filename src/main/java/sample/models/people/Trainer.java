package sample.models.people;

public class Trainer extends Person {
    public Trainer(String username, String password) {
        super.username = username;
        super.password = password;
        super.rola = toString();
    }

    @Override
    public String toString() {
        return "Trener";
    }
}
