package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver=null;
    public static JavascriptExecutor js;

    @BeforeMethod
    public void setUp() {
        // Launch google chrome
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\hp\\IdeaProjects\\Google\\Generic\\src\\main\\java\\driver\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        this.js = (JavascriptExecutor) driver;
        this.driver.manage().window().fullscreen();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.driver.manage().deleteAllCookies();
        this.driver.get("https://www.google.com/?gws_rd=ssl");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser.
        this.driver.close();
    }
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "//screenshots//" + screenshotName +  ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
            ;
        }

    }
}
