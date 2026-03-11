package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ScreenshotUtil {
    public static String captureScreenshot(WebDriver driver, String screenshotName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("screenshots/" + screenshotName + ".png");
            dest.getParentFile().mkdirs();
            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return dest.getAbsolutePath();
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
            return null;
        }
    }
}
