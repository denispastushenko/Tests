package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckPage extends  Page {

    @FindBy(xpath = "//div[@class='dashboard-welcome__welcome-msg']")
    private WebElement autorizationLoginLable;

    public CheckPage(WebDriver webDriver) {super(webDriver);
    }

    public void checkTestDone(){
        Assert.assertEquals(autorizationLoginLable.getText(),"Welcome, dpastushenko1996@gmail.com");
    }
}
