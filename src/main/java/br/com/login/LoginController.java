package br.com.login;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;

    public void entrar() {
        System.out.println("O e-mail é: " + campoEmail.getText());
        System.out.println("A senha é: " + campoSenha.getText());
    }
}
