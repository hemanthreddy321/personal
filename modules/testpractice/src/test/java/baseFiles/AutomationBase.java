package baseFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationBase {

    protected static WebDriver driver;
    protected static WebDriverWait wait;



    public String getUrl() {
        return driver.getCurrentUrl();
    }
    
}
