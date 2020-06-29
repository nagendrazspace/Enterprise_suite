package com.quickmove.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.CostingPage;
import com.quickmove.qa.pages.EnquiryMasterpage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;

public class VerifyCostingPagetest  extends TestBase{
	
	HomePage homepage;
	LoginPage loginpage;
	 EnquiryMasterpage enquirymaster;
	 CostingPage costingpage;
	 public VerifyCostingPagetest()
		{
			super();
		}
	 
	 @BeforeMethod
		public void setup()
		{
			initialization();
			 loginpage=new LoginPage();
			 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			
			  enquirymaster=new EnquiryMasterpage();
			  homepage.clickonsalesmodule();
			  costingpage=new CostingPage();
}
	 @Test
	 public void costcreation() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_ViewEnquiry_gvEnquiry_ctl02_imbEnquirySummary']")).click();
	//	 enquirymaster.clickoncostingicon();
		 costingpage.ClickOnAutocosticon();
		 costingpage.ClickOnAutocosticonsubmit();
		 Thread.sleep(3000);
		 costingpage.selectcostingstatus();
		 costingpage.Clickoncostigsavebutton();
		 
		 
	 }
}
