package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class QuotePage extends TestBase {
	public  QuotePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Quotation1_ddlQuotationStatus']")
	WebElement SelectQuotestatus;
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_gvQuotationDetails_ctl02_imbEdit']")
	WebElement Editfirstquote;
	
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_Quotation1_ImgbtnSave']")
	WebElement Clickonquotesvebutton;
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_Quotation1_ibtnOrder']")
	WebElement Clickonjobordericon;
	
	
	
public void SelectQuotestatus(){
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Quotation1_ddlQuotationStatus']")));
		select.selectByIndex(3);
		SelectQuotestatus.click();		
		}
public void Editfirstquote(){
	
	Editfirstquote.click();
	}

public void Clickonquotesvebutton(){
	
	Clickonquotesvebutton.click();
	
	
	
		}
public void Clickonjobordericon(){
	
	Clickonjobordericon.click();
	
}

}
