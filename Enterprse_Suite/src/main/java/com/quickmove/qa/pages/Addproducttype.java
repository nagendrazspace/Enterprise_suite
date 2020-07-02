package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class Addproducttype extends TestBase {

	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")
	WebElement clickonProductype;
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ViewProduct1_btnAdd']")
	WebElement clickonProductaddbutton;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtName']")
	WebElement EnterProducttype;
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_btnSave']")
	WebElement clickonsavebutton;
	public  Addproducttype()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public AddRoomSettingpage clickonProductype() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(1);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype2() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(2);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype3() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(3);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype4() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(4);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype5() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(5);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype6() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(6);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype7() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(7);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype8() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(8);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype9() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(9);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype10() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(10);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype11() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(11);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype12() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(12);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype13() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(13);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonProductype14() 
	{   
	 Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	 select.selectByIndex(14);
		return new AddRoomSettingpage();
	}
	
	public AddRoomSettingpage EnterProducttype(String product) 
	{   
		
		EnterProducttype.sendKeys(product);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonsavebutton() 
	{   
		clickonsavebutton.click();
		return new AddRoomSettingpage();
	}
	
	public AddRoomSettingpage clickonProductaddbutton() 
	{   
		clickonProductaddbutton.click();
		return new AddRoomSettingpage();
	}
}
