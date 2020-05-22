import java.nio.file.Path;
import java.nio.file.Paths;

public interface WebDriver {
    String get();
    void quit();

    Student getStudent(String name, Address address);


}
