package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label ShowResult;

    @FXML
    private TextField Name;

    @FXML
    private TextField Valor1;

    @FXML
    private TextField Valor2;

    @FXML
    private TextField Valor3;

    @FXML
    protected void onHelloButtonClick() {
        double valor1 = Double.parseDouble(Valor1.getText());
        double valor2 = Double.parseDouble(Valor2.getText());
        double valor3 = Double.parseDouble(Valor3.getText());

        String name = Name.getText();

        double Result = (valor1 + valor2 + valor3) / 3;

        if (Result >= 7) {
            ShowResult.setText(String.format("O aluno: " + name + " teve a média de " + Result + ", sendo aprovado"));
        } else if (Result <= 6.9 && Result >= 4.1) {
            ShowResult.setText(String.format("O aluno: " + name + " teve a média de " + Result + ", ficando de recuperação"));
        } else if (Result <= 4) {
            ShowResult.setText(String.format("O aluno: " + name + " teve a média de " + Result + ", sendo reprovado"));
        }
    }
}
