import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderServices
{

    public HeaderServices() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBys({@FindBy(xpath = "//header/div/div[4]/div[2]/div[2]/div/script[1]/following::a")})
    public List<WebElement> allHeaders;

}
