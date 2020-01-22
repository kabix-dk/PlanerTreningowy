package sample.models.people;

public class Admin extends Person {
    public Admin(String username, String password) {
        super.username = username;
        super.password = password;
        super.rola = toString();
    }

    @Override
    public String toString() {
        return "Admin";
    }

    @Override
    public boolean showPlanList() {
        return true;
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
