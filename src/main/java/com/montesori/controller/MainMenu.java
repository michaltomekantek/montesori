package com.montesori.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


import java.net.URL;
import java.util.ResourceBundle;

public class MainMenu implements Initializable {

    @FXML
    private Button loadImage;

    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("init");
    }

    @FXML
    public void load(){
        System.out.println("load");
    }
}
