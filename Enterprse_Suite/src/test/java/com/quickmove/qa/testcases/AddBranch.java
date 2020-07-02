package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.BranchPage;
import com.quickmove.qa.pages.CostingPage;
import com.quickmove.qa.pages.EnquiryMasterpage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.QuotePage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class AddBranch extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	 EnquiryMasterpage enquirymaster;
	 CostingPage costingpage;
	 QuotePage quotepage;
	 SettingPage settingpage;
	 BranchPage branchpage;
	 String sheetname1="Subsidiary";
	 String sheetname="Global";
	 String sheetname2="Headoffice";
	 public AddBranch()
		{
			super();
		}
	 
	 @BeforeMethod
		public void setup() throws InterruptedException
		{
			initialization();
			 loginpage=new LoginPage();
			 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			
			  enquirymaster=new EnquiryMasterpage();
			  settingpage=new SettingPage();
			  homepage.clickonsettinglink();
				 settingpage.verifysidebarlink(); 
				 Thread.sleep(1000);
				 settingpage.clickonbrnachlink();
				 branchpage=new BranchPage();
}
	 @DataProvider
		public Object[][] branch() throws EncryptedDocumentException, IOException
		{
			Object data[][]=TestUtil.getTestData(sheetname);
			return data;
		}
	 @Test(priority=1, dataProvider="branch")
	 public void Global(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) throws InterruptedException
	 {
		 branchpage.Clickonbrancgaddbutton();
		 branchpage.EnterBranchcode(s1);
		 branchpage.checkisglobal();
		// branchpage.clickonbranchtype();
		 Thread.sleep(3000);
		 branchpage.EnterBranchName(s2);
		 branchpage.EnterAddress(s3);
		 branchpage.Selectcountry(s4);
		 Thread.sleep(3000);
		 branchpage.Selectcity(s5);
		 branchpage.Entermobile(s6);
		 branchpage.EnterEmail(s7);
		 branchpage.EnterEmailpassword(s8);
		 branchpage.selectcurrency(s9);
		 branchpage.clickonsavebutton();
		 
		 
	 }
	 @DataProvider
		public Object[][] Subsidiary() throws EncryptedDocumentException, IOException
		{
			Object data[][]=TestUtil.getTestData(sheetname1);
			return data;
		}
	 @Test(priority=2, dataProvider="Subsidiary")
	 public void Subsidiary(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) throws InterruptedException
	 {
		 branchpage.Clickonbrancgaddbutton();
		 branchpage.EnterBranchcode(s1);
		 branchpage.clickonbranchtype();
		// branchpage.checkisglobal();
	 //    branchpage.Selectheadoffice();
		 Thread.sleep(3000);
		 branchpage.EnterBranchName(s2);
	//	 branchpage.Selectsubsidiaryhead();
		 branchpage.EnterAddress(s3);
		 branchpage.Selectcountry(s4);
		 Thread.sleep(3000);
		 branchpage.Selectcity(s5);
		 branchpage.Entermobile(s6);
		 branchpage.EnterEmail(s7);
		 branchpage.EnterEmailpassword(s8);
		 branchpage.selectcurrency(s9);
		 branchpage.clickonsavebutton();
		 
		 
	 }
	 @DataProvider
		public Object[][] Headoffice() throws EncryptedDocumentException, IOException
		{
			Object data[][]=TestUtil.getTestData(sheetname2);
			return data;
		}
	 @Test(priority=3, dataProvider="Headoffice")
	 public void Headoffice(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) throws InterruptedException
	 {
		 branchpage.Clickonbrancgaddbutton();
		 branchpage.EnterBranchcode(s1);
		// branchpage.clickonbranchtype();
		// branchpage.checkisglobal();
	   branchpage.Selectheadoffice();
		 Thread.sleep(8000);
		 branchpage.EnterBranchName(s2);
	 branchpage.Selectsubsidiaryhead();
	 Thread.sleep(4000);

		 branchpage.EnterAddress(s3);
		 branchpage.Selectcountry(s4);
		 Thread.sleep(3000);
		 branchpage.Selectcity(s5);
		 branchpage.Entermobile(s6);
		 branchpage.EnterEmail(s7);
		 branchpage.EnterEmailpassword(s8);
	//	 branchpage.selectcurrency(s9);
		 branchpage.clickonsavebutton();
		 
		 
	 }
}