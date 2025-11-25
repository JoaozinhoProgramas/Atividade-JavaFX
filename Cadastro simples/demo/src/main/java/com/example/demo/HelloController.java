package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField Name;

    @FXML
    private TextField Age;


    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TableView tableView;

    @FXML
    private String[] Courses = new String[]{"Analise e desenvolvimento de sistemas","Direito","Filosofia","Educação Fisica", "Outro"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.comboBox.getItems().addAll(Courses);

        TableColumn name = new TableColumn("Nome");
        TableColumn age = new TableColumn("Idade");
        TableColumn courses = new TableColumn("Cursos");


        //TableView.ge().addAll(name, age, courses);
    }

    @FXML
    private void onAddButton() {
        String name = Name.getText();
        String age = Age.getText();

        String courses = comboBox.getValue();

        System.out.println(name);
        System.out.println(age);
        System.out.println(courses);
    }
}
