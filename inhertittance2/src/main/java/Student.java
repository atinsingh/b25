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
      Automation automation = new Automation();
      WebDriver driver = new Chrome();
      automation.testOpenBroswer(driver);
      automation.closeBroswer(driver);

      // Ananous classes
        // java 8 changes in the interface
        // inhertittance in interface/
    }


}
