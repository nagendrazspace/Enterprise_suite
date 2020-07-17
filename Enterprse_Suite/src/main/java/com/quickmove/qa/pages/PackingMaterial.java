package com.quickmove.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quickmove.qa.base.TestBase;

public class PackingMaterial extends TestBase {
	
	public PackingMaterial()
	{
		
		PageFactory.initElements(driver, this);// for initialization page factory method

		
	}
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlCategory']")
	WebElement Selectcategory;
	
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolder1_Span1']")
	WebElement Clickonaddconsumablebutton;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtMaterialName']")
	WebElement EnterMaterialName;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtMaterialNumber']")
	WebElement EnterQTY;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtMaterialSize']")
	WebElement EnterSize;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlMaterialUnit']")
	WebElement Selectunit;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtMaterialCost']")
	WebElement Selectcost;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_chkbtnResourceCost']")
	WebElement SelectUsedCheckbox;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ibtnSaveMaterial']")
	WebElement ClickonSavebutton;
	
public CostingProfilePage Selectcategory()
{
	Selectcategory.sendKeys("Consumable");	
	return new CostingProfilePage();
}
public CostingProfilePage Clickonaddconsumablebutton()
{
	Clickonaddconsumablebutton.click();	
	return new CostingProfilePage();
}
public CostingProfilePage EnterMaterialName(String Material)
{
	EnterMaterialName.sendKeys(Material);	
	return new CostingProfilePage();
}
public CostingProfilePage EnterQTY(String QTY)
{
	EnterQTY.sendKeys(QTY);	
	return new CostingProfilePage();
}
public CostingProfilePage EnterSize(String Size)
{
	EnterSize.sendKeys(Size);	
	return new CostingProfilePage();
}

public CostingProfilePage Selectunit(String unit)
{
	Selectunit.sendKeys(unit);	
	return new CostingProfilePage();
}
public CostingProfilePage Selectcost(String cost)
{
	Selectcost.sendKeys(cost);	
	return new CostingProfilePage();
}
public CostingProfilePage SelectUsedCheckbox()
{
	SelectUsedCheckbox.click();	
	return new CostingProfilePage();
}
public CostingProfilePage ClickonSavebutton()
{
	ClickonSavebutton.click();	
	return new CostingProfilePage();
}
}