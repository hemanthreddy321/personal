package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports getReport() {
        if (extent == null) {
            ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }

    public static ExtentTest createTest(String testName) {
        test = getReport().createTest(testName);
        return test;
    }

    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
