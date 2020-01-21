package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import sample.models.PlanIterator;

public class ViewExercisesController{
    @FXML
    public ImageView redArrowLeft;
    @FXML
    public Label currentExerciseLabel;
    @FXML
    public ImageView redArrowRight;

    private PlanIterator planIterator;

    @FXML
    public void initialize() {
        planIterator = new PlanIterator();
        setStartingExercise();
    }

    public void redArrowLeftAction() {
        currentExerciseLabel.setText(planIterator.Previous().getName());
    }

    public void redArrowRightAction() {
        currentExerciseLabel.setText(planIterator.Next().getName());
    }

    public void setStartingExercise() {
        currentExerciseLabel.setText(planIterator.First().getName());
    }
}
