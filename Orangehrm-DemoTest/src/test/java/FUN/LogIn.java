package FUN;

import POM.OrangeLogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {

    public static void logIn (WebDriver driver, WebDriverWait wait){

        //Login on the page as admin
        driver.findElement(OrangeLogInPage.roleButton).click();
        driver.findElement(OrangeLogInPage.adminButton).click();
        driver.findElement(OrangeLogInPage.loginButton).click();

    }

}
