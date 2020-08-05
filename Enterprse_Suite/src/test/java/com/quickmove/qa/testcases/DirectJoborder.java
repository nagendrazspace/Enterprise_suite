package com.quickmove.qa.testcases;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
import com.quickmove.qa.pages.JobOrder;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class DirectJoborder extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	HRPage hrpage;
	 JobOrder joborder;
	AddRoomSettingpage addroomsetting;
	String sheetname="DirectJoborder";
	public DirectJoborder()
	{
		super();// it will call super class constructor
	}
	@Test(priority=0)
	public void setup() throws InterruptedException
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 homepage.ClickOnCustomersupport();
		 homepage.clickonhomepgesidemenu();
		 homepage.ClickOnJoborder();
		 joborder  =new JobOrder();
		 joborder.Clickonaddbuttonoborder();
	}
		 @DataProvider public Object[][] Adddirectorder() throws EncryptedDocumentException, IOException { 
			  
			  Object  data[][]=TestUtil.getTestData(sheetname);
			  return data; 
			  }
		 
@Test(priority=1, dataProvider="Adddirectorder") 
public void CreateJoborder(String salu, String fname,String Mname,String Lname,String code,String mobile,String Addres,String country,String city,String service,String goodstype,String productype,String originadd,String destaddress,String packdate,String mode,String shipment) throws InterruptedException
{
	joborder.orderFrom();
	Thread.sleep(3000);
	joborder.Selectsalutation(salu);
	joborder.EnterfirstName(fname);
	Thread.sleep(3000);
	joborder.EnterMiddleName(Mname);
	joborder.EnterLastName(Lname);
	joborder.Entercountrycode(code);
	joborder.EnterMobile(mobile);
	joborder.Enterjobpageaddress(Addres);
	joborder.Selectcustomercountry();
	Thread.sleep(3000);
	joborder.Selectcustomercity();
	joborder.SelectAccountmanager();
	joborder.servicetype(service);
	joborder.Goodstype(goodstype);
	joborder.producttype(productype);
	joborder.SelectOutsourcetype();
	Thread.sleep(3000);
	joborder.originaddress(originadd);
	joborder.Destinationaddress(destaddress);
	
	  //This will select From date 
	//  WebElement elementFromDate = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Order_txtPackingDate']"));
//	  ((JavascriptExecutor)driver).executeScript("document.getElementByxpath('//input[@id='ctl00_ContentPlaceHolder1_Order_txtPackingDate'])"); // Enables the from date box
	//  elementFromDate.clear();
//	  elementFromDate.sendKeys("18-Aug-2017"); //Enter date in required format
	
//	joborder.setdate(packdate);
	
	
	((JavascriptExecutor)driver).executeScript("document.getElementById('ctl00_ContentPlaceHolder1_Order_txtPackingDate').setAttribute('value','04 aug 2020')");
	
	
	joborder.Transportmode(mode);
	Thread.sleep(3000);
	joborder.shipmenttype(shipment);
	Thread.sleep(3000);
	joborder.SelectOriginbranch();
	Thread.sleep(3000);
	joborder.SelectDestinatinbranch();
	Thread.sleep(3000);
	joborder.SelectOrderStatus();
	Thread.sleep(3000);
	joborder.selectcoordinator();
	Thread.sleep(3000);
	joborder.SaveJoborderbutton();
}
}
