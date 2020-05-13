package io.pragra.b25.inherritance;

public class AdvanceCalculator extends Calculator {
    public int division(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a / b;
    }


    public void printSomething() {
        System.out.println(type);
    }
}



