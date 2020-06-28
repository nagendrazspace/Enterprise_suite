package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class CostingPage extends TestBase{
	
	
	public  CostingPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_costing1_ibtnAutoMateCosting']")
	WebElement ClickOnAutocosticon;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_costing1_ibtnQuotation']")
	WebElement ClickOnQuotecon;
	
	
	
	@FindBy(xpath="//input[@id='btnSubmit']")
	WebElement ClickOnAutocosticonsubmit;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_costing1_ddlCostinStatus']")
	WebElement selectcostingstatus;
	
	
	

	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_costing1_ImgbtnSave']")
	WebElement Clickoncostigsavebutton;
	
	public void selectcostingstatus(){
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_costing1_ddlCostinStatus']")));
		select.selectByIndex(3);
		selectcostingstatus.click();		
		}
	
public void ClickOnAutocosticonsubmit(){
	
	//driver.switchTo().window("Automatic Costing");
	//driver.switchTo().alert();
	driver.switchTo().activeElement();
		ClickOnAutocosticonsubmit.click();
		}
	
public void ClickOnAutocosticon(){
	
	ClickOnAutocosticon.click();
	
		}
public void Clickoncostigsavebutton(){
	
	Clickoncostigsavebutton.click();
	
	
	
		}
public void ClickOnQuotecon(){
	
	ClickOnQuotecon.click();
	
		}

	
	
}
