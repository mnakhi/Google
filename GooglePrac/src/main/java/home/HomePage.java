package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(css = "a[title='Google apps']")
    WebElement appBtn;
    @FindBy(css = "a[href=\'https://www.google.com/webhp?tab=ww\']")
    WebElement searchBtn;
    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[2]/a")
    WebElement googleSearchBtn;
    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[4]/a")
    WebElement youTubeBtn;
    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[5]/a")
    WebElement playBtn;
    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[8]/a")
    WebElement meetBtn;
    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[3]/a")
    WebElement mapBtn;
    public void navigateToGoogle(){
        driver.get("https://www.google.com/?gws_rd=ssl");
    }
    public void clickOnAppsOption(){
        navigateToGoogle();
        appBtn.click();
    }
    public void googleSearch() throws InterruptedException {
        clickOnAppsOption();
        //js.executeScript("arguments[0].click();", sB);
        driver.switchTo().frame(0);
        googleSearchBtn.click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();

    }
    public void youTubePage()  {
        clickOnAppsOption();
        driver.switchTo().frame(0);
        youTubeBtn.click();
        driver.switchTo().defaultContent();
    }
    public void googlePlayPage()  {
        clickOnAppsOption();
        driver.switchTo().frame(0);
        playBtn.click();
        driver.switchTo().defaultContent();

    }
    public void meetingApp(){
        clickOnAppsOption();
        driver.switchTo().frame(0);
        meetBtn.click();
        driver.switchTo().defaultContent();
    }
    public void mapApp(){
        clickOnAppsOption();
        driver.switchTo().frame(0);
        mapBtn.click();
        driver.switchTo().defaultContent();
    }
}
