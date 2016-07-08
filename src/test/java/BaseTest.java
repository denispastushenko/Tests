import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CheckPage;
import pages.HomePage;
import pages.Page;
import pages.SignInPage;

import java.awt.*;
import java.net.MalformedURLException;

public class BaseTest {
    public static final String SITE = "http://www.canadiantire.ca/en.html";
    protected HomePage homePage;
    protected SignInPage signInPage;
    protected CheckPage checkPage;

    @Before
    public void setUp() throws MalformedURLException, AWTException {
        System.setProperty("webdriver.chrome.driver", "Z:/Downloads/chromedriver.exe");
        homePage = new HomePage(new ChromeDriver());
        Page.getDriver().manage().window().maximize();
    }

    @After
    public void shoutDown() {
        if (Page.getDriver() != null) {
            Page.getDriver().quit();
        }
    }
}


