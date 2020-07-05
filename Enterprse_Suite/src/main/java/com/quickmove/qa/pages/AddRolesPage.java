package com.quickmove.qa.pages;

import org.openqa.selenium.Keys;
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
	
	public AddRolesPage clickonHomeuser() 
	{   
		clickonHomeuser.click();
		return new AddRolesPage();
	} 
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl1_chkModule']")
	WebElement clickonMarketing;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl1_lvSubModule_chkSubUserRight']")
	WebElement clickonMarketinguser;
	
	public AddRolesPage clickonMarketinguser() 
	{   
		clickonMarketinguser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl2_chkModule']")
	WebElement clickonSales;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl2_lvSubModule_chkSubUserRight']")
	WebElement clickonSalesuser;
	public AddRolesPage clickonSalesuser() 
	{   
		clickonSalesuser.click();
		return new AddRolesPage();
	} 
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl3_chkModule']")
	WebElement clickonCustomerService;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl3_lvSubModule_chkSubUserRight']")
	WebElement clickonCustomerServiceuser;
	public AddRolesPage clickonCustomerServiceuser() 
	{   
		clickonCustomerServiceuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl4_chkModule']")
	WebElement clickonOperation;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl4_lvSubModule_chkSubUserRight']")
	WebElement clickonOperationuser;
	
	public AddRolesPage clickonOperationuser() 
	{   
		clickonOperationuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl5_chkModule']")
	WebElement clickonShipping;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl5_lvSubModule_chkSubUserRight']")
	WebElement clickonShippinguser;
	public AddRolesPage clickonShippinguser() 
	{   
		clickonShippinguser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl6_chkModule']")
	WebElement clickonStorage;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl6_lvSubModule_chkSubUserRight']")
	WebElement clickonStorageuser;
	
	public AddRolesPage clickonStorageuser() 
	{   
		clickonStorageuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl7_chkModule']")
	WebElement clickonAgentService;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl7_lvSubModule_chkSubUserRight']")
	WebElement clickonAgentServiceuser;
	
	public AddRolesPage clickonAgentServiceuser() 
	{   
		clickonAgentServiceuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl8_chkModule']")
	WebElement clickonRelo;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl8_lvSubModule_chkSubUserRight']")
	WebElement clickonRelouser;
	public AddRolesPage clickonRelouser() 
	{   
		clickonRelouser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl9_chkModule']")
	WebElement clickonProcurment;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl9_lvSubModule_chkSubUserRight']")
	WebElement clickonProcurmentuser;
	public AddRolesPage clickonProcurmentuser() 
	{   
		clickonProcurmentuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl10_chkModule']")
	WebElement clickonBilling;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl10_lvSubModule_chkSubUserRight']")
	WebElement clickonBillinguser;
	public AddRolesPage clickonBillinguser() 
	{   
		clickonBillinguser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl11_chkModule']")
	WebElement clickonAccounts;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl11_lvSubModule_chkSubUserRight']")
	WebElement clickonAccountsuser;
	
	public AddRolesPage clickonAccountsuser() 
	{   
		clickonAccountsuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl12_chkModule']")
	WebElement clickonCustoms;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl12_lvSubModule_chkSubUserRight']")
	WebElement clickonCustomsuser;
	public AddRolesPage clickonCustomsuser() 
	{   
		clickonCustomsuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl13_chkModule']")
	WebElement clickonHR;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl13_lvSubModule_chkSubUserRight']")
	WebElement clickonHRuser;
	public AddRolesPage clickonHRuser() 
	{   
		clickonHRuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl14_chkModule']")
	WebElement clickonReports;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvModule_ctrl14_lvSubModule_chkSubUserRight']")
	WebElement clickonReportsuser;
	public AddRolesPage clickonReportsuser() 
	{   
		clickonReportsuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl0_chkModuleCalender']")
	WebElement clickonSettings;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl0_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonSettingsuser;
	public AddRolesPage clickonSettingsuser() 
	{   
		clickonSettingsuser.click();
		return new AddRolesPage();
	} 
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl1_chkModuleCalender']")
	WebElement clickonActivities;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl1_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonActivitiesuser;
	
	public AddRolesPage clickonActivitiesuser() 
	{   
		clickonActivitiesuser.click();
		return new AddRolesPage();
	}
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl2_chkModuleCalender']")
	WebElement clickonAnnouncement;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl2_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonAnnouncementuser;
	
	public AddRolesPage clickonAnnouncementuser() 
	{   
		clickonAnnouncementuser.click();
		return new AddRolesPage();
	}
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl3_chkModuleCalender']")
	WebElement clickonCalendar;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl3_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonCalendaruser;
	
	public AddRolesPage clickonCalendaruser() 
	{   
		clickonCalendaruser.click();
		return new AddRolesPage();
	}
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl4_chkModuleCalender']")
	WebElement clickonOnlineUser;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl5_chkModuleCalender']")
	WebElement clickonNotification;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvCalender_ctrl5_lvSubModule1_chkModuleCalenderUserRight']")
	WebElement clickonNotificationuser;
	
	
	//inner sub menu
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlMenu']")
	WebElement clickoninnermenu;
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlSubMenu']")
	WebElement clickoninnermenusubmenu;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_lvInnerSubModule_chkInnerSubUserRight']")
	WebElement clickoninnermenusubmenuUSER;
	public AddRolesPage clickoninnermenusubmenuUSER() 
	{   
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickoninnermenuhome() 
	{   
		clickoninnermenu.sendKeys("Home");
		clickoninnermenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectMy_Account() 
	{   
		clickoninnermenusubmenu.sendKeys("My Account");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage Selecthome_DashBoard() 
	{   
		clickoninnermenusubmenu.sendKeys("Dashboard");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
	//	clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage SelectMarketing() 
	{   
		clickoninnermenu.sendKeys("Marketing");
		clickoninnermenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectMarketingsubmenucampaign() 
	{   
		clickoninnermenusubmenu.sendKeys("campaigns");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectSales() 
	{   
		clickoninnermenu.sendKeys("Sales");
		clickoninnermenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectSalessubmenuAccounts() 
	{   
		clickoninnermenusubmenu.sendKeys("Accounts");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage selectCampaigns() 
	{   
		clickoninnermenusubmenu.sendKeys("campaigns");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectServices() 
	{   
		clickoninnermenu.sendKeys("Services");
		clickoninnermenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectSetting() 
	{   
		clickoninnermenu.sendKeys("Setting");
		clickoninnermenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectSettingsubcommon() 
	{   
		clickoninnermenusubmenu.sendKeys("Common");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectSetting_sub_User_mangment() 
	{   
		clickoninnermenusubmenu.sendKeys("User Management");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage SelectSetting_sub_Templates() 
	{   
		clickoninnermenusubmenu.sendKeys("Templates");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage SelectReports() 
	{   
		clickoninnermenu.sendKeys("Reports");
		clickoninnermenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectReports_Sales() 
	{   
		clickoninnermenusubmenu.sendKeys("Sales");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		//clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage SelectReports_Services() 
	{   
		clickoninnermenusubmenu.sendKeys("Services");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage SelectReports_Operation() 
	{   
		clickoninnermenusubmenu.sendKeys("Operation");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage SelectReports_Shipping() 
	{   
		clickoninnermenusubmenu.sendKeys("Shipping");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage SelectReports_Storage() 
	{   
		clickoninnermenusubmenu.sendKeys("Storage");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage SelectReports_Billing() 
	{   
		clickoninnermenusubmenu.sendKeys("Billing");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage SelectAccounts() 
	{   
		clickoninnermenu.sendKeys("Accounts");
		clickoninnermenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage SelectAccounts_Masters() 
	{   
		clickoninnermenusubmenu.sendKeys("Masters");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
	//	clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage SelectAccounts_Voucher() 
	{   
		clickoninnermenusubmenu.sendKeys("Voucher");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage SelectAccounts_Ledger() 
	{   
		clickoninnermenusubmenu.sendKeys("Ledger");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage SelectAccounts_Financials() 
	{   
		clickoninnermenusubmenu.sendKeys("Financials");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
		clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	public AddRolesPage selectprocurement() 
	{   
		clickoninnermenu.sendKeys("procurement");
		clickoninnermenu.sendKeys(Keys.ENTER);
		return new AddRolesPage();
	}
	public AddRolesPage selectprocurement_vendor() 
	{   
		clickoninnermenusubmenu.sendKeys("Vendor");
		clickoninnermenusubmenu.sendKeys(Keys.ENTER);
	//	clickoninnermenusubmenuUSER.click();
		return new AddRolesPage();
	}
	
	public AddRolesPage clickonNotificationuser() 
	{   
		clickonNotificationuser.click();
		return new AddRolesPage();
	}

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
