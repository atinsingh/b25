package may21;

public interface ContractEmployee extends ReplacementEmployee, PermEmployee {
    String name = "Pooja"; // public static final
    void defineTerm();

    static void display() {
        System.out.println("I am from interface");
    }
}
