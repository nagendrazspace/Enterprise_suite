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
import com.quickmove.qa.pages.procurment;
import com.quickmove.qa.util.TestUtil;

public class Procurment_vendor extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	HRPage hrpage;
	procurment Proc;
	AddRoomSettingpage addroomsetting;
	String sheetname="Addvendor";
	String sheetname1="Addvendor2";
	public Procurment_vendor()
	{
		super();// it will call super class constructor
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		 homepage=new HomePage();
		 homepage.CLICKonProcurment();
		 homepage.clickonhomepgesidemenu();
		 Proc=new procurment();
	//	 Proc.ClickOnvendor();
		 Proc.ClickOnOrganization();
		 
}	

 @DataProvider public Object[][] Addvendor() throws EncryptedDocumentException, IOException {
  
 Object data[][]=TestUtil.getTestData(sheetname);
 return data;
 }
  
  @Test(priority=1, dataProvider="Addvendor")
	public void Addvendor(String Vendorname,String industrytpe,String Emobile,String Email,String Category,String Service,String adress,String country,String state,String city,String zip) throws InterruptedException {    
		Proc.Clickonaddbutton();
		Proc.EnterVendorName(Vendorname);
		Proc.Selectindsutrytype(industrytpe);
		Proc.EnterMobile(Emobile);
		Proc.EnterEmployeeEmail(Email);
		Proc.Selectcategory(Category);
		Thread.sleep(3000);
		Proc.SelectService(Service);
		Thread.sleep(3000);
		Proc.clickoncheckbox();
		Proc.Cliconsavebutton();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
	      	WebElement statusbutton=driver.findElement(By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_AccountAddresss_txtAddress']"));
	      	js.executeScript("arguments[0].scrollIntoView();", statusbutton);
		Proc.Enteraddress(adress);
		Proc.Selectcountry(country);
		Thread.sleep(3000);
		Proc.Selectstate(state);
		Thread.sleep(3000);
		Proc.Selectcity(city);
		Thread.sleep(3000);
		Proc.Enterzipcode(zip);
		Proc.Clickonaddresssavebutton();
		Proc.clickonupdate();
		
		
		

	       
	  }

		/*
		 * @DataProvider public Object[][] Addvendor2() throws
		 * EncryptedDocumentException, IOException {
		 * 
		 * Object data[][]=TestUtil.getTestData(sheetname1); return data; }
		 * 
		 * @Test(priority=0, dataProvider="Addvendor2") public void Addvendor21(String
		 * Vendorname,String industrytpe,String Category,String Service,String
		 * adress,String country,String state,String city,String zip) throws
		 * InterruptedException { Proc.Clickonaddbutton();
		 * Proc.EnterVendorName(Vendorname); Proc.Selectindsutrytype(industrytpe); //
		 * Proc.EnterMobile(Emobile); // Proc.EnterEmployeeEmail(Email);
		 * Proc.Selectcategory(Category); Proc.SelectService(Service);
		 * Proc.clickoncheckbox(); Proc.Cliconsavebutton(); JavascriptExecutor js =
		 * (JavascriptExecutor) driver; WebElement
		 * statusbutton=driver.findElement(By.xpath(
		 * "//textarea[@id='ctl00_ContentPlaceHolder1_AccountAddresss_txtAddress']"));
		 * js.executeScript("arguments[0].scrollIntoView();", statusbutton);
		 * Proc.Enteraddress(adress); Proc.Selectcountry(country);
		 * Proc.Selectstate(state); Proc.Selectcity(city); Proc.Enterzipcode(zip);
		 * Proc.Clickonaddresssavebutton(); Proc.clickonupdate();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
	  @AfterMethod
	  public void teardown()
	  {
	//	 driver.quit();
	  }
}
