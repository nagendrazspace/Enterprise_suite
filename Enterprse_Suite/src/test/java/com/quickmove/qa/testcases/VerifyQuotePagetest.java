package com.quickmove.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.CostingPage;
import com.quickmove.qa.pages.EnquiryMasterpage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.QuotePage;

public class VerifyQuotePagetest  extends TestBase{
	
	HomePage homepage;
	LoginPage loginpage;
	 EnquiryMasterpage enquirymaster;
	 CostingPage costingpage;
	 QuotePage quotepage;
	 public VerifyQuotePagetest()
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
			  homepage.clickonhomepgesidemenu();
	//		  homepage.ClickoncostingLink();
			  quotepage=new QuotePage();
}
	 @Test
	 public void Quotecreation() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_gvCostingDetails_ctl02_imbEdit']")).click();
		 costingpage.ClickOnQuotecon();
		 quotepage.SelectQuotestatus();
		 quotepage.Clickonquotesvebutton();
		 


		 
		 
	 }
}
