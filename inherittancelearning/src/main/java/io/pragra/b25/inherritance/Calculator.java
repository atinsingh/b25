package io.pragra.b25.inherritance;

public class Calculator {

    protected String type = "Simple Calculator";

    // Cant inherit privates
    // Can't inherit constructors
    //  Can't inherit static members

    public static void display() {
        System.out.println("Displaying");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}
