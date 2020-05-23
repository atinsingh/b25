package io.pragra.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

       try {


           try {

               try {
                   Scanner scanner = new Scanner(System.in);
                   //System.out.println(10/0);
                   scanner.nextInt();
               } catch (ArithmeticException ex) {
                   System.out.println("Im in innner block");
               }

           } catch (IndexOutOfBoundsException ex) {
               System.out.println("I am from outer block");
           }
       }catch (InputMismatchException ex) {
           System.out.println("MOst Outer");
       }

    }
}
