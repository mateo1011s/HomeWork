package com.example.pojo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Cien años de soledad", "Gabriel García Márquez", 417);
        System.out.println(book1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add new information");
        String newName = scanner.nextLine();
        String newAuthor = scanner.nextLine();
        int newPags = scanner.nextInt();

        book1.setTitle(newName);
        book1.setAuthor(newAuthor);
        book1.setPags(newPags);
        System.out.println("Actualized information of book: " + book1);
    }
}