package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class JobOrder extends TestBase{
	public  JobOrder()
	{
		PageFactory.initElements(driver, this);
	}
	
	
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
	
	
	public void Enterjobpageaddress(){
		
		Enterjobpageaddress.sendKeys("abc");
		
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

}


