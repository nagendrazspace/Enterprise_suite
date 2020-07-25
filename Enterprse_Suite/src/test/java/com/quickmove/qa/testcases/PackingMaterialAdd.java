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
import com.quickmove.qa.pages.PackingMaterial;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class PackingMaterialAdd extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	ArticleAddSettingPage articlesettingpage;
	PackingMaterial packingMaterial;
	String sheetname="PackingMaterial";
	
	public PackingMaterialAdd()
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
		packingMaterial=new PackingMaterial();
		settingpage.ClickonResourcetype();
		packingMaterial.Selectcategory();
		packingMaterial.Clickonaddconsumablebutton();
		
	}
	
	@DataProvider
	public Object[][] gettestMaterial() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(priority=1,dataProvider="gettestMaterial")
	public void PackingMaterial(String Material ,String QTY,String Size,String unit,String cost) throws InterruptedException
	{ 
		
		
		packingMaterial.EnterMaterialName(Material);
		packingMaterial.EnterQTY(QTY);
		packingMaterial.EnterSize(Size);
		packingMaterial.Selectunit(unit);
		packingMaterial.Selectcost(cost);
		packingMaterial.ClickonSavebutton();
		Thread.sleep(2000);
	
	}
//	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
