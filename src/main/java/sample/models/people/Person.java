package sample.models.people;

public abstract class Person {

    public String username;
    public String password;
    public String rola;

    private void changePassword() {

    }

    private void deleteAccount() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public boolean showExerciseBase() { return true; };
    public abstract boolean showPlanList();
    public abstract boolean showRegisterPanel();
    public abstract boolean showEditPanel();
    public boolean viewExercisesAction() { return true; };
}
