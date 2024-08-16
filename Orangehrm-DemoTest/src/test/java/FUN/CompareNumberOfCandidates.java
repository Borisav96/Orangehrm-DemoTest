package FUN;

import POM.OrangeWorkPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.io.IOException;

public class CompareNumberOfCandidates {

    public static void compareNumberOfCandidates (WebDriver driver, WebDriverWait wait) throws InterruptedException, IOException, AWTException {

        //Wait for page to load
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(OrangeWorkPage.recruitmentButton)));
        Thread.sleep(3000);
        //Click to Recruitment page
        driver.findElement(OrangeWorkPage.recruitmentButton).click();

        //Check number of candidates when page is loaded
        String numb = String.valueOf(driver.findElement(OrangeWorkPage.numberOfCandidates).getText());
        int originalNumber = Integer.parseInt(numb.substring(numb.length() - 2));
        System.out.printf("Original number of candidates is " + originalNumber);

        //Run AddCandidate function
        AddCandidate.addCandidate(driver, wait);

        //Wait for page to load
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(OrangeWorkPage.addCandidateBox)));
        Tools.scrollMouse(driver, -200);
        Thread.sleep(1000);

        //Check number of candidates after adding new candidate
        String numbb = String.valueOf(driver.findElement(OrangeWorkPage.numberOfCandidates).getText());
        int newNumber = Integer.parseInt(numbb.substring(numbb.length() - 2));
        System.out.printf("\nNew number of candidates is " + newNumber);
        Assert.assertEquals(newNumber - originalNumber, 1);

        //Delete newest added candidate
        driver.findElement(OrangeWorkPage.checkBox).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(OrangeWorkPage.deleteButton)));
        driver.findElement(OrangeWorkPage.deleteButton).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(OrangeWorkPage.confirmDeleteButton)));
        driver.findElement(OrangeWorkPage.confirmDeleteButton).click();

        //Wait for page to load
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(OrangeWorkPage.numberOfCandidates)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(OrangeWorkPage.logOutButton)));
        Thread.sleep(5000);

        //Check number of candidates after deleting newest one
        String numbbb = String.valueOf(driver.findElement(OrangeWorkPage.numberOfCandidates).getText());
        int newdeletedNumber = Integer.parseInt(numbbb.substring(numbbb.length() - 2));
        System.out.printf("\nNew number of candidates after delete is " + newdeletedNumber);
        Assert.assertEquals(newNumber - newdeletedNumber, 1);

        //Logout of the page
        driver.findElement(OrangeWorkPage.logOutButton).click();


    }

}
