package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import baseFiles.AutomationBase;
import io.cucumber.java.Before;

public class InteractionHooks extends AutomationBase{
    
    @Before
    public void openBrowser() {
        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--headless");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }
}
