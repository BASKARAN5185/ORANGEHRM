package testbase;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.OrangeHRMLoginPage;
import pageObject.PIMPage;

public class PIMPageTest extends BaseClass{
	
	PIMPage pim=new PIMPage(driver);
	OrangeHRMLoginPage login = new OrangeHRMLoginPage(driver);
    
	@Test
	void userlogin () {
		login.login("Admin", "admin123");
	}

    @Test
    void Employeecreation () {
     pim.pinpage();
	 pim.Employeelistclick();
	 pim.Addemplyeeclick();
	 pim.firstname("Anya");
	 pim.lastname("forger");
	 pim.pass1("123");
	 pim.pass2("123");
 }
}