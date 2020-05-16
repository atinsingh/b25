public class Person {
    private String name;


    public void display() {
        System.out.println("I am displaying from Person's class");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}


