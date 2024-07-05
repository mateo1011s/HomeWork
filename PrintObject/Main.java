package com.example.printobject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Juanpa", 26, "Universitary avenue");
        System.out.println(person);
    }
}