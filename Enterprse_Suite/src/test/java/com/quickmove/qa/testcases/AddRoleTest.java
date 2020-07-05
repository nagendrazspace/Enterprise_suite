package com.quickmove.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.AddRolesPage;
import com.quickmove.qa.pages.AddRoomSettingpage;
import com.quickmove.qa.pages.HRPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;

public class AddRoleTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	AddRoomSettingpage addroomsettingpage; 
	AddRolesPage addrolespage;
	HRPage hrpage;
	AddRoomSettingpage addroomsetting;

	public AddRoleTest()
	{
		super();// it will call super class constructor
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickonsettinglink();
		settingpage=new SettingPage();
		settingpage.verifysidebarlink();
		driver.findElement(By.xpath("//span[contains(text(),'Common')]")).click();
		Thread.sleep(3000);
		addroomsettingpage=new AddRoomSettingpage();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement roles=driver.findElement(By.xpath("//span[contains(text(),'Roles')]"));
		js.executeScript("arguments[0].scrollIntoView();", roles);
		
	//	addroomsettingpage.clickonUsermanagment();
		addroomsettingpage.ClickonRoles();
		 addrolespage=new AddRolesPage();
		
		
}	
	@Test
	public void AddrolesTest() throws InterruptedException
	{
		addrolespage.clickonAddrollButton();
		addrolespage.EnterRollName("All Roles");
		addrolespage.clickonHome();
		Thread.sleep(3000);
		addrolespage.clickonHomeuser();
		addrolespage.clickonMarketing();
		Thread.sleep(3000);
		addrolespage.clickonMarketinguser();
		Thread.sleep(3000);
		addrolespage.clickonSales();
		Thread.sleep(3000);
		addrolespage.clickonSalesuser();
		addrolespage.clickonCustomerService();
		Thread.sleep(3000);
		addrolespage.clickonCustomerServiceuser();
		addrolespage.clickonOperation();
		Thread.sleep(3000);
		addrolespage.clickonOperationuser();
		addrolespage.clickonShipping();
		Thread.sleep(3000);
		addrolespage.clickonShippinguser();
		addrolespage.clickonStorage();
		Thread.sleep(3000);
		addrolespage.clickonStorageuser();
		addrolespage.clickonAgentService();
		Thread.sleep(3000);
		addrolespage.clickonAgentServiceuser();
		addrolespage.clickonReloservice();
		Thread.sleep(3000);
		addrolespage.clickonRelouser();
		addrolespage.clickonProcurment();
		Thread.sleep(3000);
		addrolespage.clickonProcurmentuser();
		addrolespage.clickonBilling();
		Thread.sleep(3000);
		addrolespage.clickonBillinguser();
		addrolespage.clickonAccounts();
		Thread.sleep(3000);
		addrolespage.clickonAccountsuser();
		addrolespage.clickonCustoms();
		Thread.sleep(3000);
		addrolespage.clickonCustomsuser();
		addrolespage.clickonHR();
		Thread.sleep(3000);
		addrolespage.clickonHRuser();
		addrolespage.clickonReports();
		Thread.sleep(3000);
		addrolespage.clickonReportsuser();
		addrolespage.clickonSettings();
		Thread.sleep(3000);
		addrolespage.clickonSettingsuser();
		addrolespage.clickonActivities();
		Thread.sleep(3000);
		addrolespage.clickonActivitiesuser();
		addrolespage.clickonAnnouncement();
		Thread.sleep(3000);
		addrolespage.clickonAnnouncementuser();
		addrolespage.clickonCalendar();
		Thread.sleep(3000);
		addrolespage.clickonCalendaruser();
		addrolespage.clickonOnlineUser();
		Thread.sleep(3000);
		addrolespage.clickonNotification();
		Thread.sleep(3000);
		
		addrolespage.clickonNotificationuser();
	// inner sub menu 	
		addrolespage.clickoninnermenuhome();
		Thread.sleep(3000);
		addrolespage.Selecthome_DashBoard();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectMy_Account();
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
			
		addrolespage.SelectMarketing();
		Thread.sleep(3000);
		addrolespage.SelectMarketingsubmenucampaign();
		
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectSales(); 
		Thread.sleep(3000);
		addrolespage.SelectSalessubmenuAccounts();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.selectprocurement();
		Thread.sleep(3000);
		addrolespage.selectprocurement_vendor();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectAccounts();
		Thread.sleep(3000);
		addrolespage.SelectAccounts_Masters();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectAccounts_Voucher();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectAccounts_Ledger();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectAccounts_Financials();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectReports();
		Thread.sleep(3000);
		
		addrolespage.SelectReports_Sales();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectReports_Services();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectReports_Operation();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectReports_Shipping();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectReports_Storage();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectReports_Billing();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectSetting();
		Thread.sleep(3000);
		
		addrolespage.SelectSettingsubcommon();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectSetting_sub_User_mangment();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		addrolespage.SelectSetting_sub_Templates();
		Thread.sleep(3000);
		addrolespage.clickoninnermenusubmenuUSER();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement statusbutton=driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_ImgbtnSave']"));
		js.executeScript("arguments[0].scrollIntoView();", statusbutton);
		
		driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_ImgbtnSave']")).click();
		
		
	}

}
