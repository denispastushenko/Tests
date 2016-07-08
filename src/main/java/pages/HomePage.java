package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    @FindBy(xpath = "//span[text()='Sign In']")
    private static WebElement dropDowListSignIn;

    @FindBy(xpath = "//span[text()='SIGN IN']")
    private static WebElement linkSignIn;

    public HomePage(WebDriver webDriver) {super(webDriver);
    }

    public SignInPage actionButtonSignIn() throws NoSuchFieldException {
        Actions action = new Actions(Page.getDriver());
        action.click(dropDowListSignIn).build().perform();
        action.click(linkSignIn).build().perform();
        return new SignInPage(Page.getDriver());
    }
}


