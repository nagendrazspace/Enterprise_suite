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
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_chbxIsVariable']")
	WebElement Ismultiple;

	public CostingProfilePage Ismultiple(String IsMultiple)
	{
		Ismultiple.sendKeys(IsMultiple);
		Ismultiple.click();
		return new CostingProfilePage();
	}


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

	public CostingProfilePage SelectProductype(String productype)
	{
		SelectProductype.click();

		SelectProductype.sendKeys(productype);

		//Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProductType']")));
		//	select.selectByIndex(1);	

		return new CostingProfilePage();
	}
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlUnit']")
	WebElement SelectUnit;

	public CostingProfilePage SelectUnit(String unit)
	{
		SelectUnit.click();
		SelectUnit.sendKeys(unit);
		return new CostingProfilePage();
	}
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlBaseCurrency']")
	WebElement SelectCurrency;
	public CostingProfilePage SelectCurrency(String currency)
	{
		SelectCurrency.click();
		SelectCurrency.sendKeys(currency);
		//	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlUnitType']")));
		//	select.selectByIndex(1);	

		return new CostingProfilePage();
	}

	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlUnitType']")
	WebElement SelectUnittype;
	public CostingProfilePage SelectUnittype(String unitype)
	{
		SelectUnittype.click();
		SelectUnittype.sendKeys(unitype);
		SelectUnittype.sendKeys(Keys.ENTER);

		//	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlUnitType']")));
		//	select.selectByIndex(1);	

		return new CostingProfilePage();
	}

	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlTransportMode']")
	WebElement SelectTransportMode;
	public CostingProfilePage SelectTransportMode(String Transporte)
	{
		//	SelectTransportMode.click();

		SelectTransportMode.sendKeys(Transporte);


		//	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlTransportMode']")));
		//	select.selectByIndex(1);	

		return new CostingProfilePage();
	}

	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlShippingType']")
	WebElement SelectShipmentype;
	public CostingProfilePage SelectShipmentype(String Shipmenttype)
	{
		SelectShipmentype.click();
		SelectShipmentype.sendKeys(Shipmenttype);

		//	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlShippingType']")));
		//	select.selectByIndex(1);	

		return new CostingProfilePage();
	}
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtPrice']")
	WebElement EnterProvisionalcost;
	public CostingProfilePage EnterProvisionalcost(String enterProvisionalcost) throws InterruptedException
	{EnterProvisionalcost.click();
	Thread.sleep(2000);
	EnterProvisionalcost.sendKeys(""+enterProvisionalcost);
	//String.valueOf(enterProvisionalcost)
	return new CostingProfilePage();
	}
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_cbIsProvisionalCost']")
	WebElement SelectEditProvisionalcost;

	public CostingProfilePage SelectEditProvisionalcost(String Selectcheckbox)
	{
		SelectEditProvisionalcost.sendKeys(Selectcheckbox);
		SelectEditProvisionalcost.click();
		return new CostingProfilePage();
	}

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtMinAmount']")
	WebElement EnterMiniumamount;
	public CostingProfilePage EnterMiniumamount(String enterMinimumcost) throws InterruptedException
	{
		EnterMiniumamount.click();
		Thread.sleep(2000);
		EnterMiniumamount.sendKeys(""+enterMinimumcost);
		return new CostingProfilePage();
	}

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_cbxIsAutoCosting']")
	WebElement SelectAutoCost;
	public CostingProfilePage SelectAutoCost(String Selectautocost)
	{
		SelectAutoCost.sendKeys(Selectautocost);
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
	public void sendactivity(String act) {
		  String before_xpath1="/html[1]/body[1]/form[1]/div[7]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/table[1]/tbody[1]/tr[";
		 String After_xpath1="]/td[3]";
	for(int j=2;j<=20;j++){
		 if(j%2!=0) {
		
		String subactivitymatch=driver.findElement(By.xpath(before_xpath1+(j)+After_xpath1)).getText();
	
	if(subactivitymatch.contains(act))
	{
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[7]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+(j)+"]/td[13]")).click();
	}
		 }
	
}
	}
}
