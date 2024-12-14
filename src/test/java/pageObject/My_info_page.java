package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClass;

public class My_info_page extends BaseClass {
	
	public My_info_page(RemoteWebDriver driver) {
		this.driver=driver ;
		
	}
	
	 //My info page menu locators 
	 By personalDetailsLink = By.xpath("//*[text() = 'Personal Details']");
     By contactDetailsLink = By.xpath("//*[text() = 'Contact Details']");
     By emergencyContactsLink = By.xpath("//*[text() = 'Emergency Contacts']");
     By dependentsLink = By.xpath("//*[text() = 'Dependents']");
     By immigrationLink = By.xpath("//*[text() = 'Immigration']");
     By jobLink = By.xpath("//*[text() = 'Job']");
     By salaryLink = By.xpath("//*[text() = 'Salary']");
     By reportToLink = By.xpath("//*[text() = 'Report-to']");
     By qualificationsLink = By.xpath("//*[text() = 'Qualifications']");
     By membershipsLink = By.xpath("//*[text() = 'Memberships']");
     By firstNameField = By.xpath("//input[@placeholder = 'First Name']");
     By middleNameField = By.xpath("//input[@placeholder = 'Middle Name']");
     By lastNameField = By.xpath("//input[@placeholder = 'Last Name']");
     By dateOfBirthField = By.xpath("//input[@placeholder = 'yyyy-dd-mm']");
     By datePickerDay = By.xpath("//*[text() = '8']");
     By selectDropdown = By.xpath("//*[text() = '-- Select --']");
     By selectButton = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space");
     By bloodGroupField = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div/div/div/div[2]/input");
     By bloodGroupOption = By.xpath("//*[text() = 'A+']");
     By submitButton = By.cssSelector("div.orangehrm-card-container > form.oxd-form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space");


     
     public void enterFirstName(String firstName) {
         driver.findElement(firstNameField).sendKeys(firstName);
     }

     
     public void enterMiddleName(String middleName) {
         driver.findElement(middleNameField).sendKeys(middleName);
     }

     
     public void enterLastName(String lastName) {
         driver.findElement(lastNameField).sendKeys(lastName);
     }

     
     public void selectDateOfBirth() {
         driver.findElement(dateOfBirthField).click();
         driver.findElement(datePickerDay).click();  // Selecting the 8th as an example
     }

     
     public void selectDropdownOption() {
         driver.findElement(selectDropdown).click();
     }

    
     public void clickButton() {
         driver.findElement(selectButton).click();
     }

    
     public void setBloodGroup() {
         driver.findElement(bloodGroupField).click();
         driver.findElement(bloodGroupOption).click();
     }

    
     public void submitForm() {
         driver.findElement(submitButton).click();
     }
     
     public void clickPersonalDetails() {
         driver.findElement(personalDetailsLink).click();
     }

     
     public void clickContactDetails() {
         driver.findElement(contactDetailsLink).click();
     }

     
     public void clickEmergencyContacts() {
         driver.findElement(emergencyContactsLink).click();
     }

     
     public void clickDependents() {
         driver.findElement(dependentsLink).click();
     }

     
     public void clickImmigration() {
         driver.findElement(immigrationLink).click();
     }

     
     public void clickJob() {
         driver.findElement(jobLink).click();
     }

     
     public void clickSalary() {
         driver.findElement(salaryLink).click();
     }

     
     public void clickReportTo() {
         driver.findElement(reportToLink).click();
     }

     
     public void clickQualifications() {
         driver.findElement(qualificationsLink).click();
     }

     
     public void clickMemberships() {
         driver.findElement(membershipsLink).click();
     }
 }


