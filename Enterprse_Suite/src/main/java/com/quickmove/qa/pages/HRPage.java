package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class HRPage extends TestBase{
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ViewHREmployee1_btnAddEmployee']")
	WebElement ClickOnAddemployeebutton;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_txtEmployeeID']")
	WebElement EnterEmployeeID;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_txtFirstName']")
	WebElement EnterEmployeeFirstName;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_txtLastName']")
	WebElement EnterEmployeeLastName;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_txtMobile']")
	WebElement EnterEmployeeMobile;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_txtEmailId']")
	WebElement EnterEmployeeEmail;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_txtPassword']")
	WebElement EnterEmployeeEmailPassowrd;
	
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDepartment']")
	WebElement SelectDepartment;
	
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDesignation']")
	WebElement SelectDesignation;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_btnSave']")
	WebElement Clickonsavebutton;
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ViewHREmployee1_gvEmployee_ctl02_imgbtnCreateUser']")
	WebElement createuser;
	
	//a[@id='ctl00_ContentPlaceHolder1_ViewHREmployee1_gvEmployee_ctl02_imgbtnCreateUser']
	public HRPage()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	public HRPage createuser()
	{
		createuser.click();//if we are clicking  on link then it should return landing page object
		driver.switchTo().alert().accept();
		return new HRPage();
	}
	public HRPage ClickOnAddemployeebutton()
	{
		ClickOnAddemployeebutton.click();//if we are clicking  on link then it should return landing page object
		return new HRPage();
	}
	
	public HRPage EnterEmployeeID(String employeeid)
	{
		EnterEmployeeID.sendKeys(employeeid);//if we are clicking  on link then it should return landing page object
		return new HRPage();
	}
	public HRPage EnterEmployeeFirstName(String EFirstname)
	{
		EnterEmployeeFirstName.sendKeys(EFirstname);//if we are clicking  on link then it should return landing page object
		return new HRPage();
	}
	public HRPage EnterEmployeeLastName(String Elastname)
	{
		EnterEmployeeLastName.sendKeys(Elastname);//if we are clicking  on link then it should return landing page object
		return new HRPage();
	}

	public HRPage EnterEmployeeMobile(String EMobile)
	{
		EnterEmployeeMobile.sendKeys(EMobile);//if we are clicking  on link then it should return landing page object
		return new HRPage();
	}
	public HRPage EnterEmployeeEmail(String Email)
	{
		EnterEmployeeEmail.sendKeys(Email);//if we are clicking  on link then it should return landing page object
		return new HRPage();
	}

	public HRPage EnterEmployeeEmailPassowrd(String Emailpassw)
	{
		EnterEmployeeEmailPassowrd.sendKeys(Emailpassw);//if we are clicking  on link then it should return landing page object
		return new HRPage();
	}

	public void SelectDepartment() throws InterruptedException
	{
		SelectDepartment.click();//if we are clicking  on link then it should return landing page object
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDepartment']")).sendKeys(Keys.ARROW_UP);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDepartment']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDepartment']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDepartment']")));
	//	select.selectByValue("Home");
		//select.selectByIndex(0);
		
		
	}
	public void SelectDesignation() throws InterruptedException
	{
		SelectDesignation.click();//if we are clicking  on link then it should return landing page object
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDesignation']")));
		select.selectByIndex(1);
		
		
	}
	public HRPage Clickonsavebutton()
	{
		Clickonsavebutton.click();//if we are clicking  on link then it should return landing page object
		return new HRPage();
	}
}

