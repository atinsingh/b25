package io.pragra.learning;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("I am line 9");
//        FileInputStream inputStream;
//        try {
//
//            int num1,num2;
//            System.out.println("Enter Number 1");
//            num1 = scanner.nextInt();
//            System.out.println("Enter Number 2 ");
//            num2 = scanner.nextInt();
//            System.out.println(num1/num2);
//            System.out.println("I am line 10");
//
//
//        }
//        catch (InputMismatchException  e){
//            System.out.println("Message **>" + e.getMessage());
//            throw e;
//
//        }  finally {
//            System.out.println("******* FINALY*******");
//        }
//
//
//
////
//
//
//
//        System.out.println("I am line 11");
//        System.out.println("I am line 12");


//         File file = new File("Readme.md");
//        try {
//            InputStream inputStream = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(10/0);
        User user = new User();
        System.out.println("Please key in first name");
        try {
            user.setFirstName(scanner.nextLine());
        } catch (UserDataException e) {
            e.printStackTrace();
        }

        System.out.println("Please key in Last name");
        try {
            user.setLastName(scanner.nextLine());
        } catch (UserDataException e) {
            e.printStackTrace();
        }

        System.out.println(user);

    }

    public static void createShirt(String color, ShirtSize size){
        System.out.println(color  + "  "+ size);
    }

    /*
        We need to develop user registration system
        FirstName -- should be atleast 8 chars
        LastName - should be 8 chars
        Age  - 0 - 100;

     */



}
