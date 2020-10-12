package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class procurment extends TestBase{
	
	
	@FindBy(xpath="//div[contains(@onclick,'SubmenuOpenClose(0)')]")
	WebElement ClickOnvendor;
	
	@FindBy(xpath="//li[@id='IdMenu0']//li[2]//a[1]//span[1]")
	WebElement ClickOnOrganization;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ibtnAdd']")
	WebElement Clickonaddbutton;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtName']")
	WebElement EnterVendorName;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlIndustryType']")
	WebElement Selectindsutrytype;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtEmail']")
	WebElement EnterEmployeeEmail;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtMobile']")
	WebElement EnterMobile;
	
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlResourceType']")
	WebElement Selectcategory;
	
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlType']")
	WebElement SelectService;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_chkItems_0']")
	WebElement clickoncheckbox;
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_btnSave']")
	WebElement Cliconsavebutton;
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_btnUpdateTop']")
	WebElement clickonupdate;
	
	@FindBy(xpath="//textarea[@id='ctl00_ContentPlaceHolder1_AccountAddresss_txtAddress']")
	WebElement Enteraddress;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_AccountAddresss_ddlCountry']")
	WebElement Selectcountry;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_AccountAddresss_ddlState']")
	WebElement Selectstate;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_AccountAddresss_ddlCity']")
	WebElement Selectcity;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_AccountAddresss_txtPin']")
	WebElement Enterzipcode;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_AccountAddresss_ibtnAddAddress']")
	WebElement Clickonaddresssavebutton;
	public procurment clickonupdate()
	{
		clickonupdate.click();//if we are clicking  on link then it should return landing page object
	//	driver.switchTo().alert().accept();
		return new procurment();
	}
	
	
	
	public procurment Enterzipcode(String zip)
	{
		Enterzipcode.sendKeys(zip);//if we are clicking  on link then it should return landing page object
	//	driver.switchTo().alert().accept();
		return new procurment();
	}
	
	public void Selectcountry(String country) throws InterruptedException
	{
		Selectcountry.sendKeys(country);//if we are clicking  on link then it should return landing page object
		Thread.sleep(3000);
	}
	
	public void Selectstate(String state) throws InterruptedException
	{
		Selectstate.sendKeys(state);//if we are clicking  on link then it should return landing page object
		Thread.sleep(3000);
	}
	
	public void Selectcity(String city) throws InterruptedException
	{
		Selectcity.sendKeys(city);//if we are clicking  on link then it should return landing page object
		Thread.sleep(3000);
	}
	
	public AddRoomSettingpage selectbranch() 
	{   Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlBranchName']")));
		select.selectByIndex(1);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage selectsubsidary() 
	{   Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlSubsidiaryOrGlobal']")));
		select.selectByIndex(1);
		return new AddRoomSettingpage();
	}
	//a[@id='ctl00_ContentPlaceHolder1_ViewHREmployee1_gvEmployee_ctl02_imgbtnCreateUser']
	public procurment()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	public procurment Cliconsavebutton()
	{
		Cliconsavebutton.click();//if we are clicking  on link then it should return landing page object
	//	driver.switchTo().alert().accept();
		return new procurment();
	}
	public procurment Clickonaddbutton()
	{
		Clickonaddbutton.click();//if we are clicking  on link then it should return landing page object
	//	driver.switchTo().alert().accept();
		return new procurment();
	}
	public procurment Clickonaddresssavebutton()
	{
		Clickonaddresssavebutton.click();//if we are clicking  on link then it should return landing page object
	//	driver.switchTo().alert().accept();
		return new procurment();
	}
	public procurment ClickOnvendor()
	{
		ClickOnvendor.click();//if we are clicking  on link then it should return landing page object
		return new procurment();
	}
	
	public procurment ClickOnOrganization( )
	{
		ClickOnOrganization.click();//if we are clicking  on link then it should return landing page object
		return new procurment();
	}
	public procurment EnterVendorName(String Vendorname)
	{
		EnterVendorName.sendKeys(Vendorname);//if we are clicking  on link then it should return landing page object
		return new procurment();
	}
	public procurment Selectindsutrytype(String industrytpe)
	{
		Selectindsutrytype.sendKeys(industrytpe);//if we are clicking  on link then it should return landing page object
		return new procurment();
	}

	public procurment EnterMobile(String EMobile)
	{
		EnterMobile.sendKeys(EMobile);//if we are clicking  on link then it should return landing page object
		return new procurment();
	}
	public procurment EnterEmployeeEmail(String Email)
	{
		EnterEmployeeEmail.sendKeys(Email);//if we are clicking  on link then it should return landing page object
		return new procurment();
	}

	public procurment Enteraddress(String adress)
	{
		Enteraddress.sendKeys(adress);//if we are clicking  on link then it should return landing page object
		return new procurment();
	}

	public void Selectcategory(String Category) throws InterruptedException
	{
		
		Selectcategory.sendKeys(Category);
	//	SelectDepartment.click();//if we are clicking  on link then it should return landing page object
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDepartment']")).sendKeys(Keys.ARROW_UP);
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDepartment']")).sendKeys(Keys.ARROW_DOWN);
	//	driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDepartment']")).sendKeys(Keys.ENTER);
	//	Thread.sleep(3000);
		//Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDepartment']")));
	//	select.selectByValue("Home");
		//select.selectByIndex(0);
		
		
	}
	public void SelectService(String Service) throws InterruptedException
	{
		SelectService.sendKeys(Service);//if we are clicking  on link then it should return landing page object
		Thread.sleep(3000);
		//Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_EmployeeInformation2_ddlDesignation']")));
	//	select.selectByIndex(1);
		
		
	}
	public procurment clickoncheckbox()
	{
		clickoncheckbox.click();//if we are clicking  on link then it should return landing page object
		return new procurment();
	}
}

