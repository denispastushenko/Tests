import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends Base_Test {
    @Test
    public void testMavenAndJavaTest()  {
        getWebDriver().get("https://jobs.dou.ua/companies/software-systems-and-applications/");
        String url = getWebDriver().getCurrentUrl();
        Assert.assertEquals(url,"https://jobs.dou.ua/companies/software-systems-and-applications/");
    }
}
