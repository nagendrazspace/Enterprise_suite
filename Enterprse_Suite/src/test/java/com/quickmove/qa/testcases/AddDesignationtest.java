package com.quickmove.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.AddDesignation;
import com.quickmove.qa.pages.AddRolesPage;
import com.quickmove.qa.pages.AddRoomSettingpage;
import com.quickmove.qa.pages.Addproducttype;
import com.quickmove.qa.pages.HRPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;

public class AddDesignationtest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	AddRoomSettingpage addroomsettingpage; 
	AddRolesPage addrolespage;
	HRPage hrpage;
	AddRoomSettingpage addroomsetting;
	Addproducttype addproducttype;
	AddDesignation adddesignation;
	public AddDesignationtest()
	{
		super();// it will call super class constructor
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickonsettinglink();
		settingpage=new SettingPage();
		settingpage.verifysidebarlink();
		driver.findElement(By.xpath("//span[contains(text(),'Common')]")).click();
		Thread.sleep(3000);
		adddesignation=new AddDesignation();
		
		
}	
	@Test
	public void AddrolesTest() throws InterruptedException
	{
		
		adddesignation.clickondesgination();
		adddesignation.cliconaddbutton();
		Thread.sleep(3000);
		adddesignation.selectdesignation();
		Thread.sleep(3000);
		adddesignation.EnterDesgnation();
		adddesignation.clickonsavebutton();
		
	}

}
