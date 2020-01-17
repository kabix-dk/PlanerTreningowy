package sample.modelFX;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UserFX {
    private StringProperty login = new SimpleStringProperty();
    private StringProperty haslo = new SimpleStringProperty();

    public String getLogin() {
        return login.get();
    }

    public StringProperty loginProperty() {
        return login;
    }

    public void setLogin(String login) {
        this.login.set(login);
    }

    public String getHaslo() {
        return haslo.get();
    }

    public StringProperty hasloProperty() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo.set(haslo);
    }
}
