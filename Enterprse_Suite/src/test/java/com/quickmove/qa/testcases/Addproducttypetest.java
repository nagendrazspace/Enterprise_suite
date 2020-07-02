package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.AddRolesPage;
import com.quickmove.qa.pages.AddRoomSettingpage;
import com.quickmove.qa.pages.Addproducttype;
import com.quickmove.qa.pages.HRPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class Addproducttypetest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	AddRoomSettingpage addroomsettingpage; 
	AddRolesPage addrolespage;
	HRPage hrpage;
	AddRoomSettingpage addroomsetting;
	Addproducttype addproducttype;
	String sheetname="ProductType";
	public Addproducttypetest()
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
		settingpage.clickonProducttypelink();
		addproducttype=new Addproducttype();
		
}	
	@DataProvider
	public Object[][] productype() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(priority=1, dataProvider="productype")
	public void Addproducttypedomestic(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype);
		
		addproducttype.clickonProductype();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=2, dataProvider="productype")
	public void Addproducttypedtdi(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype1);
		
		addproducttype.clickonProductype2();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=3, dataProvider="productype")
	public void Addproducttypedtde(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype2);
		
		addproducttype.clickonProductype3();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=4, dataProvider="productype")
	public void Addproducttypedtp(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype3);
		
		addproducttype.clickonProductype4();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=5, dataProvider="productype")
	public void Addproducttypelocal(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype4);
		
		addproducttype.clickonProductype5();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=6, dataProvider="productype")
	public void Addproducttypeptd(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype5);
		
		addproducttype.clickonProductype6();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=7, dataProvider="productype")
	public void Addproducttypestorage(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype6);
		
		addproducttype.clickonProductype7();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=8, dataProvider="productype")
	public void Addproducttyperelo(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype7);
		
		addproducttype.clickonProductype8();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=9, dataProvider="productype")
	public void Addproducttypepacking(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype8);
		
		addproducttype.clickonProductype9();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=10, dataProvider="productype")
	public void Addproducttypepackingff(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype9);
		
		addproducttype.clickonProductype10();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=11, dataProvider="productype")
	public void Addproducttypepackinginter(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype10);
		
		addproducttype.clickonProductype11();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=12, dataProvider="productype")
	public void Addproducttypepackingnt(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype11);
		
		addproducttype.clickonProductype12();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=13, dataProvider="productype")
	public void Addproducttypepackingfurnt(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype12);
		
		addproducttype.clickonProductype13();
		addproducttype.clickonsavebutton();
	}
	@Test(priority=14, dataProvider="productype")
	public void Addproducttypepackingcc(String producttype,String producttype1,String producttype2,String producttype3,String producttype4,String producttype5,String producttype6,String producttype7,String producttype8,String producttype9,String producttype10,String producttype11,String producttype12,String producttype13)
	{
		addproducttype.clickonProductaddbutton();
		addproducttype.EnterProducttype(producttype13);
		
		addproducttype.clickonProductype14();
		addproducttype.clickonsavebutton();
	}
}
