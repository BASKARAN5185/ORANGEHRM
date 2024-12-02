package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClass;

public class PIMPage  extends BaseClass {
	
		
		public PIMPage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
	}

		void Adminpage(RemoteWebDriver driver ){
			
			this.driver=driver;
		}
		
		// Define By objects for selectors
		By breadcrumb = By.cssSelector("h6.oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");
		By navTab = By.cssSelector("span.oxd-topbar-body-nav-tab-item");
		By employeeList = By.xpath("//*[text() = \"Employee List\"]");
		By addEmployee = By.xpath("//*[text() = \"Add Employee\"]");
		By reports = By.xpath("//*[text() = \"Reports\"]");
		By typeForHintsInput = By.xpath("//input[@placeholder = \"Type for hints...\"]");
		By inputField1 = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div[2]/div/div[2]/input");
		By selectOption = By.xpath("//*[text() = \"-- Select --\"]");
		By currentEmployeesOption = By.xpath("//*[text() = \"Current Employees Only\"]");
		By autoCompleteInput = By.cssSelector("div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--focus > input");
		By selectTextInput = By.cssSelector("div.oxd-select-text.oxd-select-text--focus > div.oxd-select-text-input");
		By ghostButton = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--ghost");
		By secondaryButton = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space");
		By mainTitle = By.cssSelector("h6.oxd-text.oxd-text--h6.orangehrm-main-title");
		By firstNameInput = By.xpath("//input[@placeholder = \"First Name\"]");
		By middleNameInput = By.xpath("//input[@placeholder = \"Middle Name\"]");
		By lastNameInput = By.xpath("//input[@placeholder = \"Last Name\"]");
		By employeeImageActionButton = By.cssSelector("button.oxd-icon-button.oxd-icon-button--solid-main.employee-image-action");
		By switchInput = By.cssSelector("span.oxd-switch-input.oxd-switch-input--active.--label-right");
		By radioInput = By.cssSelector("span.oxd-radio-input.oxd-radio-input--active.--label-right");
		By passwordInput1 = By.xpath("//input[@type='password']");
		By passwordInput2 = By.xpath("(//input[@type='password'])[2]");

		void Employeelistclick() {
			
			driver.findElement(employeeList).click();
		
		}
		
		void Addemplyeeclick() {
		
			driver.findElement(addEmployee).click();
		
		}
		
		void Reportclick() {
		
			driver.findElement(reports).click();
			
		}
		
		void firstname(String firstname ) {
			driver.findElement(firstNameInput).sendKeys(firstname);
		}
		
		void lastname(String lastname) {
		     driver.findElement(lastNameInput).sendKeys(lastname);	
		}

		void employeeimguploaf(String photoupload) {
			driver.findElement(employeeImageActionButton).sendKeys(photoupload);
			
		}
		
		void pass1(String pass) {
			driver.findElement(passwordInput1).sendKeys(pass);
		}
		
		void pass2(String pass2) {
			driver.findElement(passwordInput2).sendKeys(pass2);
		}
		
		
		
}
