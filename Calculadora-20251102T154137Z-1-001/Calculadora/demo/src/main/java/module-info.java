module unipar.br.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens unipar.br.demo to javafx.fxml;
    exports unipar.br.demo;
}