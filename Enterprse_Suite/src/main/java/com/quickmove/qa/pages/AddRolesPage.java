package com.quickmove.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quickmove.qa.base.TestBase;

public class AddRolesPage extends TestBase{
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_btnAdd']")
	WebElement clickonAddrollButton;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl0_chkModule']")
	WebElement clickonHome;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl0_lvSubModule_chkSubUserRight']")
	WebElement clickonHomeuser;
	
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl1_chkModule']")
	WebElement clickonMarketing;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl1_lvSubModule_chkSubUserRight']")
	WebElement clickonMarketinguser;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl2_chkModule']")
	WebElement clickonSales;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl2_lvSubModule_chkSubUserRight']")
	WebElement clickonSalesuser;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl3_chkModule']")
	WebElement clickonCustomerService;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl3_lvSubModule_chkSubUserRight']")
	WebElement clickonCustomerServiceuser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl4_chkModule']")
	WebElement clickonOperation;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl4_lvSubModule_chkSubUserRight']")
	WebElement clickonOperationuser;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl5_chkModule']")
	WebElement clickonShipping;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl5_lvSubModule_chkSubUserRight']")
	WebElement clickonShippinguser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl6_chkModule']")
	WebElement clickonStorage;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl6_lvSubModule_chkSubUserRight']")
	WebElement clickonStorageuser;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl7_chkModule']")
	WebElement clickonAgentService;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl7_lvSubModule_chkSubUserRight']")
	WebElement clickonAgentServiceuser;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl8_chkModule']")
	WebElement clickonRelo;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl8_lvSubModule_chkSubUserRight']")
	WebElement clickonRelouser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl9_chkModule']")
	WebElement clickonProcurment;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl9_lvSubModule_chkSubUserRight']")
	WebElement clickonProcurmentuser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl10_chkModule']")
	WebElement clickonBilling;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl10_lvSubModule_chkSubUserRight']")
	WebElement clickonBillinguser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl11_chkModule']")
	WebElement clickonAccounts;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl11_lvSubModule_chkSubUserRight']")
	WebElement clickonAccountsuser;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl12_chkModule']")
	WebElement clickonCustoms;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl12_lvSubModule_chkSubUserRight']")
	WebElement clickonCustomsuser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl13_chkModule']")
	WebElement clickonHR;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl13_lvSubModule_chkSubUserRight']")
	WebElement clickonHRuser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl14_chkModule']")
	WebElement clickonReports;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl14_lvSubModule_chkSubUserRight']")
	WebElement clickonReportsuser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl0_chkModuleCalender']")
	WebElement clickonSettings;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl0_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonSettingsuser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl1_chkModuleCalender']")
	WebElement clickonActivities;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl1_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonActivitiesuser;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl2_chkModuleCalender']")
	WebElement clickonAnnouncement;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl2_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonAnnouncementuser;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl3_chkModuleCalender']")
	WebElement clickonCalendar;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl3_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonCalendaruser;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl4_chkModuleCalender']")
	WebElement clickonOnlineUser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl5_chkModuleCalender']")
	WebElement clickonNotification;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl5_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonNotificationuser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl8_chkModule']")
	WebElement clickonReloservice;
	
	public AddRolesPage clickonReloservice() 
	{   
		clickonReloservice.click();
		return new AddRolesPage();
	} 
	
	
	public AddRolesPage()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	public AddRolesPage clickonHome() 
	{   
		clickonHome.click();
		return new AddRolesPage();
	} 
	
	public AddRolesPage clickonMarketing() 
	{   
		clickonMarketing.click();
		return new AddRolesPage();
	} 
	
	public AddRolesPage clickonSales() 
	{   
		clickonSales.click();
		return new AddRolesPage();
	} 
	public AddRolesPage clickonCustomerService() 
	{   
		clickonCustomerService.click();
		return new AddRolesPage();
	} 
	
	public AddRolesPage clickonOperation() 
	{   
		clickonOperation.click();
		return new AddRolesPage();
	} 
	

	public AddRolesPage clickonShipping() 
	{   
		clickonShipping.click();
		return new AddRolesPage();
	} 
	
	public AddRolesPage clickonStorage() 
	{   
		clickonStorage.click();
		return new AddRolesPage();
	} 
	
	
	public AddRolesPage clickonAgentService() 
	{   
		clickonAgentService.click();
		return new AddRolesPage();
	} 
	AddRolesPage clickonRelo() 
	{   
		clickonRelo.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickonProcurment() 
	{   
		clickonProcurment.click();
		return new AddRolesPage();
	}

	public AddRolesPage clickonBilling() 
	{   
		clickonBilling.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickonAccounts() 
	{   
		clickonAccounts.click();
		return new AddRolesPage();
	}
	public AddRolesPage clickonCustoms() 
	{   
		clickonCustoms.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickonHR() 
	{   
		clickonHR.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickonReports() 
	{   
		clickonReports.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickonSettings() 
	{   
		clickonSettings.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickonActivities() 
	{   
		clickonActivities.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickonAnnouncement() 
	{   
		clickonAnnouncement.click();
		return new AddRolesPage();
	}
	public AddRolesPage clickonCalendar() 
	{   
		clickonCalendar.click();
		return new AddRolesPage();
	}
	
	
	public AddRolesPage clickonOnlineUser() 
	{   
		clickonOnlineUser.click();
		return new AddRolesPage();
	}
	
	
	
	public AddRolesPage clickonNotification() 
	{   
		clickonNotification.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickonAddrollButton() 
	{   
		clickonAddrollButton.click();
		return new AddRolesPage();
	}
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtRoleName']")
	WebElement EnterRollName;
	
	public AddRolesPage EnterRollName(String enterrollname) 
	{   
		EnterRollName.sendKeys(enterrollname);
		return new AddRolesPage();
	}
}
