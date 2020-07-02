package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class BranchPage extends TestBase {
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ViewBranch2_btnAddBranch']")
	WebElement Clickonbrancgaddbutton;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtBranchCode']")
	WebElement EnterBranchcode;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtBranchName']")
	WebElement EnterBranchName;
	
	
	@FindBy(xpath="//textarea[@id='ctl00_ContentPlaceHolder1_txtAddress']")
	WebElement EnterAddress;
	
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlCountry']")
	WebElement Selectcountry;
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlCity']")
	WebElement Selectcity;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtMobile']")
	WebElement Entermobile;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtEmail']")
	WebElement EnterEmail;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtPassword']")
	WebElement EnterEmailpassword;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlCurrency']")
	WebElement selectcurrency;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_btnSave']")
	WebElement clickonsavebutton;
	
	public AddRoomSettingpage clickonsavebutton() 
	{   
		clickonsavebutton.click();
		return new AddRoomSettingpage();
	}
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_chkIsGlobal']")
	WebElement checkisglobal;
	
	public AddRoomSettingpage checkisglobal() 
	{   
		checkisglobal.click();
		return new AddRoomSettingpage();
	}
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlBranchType']")
	WebElement clickonbranchtype;
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlSubsidiaryBranch']")
	WebElement clickonsubsidiary;
	
	public AddRoomSettingpage Selectsubsidiaryhead() 
	{   Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlSubsidiaryBranch']")));
		select.selectByIndex(2);
		return new AddRoomSettingpage();
	}
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlShowBranchDetail']")
	WebElement clickonheadoffice;
	public AddRoomSettingpage selectcurrency(String currency) 
	{  
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCurrency']")).sendKeys(currency);
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCurrency']")).sendKeys(Keys.ENTER);
		
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage Entermobile(String mobile) 
	{   
		Entermobile.sendKeys(mobile);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage EnterEmail(String email) 
	{   
		EnterEmail.sendKeys(email);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage EnterEmailpassword(String pswd) 
	{   
		EnterEmailpassword.sendKeys(pswd);
		return new AddRoomSettingpage();
	}
	public  BranchPage()
	{
		PageFactory.initElements(driver, this);
	}
	public AddRoomSettingpage Clickonbrancgaddbutton() 
	{   
		Clickonbrancgaddbutton.click();
		return new AddRoomSettingpage();
	}
	
	public AddRoomSettingpage EnterBranchcode(String brncode) 
	{   
		EnterBranchcode.sendKeys(brncode);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage EnterBranchName(String branchname) 
	{   
		EnterBranchName.sendKeys(branchname);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonbranchtype() 
	{   Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlBranchType']")));
		select.selectByIndex(4);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage Selectheadoffice() 
	{   Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlBranchType']")));
		select.selectByIndex(1);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage SelectBranch() 
	{   Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlBranchType']")));
		select.selectByIndex(2);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage EnterAddress(String address) 
	{   
		EnterAddress.sendKeys(address);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage Selectcountry(String country) 
	{   
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCountry']")).sendKeys(country);
		
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCountry']")).sendKeys(Keys.ENTER);

		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage Selectcity(String city) 
	{  
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCity']")).sendKeys(city);
		
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlCity']")).sendKeys(Keys.ENTER);
		/*
		 * Select select= new Select(driver.findElement(By.xpath(
		 * "//select[@id='ctl00_ContentPlaceHolder1_ddlCity']")));
		 * select.selectByIndex(4); 
		 */
		return new AddRoomSettingpage();
	}
}
