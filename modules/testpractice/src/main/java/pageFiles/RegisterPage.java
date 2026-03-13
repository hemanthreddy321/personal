package pageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;
//    By text = By.xpath("//*[@id='signupForm']/h1");
    @FindBy(xpath="//*[@id='signupForm']/h1")
    private WebElement text;
    public RegisterPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String verifyPageHeading() {
//        String getHeadtext = driver.findElement(text).getText();
        String getHeadtext = text.getText();
        return  getHeadtext;
    }
}
