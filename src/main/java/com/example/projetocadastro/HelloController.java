package com.example.projetocadastro;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
   String[] siglas = {"AC", "BA", "CE", "PR", "DF", "SP"};
    @FXML
    ComboBox<String> comboUF = new ComboBox<>();

    @Override
    public  void  initialize(URL location, ResourceBundle resources){
        comboUF.getItems().addAll(siglas);
    }

}