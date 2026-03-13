package pageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    WebDriver driver;
    //    By text = By.xpath("//*[@id='signInForm']/h1");
//    By btn = By.xpath("//*[@id='signInForm']/div[3]/a");
    @FindBy(xpath = "//*[@id='signInForm']/h1")
    private WebElement text;
    @FindBy(xpath = "//*[@id='signInForm']/div[3]/a")
    private WebElement btn;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String verifyPageHeading() {
//        String getHeadtext = driver.findElement(text).getText();
        String getHeadtext = text.getText();
        return getHeadtext;
    }

    public void clickOnNewUser() {
//        driver.findElement(btn).click();
        btn.click();
    }
}
