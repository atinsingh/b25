public class Chrome implements WebDriver {
    @Override
    public Student getStudent(String name, Address address) {
        return null;
    }

    @Override
    public String get() {
        return "Opening Chrome with default site";
    }

    @Override
    public void quit() {
        System.out.println("Closeing chrome");
    }
}
