package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.ArticleAddSettingPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class addcity extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	ArticleAddSettingPage articlesettingpage;
	String sheetname="Location";
	
	public addcity()
	{
		super();
	}
	@Test(priority=0)
	public void setup() throws InterruptedException
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		 homepage.clickonsettinglink();
		 settingpage=new SettingPage();
		 settingpage.verifysidebarlink(); 
		settingpage.verifyaddarticlelink();
		articlesettingpage=new ArticleAddSettingPage();
		
		
	//	 driver.findElement(By.xpath("//span[contains(text(),'Location Configuration')]")).click();
	//	 driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_divCityClose']")).click();
		// driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCountryForCity']")).sendKeys("UNITED ARAB EMIRATES");
	//	 driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCountryForCity']")).sendKeys("UNITED ARAB EMIRATES");
	//		Thread.sleep(1000);

		
	}
	
	@DataProvider
	public Object[][] gettestdataarticle() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(priority=1,dataProvider="gettestdataarticle")
	public void validateaddarticle(String state ,String city) throws InterruptedException
	{
		 driver.findElement(By.xpath("//span[contains(text(),'Location Configuration')]")).click();
		 driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_divCityClose']")).click();
		// driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCountryForCity']")).sendKeys("UNITED ARAB EMIRATES");
		 driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCountryForCity']")).sendKeys("UNITED ARAB EMIRATES");
			Thread.sleep(1000);

		 
	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlState']")).sendKeys(state);
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_imgbtnNewcity']")).click();
			 Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCity']")).sendKeys(city);
			
			driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_imgbtnCitysave']")).click();
			
			 Thread.sleep(2000);
	
	}
//	@AfterMethod
	public void teardown()
	{
	//	driver.quit();
	}
}
