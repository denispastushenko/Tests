import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
          ChromeDriverManager.getInstance().setup();

      }
    @BeforeMethod
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
