package unipar.br.demo;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class HelloController {
    @FXML
    private TextField Number1;

    @FXML
    private TextField Number2;

    @FXML
    private Label ShowResult;

    @FXML
    protected void soma() {
        //usado pra pegar o text field e transformar em int pra poder usar
        String Camp1= Number1.getText();
        String Camp2= Number2.getText();

        int Tvalor1 = Integer.parseInt(Camp1);
        int Tvalor2 = Integer.parseInt(Camp2);

        int Rvalor = Tvalor1 + Tvalor2;

        //Transforma o int em String pra exibir na label
        String Fvalor = Integer.toString(Rvalor);
        ShowResult.getText();
        System.out.println(Fvalor);

        ShowResult.setText(String.format("Resultado: %s", Fvalor ));
    }

    @FXML
    protected void divisao() {
        //usado pra pegar o text field e transformar em int pra poder usar
        String Camp1= Number1.getText();
        String Camp2= Number2.getText();

        int Tvalor1 = Integer.parseInt(Camp1);
        int Tvalor2 = Integer.parseInt(Camp2);

        if (Tvalor1 == 0 || Tvalor2 == 0) {
            ShowResult.setText(String.format("Não pode dividir por 0"));
        } else {
            int Rvalor = Tvalor1 / Tvalor2;

            //Transforma o int em String pra exibir na label
            String Fvalor = Integer.toString(Rvalor);
            ShowResult.getText();
            System.out.println(Fvalor);

            ShowResult.setText(String.format("Resultado: %s", Fvalor));
        }
    }

    @FXML
    protected void menos(){
        //usado pra pegar o text field e transformar em int pra poder usar
        String Camp1= Number1.getText();
        String Camp2= Number2.getText();

        int Tvalor1 = Integer.parseInt(Camp1);
        int Tvalor2 = Integer.parseInt(Camp2);

        int Rvalor = Tvalor1 - Tvalor2;

        //Transforma o int em String pra exibir na label
        String Fvalor = Integer.toString(Rvalor);
        ShowResult.getText();
        System.out.println(Fvalor);

        ShowResult.setText(String.format("Resultado: %s", Fvalor ));
    }

    @FXML
    protected void vezes() {
        //usado pra pegar o text field e transformar em int pra poder usar
        String Camp1= Number1.getText();
        String Camp2= Number2.getText();

        int Tvalor1 = Integer.parseInt(Camp1);
        int Tvalor2 = Integer.parseInt(Camp2);

        int Rvalor = Tvalor1 * Tvalor2;

        //Transforma o int em String pra exibir na label
        String Fvalor = Integer.toString(Rvalor);
        ShowResult.getText();
        System.out.println(Fvalor);

        ShowResult.setText(String.format("Resultado: %s", Fvalor ));
    }
}