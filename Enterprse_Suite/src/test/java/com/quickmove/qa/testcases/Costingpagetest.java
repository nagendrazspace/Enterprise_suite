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
import com.quickmove.qa.pages.CostingProfilePage;
import com.quickmove.qa.pages.HRPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class Costingpagetest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	HRPage hrpage;
	CostingProfilePage costingprofile;
	AddRoomSettingpage addroomsetting;
	String sheetname="costingProfile";
	public Costingpagetest()
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
			settingpage=new SettingPage();
			homepage.clickonsettinglink();
			settingpage.verifysidebarlink();
			driver.findElement(By.xpath("//span[contains(text(),'Common')]")).click();
			Thread.sleep(3000);
		
			settingpage.clickoncostingprofilelink();
			costingprofile=	 new CostingProfilePage();
}	



  @DataProvider public Object[][] AddCostingprofile() throws  EncryptedDocumentException, IOException {
  
  Object data[][]=TestUtil.getTestData(sheetname); 
  return data; 
  }
  
  @Test(priority=1, dataProvider="AddCostingprofile")
  
	  public void AddCostingprofile(String code,String Activityname,String Subctivityname,String accounttypeincome,String accounttypeexpense,String provisionalcost,String minimumamount) throws InterruptedException {
	         
	          costingprofile.ClickonAddcostingBtton();
	          costingprofile.EnterCode(code);
	          costingprofile.EnterActivityName(Activityname);
	          costingprofile.ClickonActivitysavebutton();
	          Thread.sleep(3000);
	          costingprofile.ClickonAddsubactivitybutton();
	          Thread.sleep(3000);
	          costingprofile.EnterSubactivityName(Subctivityname);
	          costingprofile.Selectaccounttypeincome(accounttypeincome);
	          costingprofile.Selectaccounttypeexpense(accounttypeexpense);
	          
	          costingprofile.EnterProvisionalcost(provisionalcost);
	          Thread.sleep(3000);
	          costingprofile.EnterMiniumamount(minimumamount);
	          Thread.sleep(3000);
	          costingprofile.SelectSubsidiary();
	          costingprofile.Clickonsavesubactivtybutton();
	          
	  }
	  @AfterMethod
	  public void teardown()
	  {
		// driver.quit();
	  }
}
