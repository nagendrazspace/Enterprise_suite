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
import com.quickmove.qa.pages.AddAgentMaster;
import com.quickmove.qa.pages.EnquiryMasterpage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.util.TestUtil;

public class AddAgenttest extends TestBase{
	HomePage homepage;
	LoginPage loginpage;
	 EnquiryMasterpage enquirymaster;
	 String sheetname="AgentWM";
	 String sheetname1="AgentWM";
	 String sheetname2="Agent";
	 AddAgentMaster addagent;
	public AddAgenttest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 homepage.clickonsalesmodule();
		  enquirymaster=new EnquiryMasterpage();
		  homepage.clickonhomepgesidemenu();
		  addagent=new AddAgentMaster();
		  addagent.ClickOnAccounts();
		  addagent.Clickonorganization();
		  
		  }
	@DataProvider
	public Object[][] ADDAGNETTEST() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(dataProvider="ADDAGNETTEST")
	public void createnq1(String TYPE,String NAME,String EMAIL,String ASSIGNED,String ADDRESS,String COUNTRY,String CITY) throws InterruptedException {
	
		addagent.Clickonaddbutton();
		addagent.Selectorgnizationtype(TYPE);
		Thread.sleep(3000);
		addagent.EnterAgentName(NAME);
		addagent.Enteremail(EMAIL);
//		addagent.Entermobile(MOBILE);
		addagent.SelectAccountmanager();
		
		
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement statusbutton=driver.findElement(By.xpath("//li[@id='ctl00_ContentPlaceHolder1_Corporate1_Li13']//ul"));
	js.executeScript("arguments[0].scrollIntoView();", statusbutton);
	
	addagent.EnterAssignedTo(ASSIGNED);
	addagent.Clickonenquirysavebutton();
	Thread.sleep(3000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	WebElement statusbutton1=driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_Corporate1_divAddressArrowClose']"));
	js.executeScript("arguments[0].scrollIntoView();", statusbutton1);
	
	addagent.Clickonaddressbutton();
	addagent.Enteraddress(ADDRESS);
	addagent.EnterCountry(COUNTRY);
	Thread.sleep(3000);
	addagent.EnterCity(CITY);
	Thread.sleep(2000);
//	addagent.EnterZip(zip);
addagent.Addadressbutton();	
addagent.Clickonenquirysavebutton();
}
	/*@DataProvider
	public Object[][] ADDAGNETTEST1() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname1);
		return data;
	}
	@Test(priority=2,dataProvider="AgentWM")
	public void createnq2(String TYPE, String NAME,String  EMAIL,String MOBILE,String ASSIGNED,String ADDRESS,String COUNTRY,String CITY,String zip) throws InterruptedException {
	
		addagent.Clickonaddbutton();
		addagent.Selectorgnizationtype(TYPE);
		Thread.sleep(3000);
		addagent.EnterAgentName(NAME);
		addagent.Enteremail(EMAIL);
		addagent.Entermobile(MOBILE);
		addagent.SelectAccountmanager();
		
		
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement statusbutton=driver.findElement(By.xpath("//li[@id='ctl00_ContentPlaceHolder1_Corporate1_Li13']//ul"));
	js.executeScript("arguments[0].scrollIntoView();", statusbutton);
	
	addagent.EnterAssignedTo(ASSIGNED);
	addagent.Clickonenquirysavebutton();
	Thread.sleep(3000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	WebElement statusbutton1=driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_Corporate1_divAddressArrowClose']"));
	js.executeScript("arguments[0].scrollIntoView();", statusbutton1);
	
	addagent.Clickonaddressbutton();
	addagent.Enteraddress(ADDRESS);
	addagent.EnterCountry(COUNTRY);
	Thread.sleep(3000);
	addagent.EnterCity(CITY);
	Thread.sleep(2000);
	addagent.EnterZip(zip);
addagent.Addadressbutton();	
addagent.Clickonenquirysavebutton();
}
	@DataProvider
	public Object[][] ADDAGNETTEST13() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}

	@Test(priority=3,dataProvider="Agent")
	public void createnq3(String TYPE, String NAME,String  EMAIL,String MOBILE,String ASSIGNED,String ADDRESS,String COUNTRY,String CITY) throws InterruptedException {
	
		addagent.Clickonaddbutton();
		addagent.Selectorgnizationtype(TYPE);
		Thread.sleep(3000);
		addagent.EnterAgentName(NAME);
		addagent.Enteremail(EMAIL);
		addagent.Entermobile(MOBILE);
		addagent.SelectAccountmanager();
		
		
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement statusbutton=driver.findElement(By.xpath("//li[@id='ctl00_ContentPlaceHolder1_Corporate1_Li13']//ul"));
	js.executeScript("arguments[0].scrollIntoView();", statusbutton);
	
	addagent.EnterAssignedTo(ASSIGNED);
	addagent.Clickonenquirysavebutton();
	Thread.sleep(3000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	WebElement statusbutton1=driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_Corporate1_divAddressArrowClose']"));
	js.executeScript("arguments[0].scrollIntoView();", statusbutton1);
	
	addagent.Clickonaddressbutton();
	addagent.Enteraddress(ADDRESS);
	addagent.EnterCountry(COUNTRY);
	Thread.sleep(3000);
	addagent.EnterCity(CITY);
	Thread.sleep(2000);
//	addagent.EnterZip(zip);
addagent.Addadressbutton();	
addagent.Clickonenquirysavebutton();
}*/
@AfterMethod
public void teardown()
{
//	driver.quit();
}
}