package com.example.project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private char nowSym = 'x';

    @FXML
    void btnClick(ActionEvent event) {
        ((Button)event.getSource()).setText(String.valueOf(nowSym));
        nowSym = nowSym == 'x' ? '0' : 'x';
    }

    @FXML
    void initialize() {

    }

}


