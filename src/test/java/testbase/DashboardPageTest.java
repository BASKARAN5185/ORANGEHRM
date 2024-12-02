package testbase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.DashboardPage;
import pageObject.OrangeHRMLoginPage;

public class DashboardPageTest extends BaseClass {

	OrangeHRMLoginPage login = new OrangeHRMLoginPage(driver);
	DashboardPage Dashboard=new DashboardPage(driver);

	/*
	 * @Test(priority = 0) void loginTest000() { login.login("Admin", "admin123");
	 * String pageurl = login.LoginValidation(); Assert.assertNotEquals(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",
	 * pageurl);
	 * 
	 * }
	 */
	
	@Test(priority = 1,dependsOnMethods = {"loginTest010"})
	void PagenameVerify001() {
		String pagename = Dashboard.NameofthePageGet();
		Assert.assertEquals("Dashboard", pagename);

	}
	
	@Test(priority = 2)
	void clockpageVerify002() {
		String clockpage = Dashboard.clockiconclicking();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/attendance/punchIn", clockpage);
		Dashboard.Back();

	}
	
	@Test(priority = 3)
	void performancepageVerify003() {
		String performancepage = Dashboard.Mynotification();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/performance/myPerformanceReview", performancepage);
		Dashboard.Back();
	}
	
	
	@Test(priority = 4)
	void AssignleavepageVerify004() {
		String Assignleavepagetitle = Dashboard.Assignleaveclick();
		Assert.assertEquals("OrangeHRM", Assignleavepagetitle);
		Dashboard.Back();
	}
	
	
	@Test(priority = 5)
	void leaveListpageVerify005() {
		String leaveListpage = Dashboard.Leavelistclick();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList", leaveListpage);
		Dashboard.Back();
	}
	
	@Test(priority = 6)
	void timesheetpageVerify006() {
		String timesheeetpage = Dashboard.Timesheetclicing();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet", timesheeetpage);
		Dashboard.Back();
	}
	
	@Test(priority = 7)
	void ApplyleavepageVerify007() {
		String Applyleavepage = Dashboard.ApplyLeaveclicking();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave", Applyleavepage);
		Dashboard.Back();
	}
	
	@Test(priority = 8)
	void ApplyleavepageVerify008() {
		String Myleavepage = Dashboard.MyLeave();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewMyLeaveList", Myleavepage);
		Dashboard.Back();
	}
	
	@Test(priority = 9)
	void  mytimesheetpageVerify009() {
		String mytimeSheetpage = Dashboard.MyTimeSheet();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewMyTimesheet", mytimeSheetpage);
		Dashboard.Back();
	}
	
	@Test(priority = 9)
	void EmplloyeeLeavesettingVerify011() throws IOException {
		 Dashboard.employeeleavesettingicon();
		 Dashboard.employeeleaveclose();
		 System.out.println("close");
		 Dashboard.employeeleavesettingicon();
		 Dashboard.employeeleavecancel();
		 System.out.println("cancel");
		 Dashboard.employeeleavesettingicon();
		 Dashboard.employeeleavecheckbox();
		 System.out.println("click");
		 Dashboard.pageScreenshot("employeesettingcheckbox.png");
		 Dashboard.employeeleavesave();
		 
	}
	
	@Test(priority = 10)
	void  BUZpageVerify009() {
		String Buzpagepage = Dashboard.Buzpage1();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewMyTimesheet", Buzpagepage);
		Dashboard.Back();
	}
	
	@Test(priority = 10)
	void  elementscreenshot_employeeimg_TWBox_Qlbox_MAbox0010() throws IOException {
		Dashboard.getemployeeimage();
		System.out.println("dashimg_1");
		Dashboard.timetoworkboximg();
		System.out.println("dashimg_2");
		Dashboard.MyActionsBoximg();
		System.out.println("dashimg_3");
		Dashboard.QuicklunchBoximg();
		System.out.println("dashimg_4");
		Dashboard.pageScreenshot("dash1.png");
		System.out.println("dashimg_5");
		Dashboard.Scrollpage();
		System.out.println("dashimg_6");
		Dashboard.BUZlatestpostnoximg();
		System.out.println("dashimg_7");
		Dashboard.pageScreenshot("dash2.png");
		System.out.println("dashimg_8");
		
	}
	
	

    
	@Test(priority=12)
	void EmployeeDistributionbySubUnit() throws IOException {
		 Dashboard.Engineeringclicking();
		 Dashboard.Humanresoureclicking();
		 Dashboard.unassignedclicking();
		 Dashboard.pageScreenshot("circulechange.png");
	}
















}