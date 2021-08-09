import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    boolean cleanTxtField = false;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtResultado;

    @FXML
    private TextField txtAlmacenValores;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnDeleteAll;

    @FXML
    private Button btnRaiz;

    @FXML
    private Button btnDividir;

    @FXML
    private Button btnSiete;

    @FXML
    private Button btnCuatro;

    @FXML
    private Button btnUno;

    @FXML
    private Button btnSigno;

    @FXML
    private Button btnOcho;

    @FXML
    private Button btnCinco;

    @FXML
    private Button btnDos;

    @FXML
    private Button btnCero;

    @FXML
    private Button btnNueve;

    @FXML
    private Button btnSeis;

    @FXML
    private Button btnTres;

    @FXML
    private Button btnPunto;

    @FXML
    private Button btnMultiplicar;

    @FXML
    private Button btnRestar;

    @FXML
    private Button btnSumar;

    @FXML
    private Button btnIgual;


    public boolean isEmptyResultado() {
        if (txtResultado.getText().equals("")) {
            return true;
        } 
        else return false;
    }

    public boolean isEmptyAlmacen() {
        if (txtAlmacenValores.getText().equals("")) {
            return true;
        } 
        else return false;
    }

    public boolean zeroAtStart() {
        if (isEmptyResultado() == false && txtResultado.getText().length() == 1 && txtResultado.getText().charAt(0) == '0') {
            return true;
        }
        else return false;
    }

    @FXML
    void Delete(ActionEvent event) {
        if (isEmptyResultado() == false) {
            txtResultado.setText(txtResultado.getText().substring(0, txtResultado.getText().length() - 1));
        }
    }

    @FXML
    void DeleteAll(ActionEvent event) {
        txtResultado.setText("");
        txtAlmacenValores.setText("");
    }

    @FXML
    void Signo(ActionEvent event) {
        
    }

    @FXML
    void Punto(ActionEvent event) {
        if (isEmptyResultado() == false) {
            txtResultado.setText(txtResultado.getText() + ".");
        }
    }

    @FXML
    void Sumar(ActionEvent event) {
        if (isEmptyResultado() == false && isEmptyAlmacen() == true) {
            txtAlmacenValores.setText(txtResultado.getText() + "+");
            txtResultado.setText("");
        }else if (isEmptyResultado() == false && isEmptyAlmacen() == false) {
            int valor1 = Integer.parseInt(txtResultado.getText());
            int valor2 = Integer.parseInt(txtAlmacenValores.getText().substring(0, txtAlmacenValores.getText().length()-1));
            int valor = valor1 + valor2;
            txtAlmacenValores.setText(String.valueOf(valor) + "+");
            cleanTxtField = true;
        }
    }

    @FXML
    void Restar(ActionEvent event) {

    }

    @FXML
    void Dividir(ActionEvent event) {

    }

    @FXML
    void Multiplicar(ActionEvent event) {

    }

    @FXML
    void Raiz(ActionEvent event) {

    }

    @FXML
    void Igual(ActionEvent event) {

    }

    @FXML
    void Cero(ActionEvent event) {
        if (zeroAtStart() == false){
            txtResultado.setText(txtResultado.getText() + "0");
        }
        else txtResultado.setText("0");
    }

    @FXML
    void Uno(ActionEvent event) {
        if (zeroAtStart() == false && cleanTxtField == false){
            txtResultado.setText(txtResultado.getText() + "1");
        }
        else if(zeroAtStart() == false && cleanTxtField == true){
            txtResultado.setText("1");
        }
    }

    @FXML
    void Dos(ActionEvent event) {
        if (zeroAtStart() == false && cleanTxtField == false){
            txtResultado.setText(txtResultado.getText() + "2");
        }
        else if(zeroAtStart() == false && cleanTxtField == true){
            txtResultado.setText("2");
        }
    }

    @FXML
    void Tres(ActionEvent event) {
        if (zeroAtStart() == false){
            txtResultado.setText(txtResultado.getText() + "3");
        }
        else txtResultado.setText("3");
    }

    @FXML
    void Cuatro(ActionEvent event) {
        if (zeroAtStart() == false){
            txtResultado.setText(txtResultado.getText() + "4");
        }
        else txtResultado.setText("4");
    }

    @FXML
    void Cinco(ActionEvent event) {
        if (zeroAtStart() == false){
            txtResultado.setText(txtResultado.getText() + "5");
        }
        else txtResultado.setText("5");
    }

    @FXML
    void Seis(ActionEvent event) {
        if (zeroAtStart() == false){
            txtResultado.setText(txtResultado.getText() + "6");
        }
        else txtResultado.setText("6");
    }

    @FXML
    void Siete(ActionEvent event) {
        if (zeroAtStart() == false){
            txtResultado.setText(txtResultado.getText() + "7");
        }
        else txtResultado.setText("7");
    }

    @FXML
    void Ocho(ActionEvent event) {
        if (zeroAtStart() == false){
            txtResultado.setText(txtResultado.getText() + "8");
        }
        else txtResultado.setText("8");
    }    

    @FXML
    void Nueve(ActionEvent event) {
        if (zeroAtStart() == false){
            txtResultado.setText(txtResultado.getText() + "9");
        }
        else txtResultado.setText("9");
    }


    @FXML
    void initialize() {
        assert txtResultado != null : "fx:id=\"txtResultado\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnDividir != null : "fx:id=\"btnDividir\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnSiete != null : "fx:id=\"btnSiete\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnCuatro != null : "fx:id=\"btnCuatro\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnUno != null : "fx:id=\"btnUno\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnSigno != null : "fx:id=\"btnSigno\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnOcho != null : "fx:id=\"btnOcho\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnCinco != null : "fx:id=\"btnCinco\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnDos != null : "fx:id=\"btnDos\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnCero != null : "fx:id=\"btnCero\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnNueve != null : "fx:id=\"btnNueve\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnSeis != null : "fx:id=\"btnSeis\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnTres != null : "fx:id=\"btnTres\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnPunto != null : "fx:id=\"btnPunto\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnMultiplicar != null : "fx:id=\"btnMultiplicar\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnRestar != null : "fx:id=\"btnRestar\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnSumar != null : "fx:id=\"btnSumar\" was not injected: check your FXML file 'Calculadora.fxml'.";
        assert btnIgual != null : "fx:id=\"btnIgual\" was not injected: check your FXML file 'Calculadora.fxml'.";

    }
}
