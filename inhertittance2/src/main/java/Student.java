public class Student extends InterMediateStudent {

    private String className;

    public void setClassName(String className) {
        this.className = className;
    }

    void studentInfo(){}

    @Override
    public void display() {
        System.out.println("From Student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                '}';
    }

    public static void main(String[] args) {
       Person p1 = new InterMediateStudent();
       p1.display();

       IPrint print = new LinuxPrinter();

       PrinterManager obj = new PrinterManager();

       obj.print(print);
    }


}
