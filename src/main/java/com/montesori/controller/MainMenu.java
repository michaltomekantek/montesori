package com.montesori.controller;

import com.montesori.model.ResizeParameter;
import com.montesori.service.ImageResizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;


import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainMenu implements Initializable {

    @FXML
    private Button loadImage;

    @FXML
    private TextField width;

    @FXML TextField hight;
    List<ResizeParameter> resizeParameters = new ArrayList<ResizeParameter>();


    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("init");
    }

    @FXML
    public void load(){
        FileChooser fileChooser = new FileChooser();
        List<File> files = fileChooser.showOpenMultipleDialog(null);

        for (File f: files) {
            ResizeParameter resizeParameter = ResizeParameter.builder()
                    .height(Integer.parseInt(hight.getText()))
                    .width(Integer.parseInt(width.getText()))
                    .file(f)
                    .build();
            resizeParameters.add(resizeParameter);
        }
    }



    public void resize(ActionEvent actionEvent) {
        ImageResizer.resizeImages(resizeParameters);

        //ImageResizer.resizeImage(imageToResize, imageOutputPath);
    }
}
