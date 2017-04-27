import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_Test {
    private WebDriver webDriver;

    WebDriver getWebDriver() {
        return webDriver;
    }

  @BeforeClass
      public static void webDriverManager(){
          FirefoxDriverManager.getInstance().version("15.0").setup();

      }
    @BeforeMethod
    public void setUp() {
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
