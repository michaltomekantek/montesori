package com.montesori;

import com.montesori.controller.DragResizeMod;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ResizeParameter resizer!");

        Pane myPane = FXMLLoader.load(getClass().getResource("/mainmenu.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        primaryStage.setScene(myScene);
        primaryStage.show();


//        File file = new File("C:\\Users\\CP24\\Desktop\\ball.jpg");
//        ResizeParameter image = new ResizeParameter(file.toURI().toString());
//        ImageView iv = new ImageView(image);
//
//        System.out.println(iv);
//
//
//
//
//        primaryStage.setTitle("Drag Resize Demo");
//        Pane root = new Pane();
//
//        Rectangle rectangle = new Rectangle(50, 50);
//        rectangle.setFill(Color.BLACK);
//        DragResizeMod.makeResizable(iv, null);
//
//        Rectangle rectangle2 = new Rectangle(50, 50);
//        rectangle.setFill(Color.RED);
//        DragResizeMod.makeResizable(iv);
//
//        root.getChildren().addAll(iv);
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }
}
