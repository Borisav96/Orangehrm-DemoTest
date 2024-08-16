package POM;

import org.openqa.selenium.By;

public class AddCandidatePage {

    public static By fistNameTextFiled = By.id("addCandidateForm_firstName");
    public static By lastNameTextField = By.id("addCandidateForm_lastName");
    public static By vacancyOptionDown = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
    public static By vacancyOptionUp = By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']");
    //public static By browseCV = By.cssSelector(".oxd-file-input-div");
    public static By browseCV = By.className("oxd-file-input-div");
    public static By emailTextFiled = By.id("addCandidateForm_email");
    public static By saveButton = By.xpath("//button[@type='submit']");



}
