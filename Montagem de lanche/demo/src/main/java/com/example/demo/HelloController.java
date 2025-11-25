package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private ComboBox<String> ComboBoxChoice;

    @FXML
    private RadioButton radioButton1;

    @FXML
    private RadioButton radioButton2;

    @FXML
    private RadioButton radioButton3;

    @FXML
    private CheckBox CheckBox1;

    @FXML
    private CheckBox CheckBox2;

    @FXML
    private CheckBox CheckBox3;

    @FXML
    private CheckBox CheckBox4;

    @FXML
    private Label ResultAcom0;

    @FXML
    private Label ResultAcom1;

    @FXML
    private Label ResultAcom2;

    @FXML
    private Label ResultAcom3;

    @FXML
    private Label ResultAcom4;

    @FXML
    private TextField Name;

    @FXML
    private Label ClientName;

    @FXML
    private Label MeatChoice;

    @FXML
    private Label Bread;

    @FXML
    private String[] Choices = new String[]{"Frances", "Australiano", "Integral"};

    public void initialize() {
        this.ComboBoxChoice.getItems().addAll(Choices);

        ToggleGroup FleshType = new ToggleGroup();
        radioButton1.setToggleGroup(FleshType);
        radioButton2.setToggleGroup(FleshType);
        radioButton3.setToggleGroup(FleshType);


    }

    public void OnClick() {
        String SelectedBread = ComboBoxChoice.getValue();

        String name = Name.getText();
        ClientName.setText("Nome: " + name);

        if(ComboBoxChoice != null) {
            Bread.setText("Pão: " + SelectedBread);
        }

        if (radioButton1.isSelected()) {
            MeatChoice.setText("Carne: Frango");
        } else if (radioButton2.isSelected()) {
            MeatChoice.setText("Carne: Bovina");
        } else if (radioButton3.isSelected()) {
            MeatChoice.setText("Carne: Soja");
        }

        ResultAcom0.setText("Acompanhamentos:");
        if (CheckBox1.isSelected()) {
            ResultAcom1.setText("Queijo");
        }
        if (CheckBox2.isSelected()) {
            ResultAcom2.setText("Bacon");
        }
        if (CheckBox3.isSelected()) {
            ResultAcom3.setText("Salada");
        }
        if (CheckBox4.isSelected()) {
            ResultAcom4.setText("Molho");
        }


    }
}
