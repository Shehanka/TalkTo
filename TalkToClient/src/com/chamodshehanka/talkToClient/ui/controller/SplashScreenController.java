package com.chamodshehanka.talkToClient.ui.controller;

import com.chamodshehanka.talkToClient.main.StartTalkTo;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 12/28/2017
 * @project TalkTo
 **/
public class SplashScreenController implements Initializable{

    @FXML
    private AnchorPane root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (!StartTalkTo.isSplashLoaded) {
            loadSplashScreen();
        }
    }

    private void loadSplashScreen(){
        StartTalkTo.isSplashLoaded = true;
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource(
                    "/com/chamodshehanka/talkToClient/ui/fxml/SplashScreen.fxml"
            ));
            root.getChildren().setAll(pane);

            FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), pane);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);

            fadeIn.setCycleCount(1);

            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), pane);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);

            fadeIn.play();

            fadeIn.setOnFinished((e) -> fadeOut.play());

            fadeOut.setOnFinished((e) -> {
                try {
                    AnchorPane parentContent = FXMLLoader.load(getClass().getResource(
                            "/com/chamodshehanka/talkToClient/ui/fxml/LoginUI.fxml"
                    ));
                    root.getChildren().setAll(parentContent);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
