package FUN;

import POM.AddCandidatePage;
import POM.OrangeLogInPage;
import POM.OrangeWorkPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AddCandidate {

    public static void addCandidate (WebDriver driver, WebDriverWait wait) throws InterruptedException, IOException, AWTException {

        //Define current date, as String
        String currentDate = String.valueOf(java.time.LocalDate.now());
        //Wait for page to load
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(OrangeWorkPage.addCandidateButton)));
        //Go to add candidate, and enter information
        driver.findElement(OrangeWorkPage.addCandidateButton).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(AddCandidatePage.fistNameTextFiled)));
        driver.findElement(AddCandidatePage.fistNameTextFiled).click();
        driver.findElement(AddCandidatePage.fistNameTextFiled).sendKeys("QA Automation");
        driver.findElement(AddCandidatePage.lastNameTextField).click();
        driver.findElement(AddCandidatePage.lastNameTextField).sendKeys(currentDate);
        //Click on dropdown manu end click on first option
        Actions moveMouse = new Actions(driver);
        driver.findElement(AddCandidatePage.vacancyOptionDown).click();
        moveMouse.moveToElement(driver.findElement(AddCandidatePage.vacancyOptionUp), 0, 110).perform();
        moveMouse.click().perform();

        //Create new txt file in Project folder
        String cvPath = Tools.newFile("CVName.txt");
        driver.findElement(AddCandidatePage.browseCV).click();
        Robot rb = new Robot();

        //Copying File path to Clipboard
        StringSelection str = new StringSelection(cvPath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        //Press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        //Release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        //For pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        //Enter random String for email
        driver.findElement(AddCandidatePage.emailTextFiled).sendKeys(RandomStringUtils.randomAlphabetic(5).toLowerCase() + "@gmail.com");

        //Scroll down on page and click on save button
        Tools.scrollMouse(driver, 200);
        Thread.sleep(1000);
        driver.findElement(AddCandidatePage.saveButton).click();
        Thread.sleep(1000);
    }








    }


