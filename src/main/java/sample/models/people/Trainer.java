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

    @Override
    public boolean showPlanList() {
        return false;
    }

    @Override
    public boolean showRegisterPanel() {
        return true;
    }

    @Override
    public boolean showEditPanel() {
        return true;
    }
}
