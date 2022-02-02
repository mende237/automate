package com.automate.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;

public class ConvertController implements Initializable {
    @FXML
    private Button btnConvert;
    @FXML
    private Button btnSave;
    @FXML
    private SplitPane splitPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("la fenetre convert a ete lance!!!!!");
        this.splitPane.setDividerPositions(0.45);
    }

}