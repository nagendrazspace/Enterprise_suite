package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class JobOrder extends TestBase{
	public  JobOrder()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolder1_Order_imgbtnCreateOrder']")
	WebElement Clickonaddbuttonoborder;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlOrderFrom']")
	WebElement orderFrom;
	
	
	
	
	
	@FindBy(xpath="//textarea[@id='ctl00_ContentPlaceHolder1_Order_txtIndividualAddress']")
	WebElement Enterjobpageaddress;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlIndividualCountry']")
	WebElement Selectcustomercountry;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlIndivdualCity']")
	WebElement Selectcustomercity;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlCustomerAccountManager']")
	WebElement SelectAccountmanager;
		
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlShipmentType']")
	WebElement SelectShipmettype;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddloutsourceTyp']")
	WebElement SelectOutsourcetype;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlOriginBranchID']")
	WebElement SelectOriginbranch;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlDestinationBranchID']")
	WebElement SelectDestinatinbranch;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlOrderStatus']")
	WebElement SelectOrderStatus;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_Order_ImgbtnSave']")
	WebElement SaveJoborderbutton;
	
	
	@FindBy(id="ctl00_ContentPlaceHolder1_Order_txtJobCorordinator")
	WebElement selectcoordinator;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlIndSalutation']")
	WebElement Selectsalutation;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Order_txtIndividualName']")
	WebElement EnterfirstName;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Order_txtCustomerMiddileName']")
	WebElement EnterMiddleName;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Order_txtLastName']")
	WebElement EnterLastName;
	@FindBy(xpath="//body[@id='ctl00_home']/form[@id='aspnetForm']/div[@id='slideContent']/div/div[@id='divEnquiryPageHeader']/div/div[@id='ctl00_ContentPlaceHolder1_Order_ctl00']/div[@id='ctl00_ContentPlaceHolder1_Order_divCustomerDetails']/div[@id='ctl00_ContentPlaceHolder1_Order_divCustomerCollapseContent']/div/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]")
	WebElement Entercountrycode;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Order_txtIndivisualMobile']")
	WebElement EnterMobile;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlService']")
	WebElement servicetype;
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlGoodTypeValue']")
	WebElement Goodstype;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlProductTypeValue']")
	WebElement producttype;
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddltramsportMode']")
	WebElement Transportmode;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_Order_ddlShipmentType']")
	WebElement shipmenttype;
	@FindBy(xpath="//textarea[@id='ctl00_ContentPlaceHolder1_Order_txtOriginAddress']")
	WebElement originaddress;
	
	@FindBy(xpath="//textarea[@id='ctl00_ContentPlaceHolder1_Order_txtDestinationAddress']")
	WebElement Destinationaddress;
	
	
	
	
	public void originaddress(String enterorigin){
		
		originaddress.sendKeys(enterorigin);
						
					}
	public void Destinationaddress(String enterdestination){
		
		Destinationaddress.sendKeys(enterdestination);
						
					}
	
	
public void shipmenttype(String selectshipment){
		
	shipmenttype.sendKeys(selectshipment);
					
				}
	public void Transportmode(String mode){
		
		Transportmode.sendKeys(mode);
					
				}
public void producttype(String enterproducttype){
		
	producttype.sendKeys(enterproducttype);
				
			}
public void Goodstype(String entergoodstype){
		
	Goodstype.sendKeys(entergoodstype);
				
			}
	public void servicetype(String enterservicetype){
		
		servicetype.sendKeys(enterservicetype);
				
			}
	
public void EnterMobile(String mobile){
		
	EnterMobile.sendKeys(mobile);
			
		}
	public void Entercountrycode(String countrycode) throws InterruptedException{
		Entercountrycode.click();
		Thread.sleep(2000);
//		Actions action= new Actions(driver);
//	action.moveToElement(driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_Order_divCustomerDetails']//div[1]//ul[1]//li[2]//div[1]//div[1]//ul[1]")));
//		action.build();
//		action.click();
/*		
	Select sel= new Select(driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_Order_divCustomerDetails']//div[1]//ul[1]//li[2]//div[1]//div[1]//ul[1]")));	
		
	sel.selectByVisibleText("India");
	Thread.sleep(2000);
		Entercountrycode.sendKeys(countrycode);
			*/
		}
	//div[@id='ctl00_ContentPlaceHolder1_Order_divCustomerDetails']//div[1]//ul[1]//li[2]//div[1]//div[1]//ul[1]
	
public void Selectsalutation(String salutation){
		
	Selectsalutation.sendKeys(salutation);
		
	}
public void EnterfirstName(String firstname){
	
	EnterfirstName.sendKeys(firstname);
		
	}
public void EnterMiddleName(String Mname) throws InterruptedException{
	EnterMiddleName.click();
	Thread.sleep(3000);
	EnterMiddleName.sendKeys(Mname);
		
	}
public void EnterLastName(String Lname){
	
	EnterLastName.sendKeys(Lname);
		
	}
	
	public void orderFrom() throws InterruptedException{
		orderFrom.sendKeys("Direct Order");
		Thread.sleep(2000);
	
			
		}
	
	
	public void Clickonaddbuttonoborder(){

		Clickonaddbuttonoborder.click();
	}
	public void Enterjobpageaddress(String Enteraddress){
		
		Enterjobpageaddress.sendKeys(Enteraddress);
		
	}
	
	public void selectcoordinator() throws InterruptedException{
		selectcoordinator.sendKeys("subim");
		Thread.sleep(2000);
		selectcoordinator.sendKeys(Keys.ARROW_DOWN);
	
		selectcoordinator.sendKeys(Keys.ENTER);
			
		}
	
	
public void Selectcustomercountry(){
	Selectcustomercountry.click();
		Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddlIndividualCountry']")));
		select.selectByIndex(1);
	}
	

public void Selectcustomercity(){
	Selectcustomercity.click();
	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddlIndivdualCity']")));
	select.selectByIndex(1);
}


public void SelectAccountmanager(){
	SelectAccountmanager.click();
	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddlCustomerAccountManager']")));
	select.selectByIndex(1);
}
public void SelectShipmettype(){
	SelectShipmettype.click();
	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddlShipmentType']")));
	select.selectByIndex(1);
}


public void SelectOutsourcetype(){
	SelectOutsourcetype.click();
Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddloutsourceTyp']")));
select.selectByIndex(1);
}


public void SelectOriginbranch(){
	SelectOriginbranch.click();
Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddlOriginBranchID']")));
select.selectByIndex(1);
}
public void SelectDestinatinbranch(){
	SelectDestinatinbranch.click();
	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddlDestinationBranchID']")));
	select.selectByIndex(1);
}


public void SelectOrderStatus(){
	SelectOrderStatus.click();
Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Order_ddlOrderStatus']")));
select.selectByIndex(3);
}


public void SaveJoborderbutton(){

	SaveJoborderbutton.click();
}
public void setdate(String date) {
	WebElement setdate=driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Order_txtPackingDate']"));
	setdate.sendKeys(date);
//	((JavascriptExecutor)driver).executeScript("document.getElementById('ctl00_ContentPlaceHolder1_Order_txtPackingDate').setAttribute('value',date)");
}

}


