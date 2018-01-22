package com.chamodshehanka.talkToClient.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author chamodshehanka on 12/28/2017
 * @project TalkTo
 **/
public class StartTalkTo extends Application{

    public static boolean isSplashLoaded = false;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource(
                "/com/chamodshehanka/talkToClient/ui/fxml/SplashScreen.fxml"
        ));
        primaryStage.setScene(new Scene(parent));
        primaryStage.setTitle("TalkTo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
