package TEST;

import FUN.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.time.Duration;

public class BeforeAfterTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUP(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        baseURL = "https://orangehrm-demo-7x.orangehrmlive.com/auth/seamlessLogin";
        driver.get(baseURL);

    }

    @AfterTest
    public void endTest() throws IOException {
        String screenShotName = getClass().getName();
        Tools.screenshot(driver, screenShotName + ".jpg");
        driver.quit();

    }


}