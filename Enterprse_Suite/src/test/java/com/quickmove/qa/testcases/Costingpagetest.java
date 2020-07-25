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
	@Test(priority=0)
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
  
	  public void AddCostingprofile(String code,String Activityname,String Subctivityname,String productype,String Transport,String Shipmenttype,String unitype,String IsMultiple,String unit,String provisionalcost,String minimumamount,String Selectautocost,String Selectcheckbox,String currency) throws InterruptedException {
	         
	          costingprofile.ClickonAddcostingBtton();
	          costingprofile.EnterCode(code);
	          costingprofile.EnterActivityName(Activityname);
	          costingprofile.ClickonActivitysavebutton();
	          Thread.sleep(3000);
	          costingprofile.ClickonAddsubactivitybutton();
	          Thread.sleep(3000);
	          costingprofile.EnterSubactivityName(Subctivityname);
	       //   costingprofile.Selectaccounttypeincome(accounttypeincome);
	       //   costingprofile.Selectaccounttypeexpense(accounttypeexpense);
	          costingprofile.SelectProductype(productype);
	          Thread.sleep(4000);
	          costingprofile.SelectTransportMode(Transport);
	          Thread.sleep(3000);
	          costingprofile.SelectShipmentype(Shipmenttype);
	          Thread.sleep(3000);
	          costingprofile.SelectUnittype(unitype);
	          Thread.sleep(3000);
	      costingprofile.Ismultiple(IsMultiple);
	          costingprofile.SelectUnit(unit);
	          Thread.sleep(5000);
	          costingprofile.EnterProvisionalcost(provisionalcost);
	          Thread.sleep(4000);
	          costingprofile.SelectAutoCost(Selectautocost);
	    //    costingprofile.EnterMiniumamount(minimumamount);
	          costingprofile.SelectEditProvisionalcost(Selectcheckbox);
	          Thread.sleep(3000);
	          costingprofile.SelectCurrency(currency);
	          costingprofile.SelectSubsidiary();
	          Thread.sleep(3000);
	          JavascriptExecutor js = (JavascriptExecutor) driver;
	      	WebElement statusbutton=driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_ibtnSaveSubActivity']"));
	      	js.executeScript("arguments[0].scrollIntoView();", statusbutton);
	        costingprofile.Clickonsavesubactivtybutton();
	        
	        Thread.sleep(3000);
	  }
	  @AfterMethod
	  public void teardown()
	  {
		// driver.quit();
	  }
}
