package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class AddAgentMaster extends TestBase {
	
	@FindBy(xpath="//div[.='Accounts']")
	WebElement ClickOnAccounts;
	
	
	@FindBy(xpath="//a[.=' Organizations']")
	WebElement Clickonorganization;
	
	
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolder1_ViewCorporateCustomer1_ibtnAdd']")
	WebElement Clickonaddbutton;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Corporate1_ddlOrganizationType']")
	WebElement Selectorgnizationtype;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Corporate1_txtName']")
	WebElement EnterAgentName;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Corporate1_txtEmail']")
	WebElement Enteremail;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Corporate1_txtMobile']")
	WebElement Entermobile;
	
	
	@FindBy(xpath="//input[@id='token-input-ctl00_ContentPlaceHolder1_Corporate1_txtAssignedTo']")
	WebElement EnterAssignedTo;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Corporate1_chkAccountManager_2']")
	WebElement SelectAccountmanager;
	
	@FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder1_Corporate1_divAddressArrowClose']")
	WebElement Clickonaddressbutton;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_Corporate1_btnSave']")
	WebElement Clickonsavebutton;
	
	
	
	
	@FindBy(xpath="//textarea[@id='ctl00_ContentPlaceHolder1_Corporate1_AccountAddresss_txtAddress']")
	WebElement Enteraddress;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Corporate1_AccountAddresss_ddlCountry']")
	WebElement EnterCountry;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Corporate1_AccountAddresss_ddlCity']")
	WebElement EnterCity;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Corporate1_AccountAddresss_txtPin']")
	WebElement EnterZip;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_Corporate1_AccountAddresss_ibtnAddAddress']")
	WebElement Addadressbutton;
	
	public void Enteraddress(String Address)
	{
		Enteraddress.sendKeys(Address);
	}
	public void EnterCountry(String country)
	{
		EnterCountry.sendKeys(country);
	}
	public void EnterCity(String city)
	{
		EnterCity.sendKeys(city);
	}
	public void EnterZip(String zip)
	{
		EnterZip.sendKeys(zip);
	}
	public void Addadressbutton(){
		
		Addadressbutton.click();
		}
	public AddAgentMaster()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Clickonorganization() throws InterruptedException{
		
		Clickonorganization.click();
		Thread.sleep(1000);
		}
public void Clickonenquirysavebutton(){
		
	Clickonsavebutton.click();
	}
	
	public void EnterAssignedTo(String assigned) throws InterruptedException
	{EnterAssignedTo.click();
		EnterAssignedTo.sendKeys(assigned);
		Thread.sleep(2000);
		EnterAssignedTo.sendKeys(Keys.ARROW_DOWN);
		EnterAssignedTo.sendKeys(Keys.ENTER);
	}
	
	public void EnterAgentName(String Agent)
	{
			
		EnterAgentName.sendKeys(Agent);
	}
	
public void Enteremail(String email)
{
		
	Enteremail.sendKeys(email);
}
	
public void Entermobile(String Mobile){
		
	Entermobile.sendKeys(Mobile);
		}
	
	public void SelectAccountmanager() throws InterruptedException{
		
		SelectAccountmanager.click();
		}
	
	
	
	
	
public void Selectorgnizationtype(String ORGType){
		
	Selectorgnizationtype.sendKeys(ORGType);
		}
	
	public void Clickonaddressbutton() throws InterruptedException{
		
		Clickonaddressbutton.click();
		}
	
	public void ClickOnAccounts(){
		
		ClickOnAccounts.click();
	}

	public void Clickonaddbutton(){
		
		Clickonaddbutton.click();
	}


}
