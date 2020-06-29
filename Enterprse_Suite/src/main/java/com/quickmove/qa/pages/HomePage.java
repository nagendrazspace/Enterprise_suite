package com.quickmove.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quickmove.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//a[@id='3']")
	WebElement ClickOnSalesModule;
	
	@FindBy(xpath="//a[@id='nav-icon']")
	WebElement ClickOnHomepagesidemenu;
	
	
	@FindBy(xpath="//span[@id='ctl00_lblUserName']")
	WebElement usernamelabel;
	
	@FindBy(xpath="//a[@class='icon-Setting']")
	WebElement ClickOnsettingButtonlink;
	
	@FindBy(xpath="//a[@id='12']")
	WebElement ClickOnAccountModulelink;
	@FindBy(xpath="//a[@id='14']")
	WebElement ClickOnHR;
	public SettingPage ClickOnHR()
	{
		ClickOnHR.click();//if we are clicking  on link then it should return landing page object
		return new SettingPage();
	}
	public SettingPage clickonsettinglink()
	{
		ClickOnsettingButtonlink.click();//if we are clicking  on link then it should return landing page object
		return new SettingPage();
	}
	
	public HomePage clickonhomepgesidemenu()
	{
		ClickOnHomepagesidemenu.click();//if we are clicking  on link then it should return landing page object
		return new HomePage();
	}
	
	public AccountingModule clickonAccountModuleLink()
	{
		ClickOnAccountModulelink.click();//if we are clicking  on link then it should return landing page object
		return new AccountingModule();
	}
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	public String verifyhomepagetitle()
	{
		return driver.getTitle();
	}
	public boolean verifyusername()
	{
		return usernamelabel.isDisplayed();
	}
	
	
	public HomePage  clickonsalesmodule()
	{
		 ClickOnSalesModule.click();
		 return new HomePage();
	}
}
