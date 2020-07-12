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
import com.quickmove.qa.pages.HRPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class DynamicHRPageTest2 extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	HRPage hrpage;
	AddRoomSettingpage addroomsetting;
	String sheetname="AddEmployeeDetails";
	public DynamicHRPageTest2()
	{
		super();// it will call super class constructor
	}
	@Test
	public void setup() throws InterruptedException
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 hrpage=new HRPage();
		 homepage.ClickOnHR();
	//Mehod --1	 
		 String before_xpath="/html[1]/body[1]/form[1]/div[7]/div[2]/div[2]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[";
		 String After_xpath="]/td[2]";
		 for(int i=1; i<=20;i++){
			String name= driver.findElement(By.xpath(before_xpath+i+After_xpath)).getText();
			System.out.println(name);
	/*		if(name.contains("sushh"))
			{// i++;
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_ViewHREmployee1_gvEmployee_ctl0"+(i+1)+"_imgbtnEdit']")).click();
						//a[@id='ctl00_ContentPlaceHolder1_ViewHREmployee1_gvEmployee_ctl02_imgbtnEdit']
}	
*/
		 }
}

}
