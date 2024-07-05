package com.example.ownexception;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("In this program you can't divide by 4 or 0");
            System.out.println("Please enter two numbers:");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int division = division(number1,number2);
            System.out.println("The division is "+division);
        }
        catch (DivisionByFourOrZero e){
            System.out.println("Oops, something went wrong");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thanks for using :)");
            System.out.println();
        }

    }
    public static int division(int number1,int number2) throws DivisionByFourOrZero{
        if (number2==4){
            throw new DivisionByFourOrZero("You cannot divide by 4 in this program");
        }
        if (number2==0){
            throw new DivisionByFourOrZero("You cannot divide by 0 in this program");
        }
        return number1/number2;
    }
}

