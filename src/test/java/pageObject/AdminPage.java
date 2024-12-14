package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClass;

public class AdminPage extends BaseClass {
	
	
	public AdminPage(RemoteWebDriver driver) {
	
		this.driver=driver;
	}

	
	//user management page locators
	By tableFilter = By.cssSelector("div.oxd-table-filter");
    By userManagement = By.xpath("//*[text() = \"User Management\"]");
    By systemUsers = By.xpath("//div[@id='app']/div/div/header/div[2]/nav/ul/li[2]");
    By nationalities = By.xpath("//*[text() = \"Nationalities\"]");
    By corporateBranding = By.xpath("//*[text() = \"Corporate Branding\"]");
    By brandingMenu = By.xpath("//div[@id='app']/div/div/header/div[2]/nav/ul/li[7]/span");
    By mainMenuIcon = By.cssSelector("svg.oxd-icon.oxd-main-menu-item--icon");
    By selectOption = By.xpath("//*[text() = \"-- Select --\"]");
    By typeForHints = By.xpath("//input[@placeholder = \"Type for hints...\"]");
    By passwordInput = By.xpath("//input[@type='password']");
    By secondPasswordInput = By.xpath("(//input[@type='password'])[2]");
    By submitButton = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space");
    By secondarySubmitButton = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--ghost");
    By selectText = By.cssSelector("div.oxd-select-text.oxd-select-text--focus > div.oxd-select-text-input");
    By passwordField = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[4]/div/div[2]/input");


    
	
	//Admin/User Management user mangement page
	 private By sideMenuAdmin = By.xpath("(//span[contains(@class,'oxd-text oxd-text--span')])[1]");
	    private By userManagement1 = By.xpath("//*[text() = \"User Management\"]");
	    private By systemUsers1 = By.xpath("//div[@id='app']/div/div/header/div[2]/nav/ul/li[2]");
	    private By addButton = By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[3]");
	    private By addUserPageVerify = By.xpath("(//h6[contains(@class,'oxd-text oxd-text--h6')])[2]");
	    private By userRoleDropdown = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	    private By employeeNameInput = By.xpath("//input[@placeholder='Type for hints...']");
	    private By statusDropdown = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	    private By usernameInput = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	    private By passwordInput1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	    private By confirmPasswordInput = By.xpath("(//input[@type='password'])[2]");
	    private By cancelButton = By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[1]");
	    private By saveButton = By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[2]");

	 
	    public void clickUserManagement() {
	        driver.findElement(userManagement).click();
	    }

	    
	    public void clickSystemUsers() {
	        driver.findElement(systemUsers).click();
	    }

	    
	    public void clickNationalities() {
	        driver.findElement(nationalities).click();
	    }

	    
	    public void clickCorporateBranding() {
	        driver.findElement(corporateBranding).click();
	    }

	    
	    public void openBrandingMenu() {
	        driver.findElement(brandingMenu).click();
	    }

	    
	    public void clickMainMenuIcon() {
	        driver.findElement(mainMenuIcon).click();
	    }

	    
	    public void selectOptionFromDropdown() {
	        driver.findElement(selectOption).click();
	    }

	    
	    public void enterHintText(String text) {
	        driver.findElement(typeForHints).sendKeys(text);
	    }

	    
	    public void enterPassword(String password) {
	        driver.findElement(passwordInput).sendKeys(password);
	    }

	    
	    public void enterSecondPassword(String password) {
	        driver.findElement(secondPasswordInput).sendKeys(password);
	    }

	    
	    public void clickSubmitButton() {
	        driver.findElement(submitButton).click();
	    }

	    
	    public void clickSecondarySubmitButton() {
	        driver.findElement(secondarySubmitButton).click();
	    }

	    
	    public void clickSelectText() {
	        driver.findElement(selectText).click();
	    }

	    
	    public void enterPasswordInField(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    
	    public void applyTableFilter(String filter) {
	        driver.findElement(tableFilter).sendKeys(filter);
	    }


	    
	    public void clickSideMenuAdmin() {
	        driver.findElement(sideMenuAdmin).click();
	    }

	    
	    public void clickUserManagement1() {
	        driver.findElement(userManagement1).click();
	    }

	    
	    public void clickSystemUsers1() {
	        driver.findElement(systemUsers1).click();
	    }

	    
	    public void clickAddButton() {
	        driver.findElement(addButton).click();
	    }

	    
	    public boolean isOnAddUserPage() {
	        return driver.findElement(addUserPageVerify).isDisplayed();
	    }

	    
	    public void selectUserRole(String role) {
	        driver.findElement(userRoleDropdown).click();
	        driver.findElement(By.xpath("//span[text()='" + role + "']")).click();
	    }

	   
	    public void enterEmployeeName(String employeeName) {
	        driver.findElement(employeeNameInput).sendKeys(employeeName);
	    }

	    
	    public void selectStatus(String status) {
	        driver.findElement(statusDropdown).click();
	        driver.findElement(By.xpath("//span[text()='" + status + "']")).click();
	    }

	    
	    public void enterUsername(String username) {
	        driver.findElement(usernameInput).sendKeys(username);
	    }

	    
	    public void enterPassword1(String password) {
	        driver.findElement(passwordInput1).sendKeys(password);
	    }

	    
	    public void confirmPassword(String password) {
	        driver.findElement(confirmPasswordInput).sendKeys(password);
	    }

	    
	    public void clickCancelButton() {
	        driver.findElement(cancelButton).click();
	    }

	    
	    public void clickSaveButton() {
	        driver.findElement(saveButton).click();
	    }
    
    
}
