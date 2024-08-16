package POM;

import org.openqa.selenium.By;

public class OrangeWorkPage {

    public static By recruitmentButton = By.xpath("//body/div[@id='wrapper']/div/div[@id='inner-wrapper']/div[@id='left-menu']/div[@id='menu-container']/div[@id='main-menu']/div/div[@id='menu-content']/ul/li[@id='left_menu_item_15']/a[1]");
    public static By addCandidateButton = By.xpath("//div[text()='Add Candidate']");
    public static By numberOfCandidates = By.xpath("//li[@class='oxd-status-tab-panel-filter --selected']");
    public static By addCandidateBox = By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow']");
    public static By checkBox = By.cssSelector(".oxd-table-card:nth-child(1) .oxd-checkbox-wrapper svg");
    public static By deleteButton = By.xpath("//body/div[@id='wrapper']/div/div[@id='inner-wrapper']/div[@id='right-side']/section[@id='content']/div[@id='mount-vue-app']/div[@class='vue-container']/div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-list-card candidate-list']/div[@class='oxd-list-content']/div[@class='oxd-list-content-header']/div[@class='oxd-list-content-header --left']/div[@class='bulk-action-buttons']/button[2]");
    public static By confirmDeleteButton = By.xpath("//body[@class='overflow-hidden']/div[@id='wrapper']/div/div[@id='inner-wrapper']/div[@id='right-side']/section[@id='content']/div[@id='mount-vue-app']/div[@class='vue-container']/div[@class='oxd-overlay oxd-overlay--flex oxd-overlay--flex-centered']/div[@class='oxd-dialog-container-default']/div[@class='oxd-dialog-container-default--inner']/div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow']/div[@class='orangehrm-modal-footer']/button[2]");
    public static By logOutButton = By.xpath("//span[contains(text(),'Log Out')]");

}
