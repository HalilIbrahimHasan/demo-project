import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicTests {

    protected static WebDriver driver;

    public BasicTests(){

    }
    @Test
    public void test1(){
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("environment"));
        System.out.println(driver.getTitle());
    }


}
