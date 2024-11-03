package com.example.demo9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    public VBox main_vbox;
    public static Stage stage;


    private void main_vbox(Object load) {
    }

    public void stack_button(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sta.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        HelloController.stage = stage;
        HelloController.stage = stage;
        stage.show();
        HelloApplication.stage.close();
    }

    public void hease_button(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hash.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        HelloController.stage = stage;
        HelloApplication.stage.close();
        stage.show();
    }

    public void heap_button(ActionEvent event) {
    }

    public void queue_button(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("que.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        HelloController.stage = stage;
        HelloApplication.stage.close();
        stage.show();
    }

    public void bst_button(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("for bst.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        HelloController.stage = stage;
        HelloApplication.stage.close();
        stage.show();

    }



}