package may21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println(ContractEmployee.name);

        //Method reference

        printGreeting(name-> "Hello how are you, "+ name);
    }

    public static void printGreeting(IGreeting obj){
        System.out.println(obj.greet("Java Class"));
        obj.enjoy();
    }

}
