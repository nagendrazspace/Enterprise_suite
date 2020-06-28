package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class CostingProfilePage extends TestBase {
	//a[@id='ctl00_ContentPlaceHolder1_rpCostingActivities_ctl01_ibtnAddSubActivity']
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ibtnAddCostingActivtities']")
	WebElement ClickonAddcostingBtton;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtActivityCode']")
	WebElement EnterCode;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtActivityName']")
	WebElement EnterActivityName;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ibtnSaveActivity']")
	WebElement ClickonActivitysavebutton;
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_rpCostingActivities_ctl01_ibtnAddSubActivity']")
	WebElement ClickonAddsubactivitybutton;
	public CostingProfilePage ClickonAddsubactivitybutton()
	{
		ClickonAddsubactivitybutton.click();
		return new CostingProfilePage();
	}
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtSubActivityName']")
	WebElement EnterSubactivityName;
	public CostingProfilePage EnterSubactivityName(String entersubactivty)
	{
		EnterSubactivityName.sendKeys(entersubactivty);
		return new CostingProfilePage();
	}
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtSubGeneralLedger']")
	WebElement Selectaccounttypeincome;
	public CostingProfilePage Selectaccounttypeincome(String accountypename)
	{
		Selectaccounttypeincome.sendKeys(accountypename);
	Selectaccounttypeincome.sendKeys(Keys.ARROW_DOWN);
	Selectaccounttypeincome.sendKeys(Keys.ENTER);
		//Select select=new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtSubGeneralLedger']")));
		return new CostingProfilePage();
	}
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtExpenseGlSubGlLedger']")
	WebElement Selectaccounttypeexpense;
	public CostingProfilePage Selectaccounttypeexpense(String accounttypenameexepnse)
	{
		Selectaccounttypeexpense.sendKeys(accounttypenameexepnse);
		Selectaccounttypeexpense.sendKeys(Keys.ARROW_DOWN);
		Selectaccounttypeexpense.sendKeys(Keys.ENTER);
		//Select select=new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtSubGeneralLedger']")));
		return new CostingProfilePage();
	}
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")
	WebElement SelectProductype;
	
	public CostingProfilePage SelectProductype()
	{
		SelectProductype.click();
	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
	select.selectByIndex(1);	
	
	return new CostingProfilePage();
	}
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlUnitType']")
	WebElement SelectUnittype;
	public CostingProfilePage SelectUnittype()
	{
		SelectUnittype.click();
	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlUnitType']")));
	select.selectByIndex(1);	
	
	return new CostingProfilePage();
	}
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlTransportMode']")
	WebElement SelectTransportMode;
	public CostingProfilePage SelectTransportMode()
	{
		SelectTransportMode.click();
	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlTransportMode']")));
	select.selectByIndex(1);	
	
	return new CostingProfilePage();
	}
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlShippingType']")
	WebElement SelectShipmentype;
	public CostingProfilePage SelectShipmentype()
	{
		SelectShipmentype.click();
	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlShippingType']")));
	select.selectByIndex(1);	
	
	return new CostingProfilePage();
	}
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtPrice']")
	WebElement EnterProvisionalcost;
	public CostingProfilePage EnterProvisionalcost(String enterProvisionalcost)
	{
		EnterProvisionalcost.sendKeys(enterProvisionalcost);
		return new CostingProfilePage();
	}
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_cbIsProvisionalCost']")
	WebElement SelectEditProvisionalcost;
	
	public CostingProfilePage SelectEditProvisionalcost()
	{
		SelectEditProvisionalcost.click();
		return new CostingProfilePage();
	}
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtMinAmount']")
	WebElement EnterMiniumamount;
	public CostingProfilePage EnterMiniumamount(String enterMinimumcost)
	{
		EnterMiniumamount.sendKeys(enterMinimumcost);
		return new CostingProfilePage();
	}
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_cbxIsAutoCosting']")
	WebElement SelectAutoCost;
	public CostingProfilePage SelectAutoCost()
	{
		SelectAutoCost.click();
		return new CostingProfilePage();
	}
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_chkSubsidary_0']")
	WebElement SelectSubsidiary;
	public CostingProfilePage SelectSubsidiary()
	{
		SelectSubsidiary.click();
		return new CostingProfilePage();
	}
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ibtnSaveSubActivity']")
	WebElement Clickonsavesubactivtybutton;
	
	public CostingProfilePage Clickonsavesubactivtybutton()
	{
		Clickonsavesubactivtybutton.click();
		return new CostingProfilePage();
	}
	public CostingProfilePage()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	public CostingProfilePage ClickonAddcostingBtton()
	{
		ClickonAddcostingBtton.click();
		return new CostingProfilePage();
	}
	public CostingProfilePage ClickonActivitysavebutton()
	{
		ClickonActivitysavebutton.click();
		return new CostingProfilePage();
	}
	public CostingProfilePage EnterCode(String entercode)
	{
		EnterCode.sendKeys(entercode);
		return new CostingProfilePage();
	}
	public CostingProfilePage EnterActivityName(String enteractivtyname)
	{
		EnterActivityName.sendKeys(enteractivtyname);
		return new CostingProfilePage();
	}
}
