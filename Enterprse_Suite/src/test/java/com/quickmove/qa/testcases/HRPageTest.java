package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.AddRoomSettingpage;
import com.quickmove.qa.pages.HRPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class HRPageTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	HRPage hrpage;
	AddRoomSettingpage addroomsetting;
	String sheetname="Employee";
	public HRPageTest()
	{
		super();// it will call super class constructor
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 hrpage=new HRPage();
		 homepage.ClickOnHR();
		
}	


  @DataProvider public Object[][] AddEmployeeDetails() throws EncryptedDocumentException, IOException { 
	  
	  Object  data[][]=TestUtil.getTestData(sheetname); return data; }
 
	  @Test(priority=1, dataProvider="AddEmployeeDetails") 
	
	  public void AddEmployee(String empid,String empname,String Emplastname,String Mobile,String email,String pswd) throws InterruptedException {
	          Thread.sleep(3000);
	          hrpage.ClickOnAddemployeebutton();
	          hrpage.EnterEmployeeID(empid);
	          hrpage.EnterEmployeeFirstName(empname);
	          hrpage.EnterEmployeeLastName(Emplastname);
	          hrpage.EnterEmployeeMobile(Mobile);
	          hrpage.EnterEmployeeEmail(email);
	          hrpage.EnterEmployeeEmailPassowrd(pswd);
	          JavascriptExecutor js = (JavascriptExecutor) driver;
	      	WebElement statusbutton=driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_btnSave']"));
	      	js.executeScript("arguments[0].scrollIntoView();", statusbutton);
	          hrpage.SelectDepartment();
	          hrpage.SelectDesignation();
	         hrpage.Clickonsavebutton();
	         homepage.ClickOnHR();
	         Thread.sleep(3000);
				/*
				 * hrpage.createuser(); Thread.sleep(3000);
				 */
	       
	  }
	  @AfterMethod
	  public void teardown()
	  {
		 driver.quit();
	  }
}
