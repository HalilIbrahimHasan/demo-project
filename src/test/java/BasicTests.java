import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTests {

    public WebDriver driver;

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Driver is being set-up");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

    }


}
