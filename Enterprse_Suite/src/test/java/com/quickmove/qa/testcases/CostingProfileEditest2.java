package com.quickmove.qa.testcases;

import java.io.IOException;
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
import com.quickmove.qa.pages.CostingProfilePage;
import com.quickmove.qa.pages.HRPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class CostingProfileEditest2 extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	HRPage hrpage;
	CostingProfilePage costingprofile;
	AddRoomSettingpage addroomsetting;
	String sheetname="EditcostingProfile";
	public CostingProfileEditest2()
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



  @DataProvider public Object[][] EditCostingprofile() throws  EncryptedDocumentException, IOException {
  
  Object data[][]=TestUtil.getTestData(sheetname); 
  return data; 
  }
  
  @Test(priority=1, dataProvider="EditCostingprofile")
  
	  public void EditCostingprofile(String Activity) throws InterruptedException {
	  //   costingprofile.EnterProvisionalcost(Activity);
	 //    System.out.println(costingprofile.EnterProvisionalcost(Activity));
	  
	//  driver.findElement(By.xpath("//*[contains(text(),'EXPORT_FC')]//parent::td//preceding-sibling::td")).click();
	     List<WebElement> row=driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[7]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr"));
	  int count  =row.size();
	     System.out.println(count);
	     String before_xpath="/html[1]/body[1]/form[1]/div[7]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[";
		 String After_xpath="]/td[3]";
		 for(int i=1; i<=count;i++){
			 if(i%2!=0) {
				String name= driver.findElement(By.xpath(before_xpath+(i)+After_xpath)).getText();
				//System.out.println(name);
				if(name.contains(Activity))
				{
					driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[7]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+(i)+"]/td[2]/a[1]")).click();
				}
	  }
		 }

  }
	  @AfterMethod
	  public void teardown()
	  {
		// driver.quit();
	  }
}
