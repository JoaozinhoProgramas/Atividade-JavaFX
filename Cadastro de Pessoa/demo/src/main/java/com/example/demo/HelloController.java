package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private TextField Name;

    @FXML
    private TextField Age;

    @FXML
    private ChoiceBox <String> Choice;

    @FXML
    private String[] Gender = {"Masculino", "Femenino"};

    @FXML
    private CheckBox Sports;

    @FXML
    private Label ShowName;

    @FXML
    private Label ShowAge;

    @FXML
    private Label ShowGender;

    @FXML
    private Label ShowSports;

    //Cria as opçoes no menu de sexo
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Choice.getItems().addAll(Gender);
        Choice.setOnAction(this::onGenderClick);
    }

    @FXML
    protected void onButtonClick() {
        String name = Name.getText();
        String age = Age.getText();

        Boolean sport = Sports.isSelected();

        if (sport != true) {
            this.ShowName.setText(name);
            this.ShowAge.setText(age);
            this.ShowSports.setText("Não gosta de esportes");
        } else {
            this.ShowName.setText(name);
            this.ShowAge.setText(age);
            this.ShowSports.setText("Gosta de esportes");
        }
    }

    private void onGenderClick(ActionEvent event) {
        String gender = Choice.getValue();
        this.ShowGender.setText(gender);
    }
}
