package testbase;

import baseClass.BaseClass;
import pageObject.AdminPage;
import pageObject.OrangeHRMLoginPage;

public class Admin_pageTest extends BaseClass{
	
	OrangeHRMLoginPage login= new OrangeHRMLoginPage(driver );
	AdminPage adminpage=new AdminPage(driver);

}
