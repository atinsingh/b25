import java.nio.file.Path;
import java.nio.file.Paths;

public class Learning {
    public Learning(){
        this("ABC");
    }

    public Learning(String str) {
        System.out.println(str);
    }

    public Learning(String str, int age){
        System.out.println(str  +  age);
    }

    public void anyMethod(){
        System.out.println("I am from Parent");
    }
}
