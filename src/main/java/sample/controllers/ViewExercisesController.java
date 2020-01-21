package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import sample.models.PlanIterator;

public class ViewExercisesController{
    @FXML
    public ImageView redArrowLeft;
    @FXML
    public ImageView redArrowRight;
    @FXML
    public Label currentExerciseLabel;

    private PlanIterator planIterator;

    @FXML
    public void initialize() {
        planIterator = new PlanIterator();
        setStartingExercise();
    }

    public void redArrowLeftAction() {
        currentExerciseLabel.setText(planIterator.Previous().getName());
        System.out.println("Poprzednie!");
    }

    public void redArrowRightAction() {
        currentExerciseLabel.setText(planIterator.Next().getName());
        System.out.println("Następne!");
    }

    public void setStartingExercise() {
        currentExerciseLabel.setText(planIterator.First().getName());
    }
}
