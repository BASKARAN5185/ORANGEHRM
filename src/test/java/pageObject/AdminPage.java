package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClass;

public class AdminPage extends BaseClass {
	
	void Adminpage(RemoteWebDriver driver ){
		
		this.driver=driver;
	}
	
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
	By SideMenu_Admin=By.xpath("(//span[contains(@class,'oxd-text oxd-text--span')])[1]");
	//user management page
	By Addbutton=By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[3]");
	By Adduserpageverify=By.xpath("(//h6[contains(@class,'oxd-text oxd-text--h6')])[2]");
	By UserRole_DD=By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	By Emloyeename=By.xpath("//input[@placeholder='Type for hints...']");
	By Status_DD=By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By Username=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By Password=By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    By confirmpass=By.xpath("(//input[@type='password'])[2]");
    By cancel=By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[1]");
    By save=By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[2]");
    
    
}
