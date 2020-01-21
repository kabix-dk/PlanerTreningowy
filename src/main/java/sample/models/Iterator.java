package sample.models;

import sample.models.exercises.Exercise;

public abstract class Iterator {
    public Exercise First() {
        return null;
    }
    public Exercise Next() {
        return null;
    }
    public boolean IsDone() { return false;}
    public Exercise CurrentItem() {
        return null;
    }
    public Exercise Previous() {
        return null;
    }
}
