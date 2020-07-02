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
	public void AddrolesTest()
	{
		addrolespage.clickonAddrollButton();
		addrolespage.EnterRollName("All Roles");
		addrolespage.clickonHome();
		addrolespage.clickonMarketing();
		addrolespage.clickonSales();
		addrolespage.clickonCustomerService();
		addrolespage.clickonOperation();
		addrolespage.clickonShipping();
		addrolespage.clickonStorage();
		addrolespage.clickonAgentService();
		addrolespage.clickonReloservice();
		addrolespage.clickonProcurment();
		addrolespage.clickonBilling();
		addrolespage.clickonAccounts();
		addrolespage.clickonCustoms();
		addrolespage.clickonHR();
		addrolespage.clickonReports();
		addrolespage.clickonSettings();
		addrolespage.clickonActivities();
		addrolespage.clickonAnnouncement();
		addrolespage.clickonCalendar();
		addrolespage.clickonOnlineUser();
		addrolespage.clickonNotification();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement statusbutton=driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_ImgbtnSave']"));
		js.executeScript("arguments[0].scrollIntoView();", statusbutton);
		
		driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_ImgbtnSave']")).click();
		
		
	}

}
