package may21;

public class SimpleDemo {
    private String name;
    public void display(){
        System.out.println("Diplaying");
    }

    public SimpleDemo(String name) {
        this.name = name;
    }

    class InnerDemo {

    }

    interface InnerDemoI {
        void fun();
    }


}
