package com.quickmove.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.CostingPage;
import com.quickmove.qa.pages.EnquiryMasterpage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.JobOrder;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.QuotePage;

public class VerifyJobOrderPagetest  extends TestBase{
	
	HomePage homepage;
	LoginPage loginpage;
	 EnquiryMasterpage enquirymaster;
	 CostingPage costingpage;
	 QuotePage quotepage;
	 
	 JobOrder joborder;
	 public VerifyJobOrderPagetest()
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
	//		  homepage.ClickOnQuote();
			 
			  quotepage=new QuotePage();
			 joborder  =new JobOrder();
}
	 @Test
	 public void JobOrdercreation() throws InterruptedException {
		 
		 quotepage.Editfirstquote();
		 quotepage.Clickonjobordericon();
		 joborder.Enterjobpageaddress("test");
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement statusbutton=driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddlIndividualCountry']"));
			js.executeScript("arguments[0].scrollIntoView();", statusbutton);
		 joborder.Selectcustomercountry();
		 Thread.sleep(5000);
		 joborder.Selectcustomercity();
		 joborder.SelectAccountmanager();
		 joborder.SelectOutsourcetype();
		 
		 
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			WebElement statusbutton1=driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddlShipmentType']"));
			js1.executeScript("arguments[0].scrollIntoView();", statusbutton1);
		 joborder.SelectShipmettype();
		 Thread.sleep(3000);
		 joborder.SelectOriginbranch();
		 Thread.sleep(3000);
		 joborder.SelectDestinatinbranch();
		 Thread.sleep(3000);
		 joborder.selectcoordinator();
		 joborder.SelectOrderStatus();
		 joborder.SaveJoborderbutton();
		 


		 
		 
	 }
}
