package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    @Test
    public void testUserCanGotoApps() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.clickOnAppsOption();
    }
    @Test
    public void testUserCanGoToTheGoogleSearchPage() throws InterruptedException {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.googleSearch();
    }
    @Test
    public void testUserCanGoToYouTubePage()  {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.youTubePage();
    }
    @Test
    public void testUserCanGoToGooglePlayPage()  {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.googlePlayPage();
        hm.captureScreenshot(driver,"GooglePlay");
    }
    @Test
    public void testUserCanGoToMeetAppPage()  {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.meetingApp();
    }
    @Test
    public void testUserCanGoToGoogleMap()  {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.mapApp();
    }
}
