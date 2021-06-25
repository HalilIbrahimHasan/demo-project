import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicTests {



    public BasicTests(){

    }
    @Test
    public void test1(){

        Driver.getDriver().get("https://www.amazon.com");
        System.out.println(Driver.getDriver().getTitle());



    }


}
