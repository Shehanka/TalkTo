package com.chamodshehanka.talkToClient.ui.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 12/28/2017
 * @project TalkTo
 **/

public class LoginUIController implements Initializable{

    @FXML
    private AnchorPane rootLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void learnMoreAboutTalkTo(){
        try {
            Desktop.getDesktop().browse(new URI("http://www.chamodshehanka.com"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
