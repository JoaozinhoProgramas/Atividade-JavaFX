package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField GetNumber;

    @FXML
    private Label ShowResult;

    @FXML
    protected void OnCbuttonClick() {
        String Camp = GetNumber.getText();
        int valor = Integer.parseInt(Camp);

        double calc = (valor * 1.8) + 32;

        String Result = Double.toString(calc);
        this.ShowResult.setText(String.format("O resultado em C° é: %S", Result));
    }

    @FXML
    protected void OnFbuttonClick() {
        String Camp = GetNumber.getText();
        int valor = Integer.parseInt(Camp);

        double calc = ((valor - 32) * 5) / 9;

        String Result = Double.toString(calc);
        this.ShowResult.setText(String.format("O resultado em F° é: %S", Result));

    }

}
