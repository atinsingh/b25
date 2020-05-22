public class Automation {
    public void testOpenBroswer(WebDriver driver){
        System.out.println(driver.get());
    }

    public void closeBroswer(WebDriver driver){
        driver.quit();
    }
}
