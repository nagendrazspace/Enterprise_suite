package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class AddDesignation extends TestBase{
	
	@FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder1_divcloseDesignation']")
	WebElement clickondesgination;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_imgNewDesignation']")
	WebElement cliconaddbutton;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlDesignationType']")
	WebElement selectdesignation;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtDesignation']")
	WebElement EnterDesgnation;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_imgbtnSaveDesignation']")
	WebElement clickonsavebutton;
	
	public AddRoomSettingpage clickonsavebutton() 
	{   
		clickonsavebutton.click();
		return new AddRoomSettingpage();
	}
	public  AddDesignation()
	{
		PageFactory.initElements(driver, this);
	}
	public AddRoomSettingpage clickondesgination() 
	{   
		clickondesgination.click();
		return new AddRoomSettingpage();
	}
	
	public AddRoomSettingpage cliconaddbutton() 
	{   
		cliconaddbutton.click();
		return new AddRoomSettingpage();
	}
	
	public AddRoomSettingpage selectdesignation() 
	{   Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlDesignationType']")));
		select.selectByIndex(1);
		return new AddRoomSettingpage();
	}
	
	public AddRoomSettingpage EnterDesgnation() 
	{   
		EnterDesgnation.sendKeys("sales");
		return new AddRoomSettingpage();
	}
}
