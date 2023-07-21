package br.com.login;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginController {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;

    public void entrar() {

        boolean emailValido = campoEmail.getText().equals("jojorsg@gmail.com");
        boolean senhaValido = campoSenha.getText().equals("admin123!");

        if (emailValido && senhaValido) {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("Login efetuado com sucesso!")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("Usuário e/ou senha inválidos!")
                    .showInformation();
        }
    }
}
