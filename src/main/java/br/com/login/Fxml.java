package br.com.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class Fxml extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String arquivoCSS = getClass().getResource("/Login.css").toExternalForm();
        URL arquivoFXML = getClass().getResource("/Login.fxml");
        GridPane raiz = FXMLLoader.load(arquivoFXML);

        Scene cena = new Scene(raiz, 400, 450);
        cena.getStylesheets().addAll(arquivoCSS);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Tela de Login");
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
