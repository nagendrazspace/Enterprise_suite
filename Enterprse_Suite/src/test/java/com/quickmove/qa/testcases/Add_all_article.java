package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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

public class Add_all_article extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	ArticleAddSettingPage articlesettingpage;
	String sheetname="Addarticle";
	
	public Add_all_article()
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
		articlesettingpage.ClickonExpandicon();
		
		
		
	}
	
	@DataProvider
	public Object[][] gettestdataarticle() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(priority=1,dataProvider="gettestdataarticle")
	public void validateaddarticle(String article ,String volume) throws InterruptedException
	{
		articlesettingpage.ClickonAddarticleicon();
		Thread.sleep(1000);
		articlesettingpage.Enterarticlenameandvolume(article, volume);
		Thread.sleep(1000);
		articlesettingpage.clickonsubsidiary();
		articlesettingpage.clickonsavebutton();
		Thread.sleep(1000);
	//	articlesettingpage.clickonsubsidiary();
	}
//	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
