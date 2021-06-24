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
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        HeaderServices hs = new HeaderServices();
        for (int i = 0; i < hs.allHeaders.size() && i<8; i++) {
            System.out.println(hs.allHeaders.get(i).getText());
        }


    }


}
