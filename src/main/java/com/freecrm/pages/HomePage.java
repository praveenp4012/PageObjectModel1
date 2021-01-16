package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.TestBase;

public class HomePage extends TestBase {
	
	ContactsPage contactsPage;
	CompaniesPage companiesPage;	
	DealsPage dealsPage;
	
	@FindBy(xpath="//span[text()='Praveen P']")
	WebElement usernameLabel;
	
	@FindBy(xpath="//div[@class='header item11']")
	WebElement crmLogo;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactsButton;

	@FindBy(xpath="//span[text()='Companies']")
	WebElement companiesButton;
	
	@FindBy(xpath="//span[text()='Deals']")
	WebElement dealsButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitleOfHomePage() {
		return driver.getTitle();
	}
	
	public boolean validateUsernameLabel() {
		return usernameLabel.isDisplayed();
	}
	
	public boolean validateCrmLogo() {
		return crmLogo.isDisplayed();
	}
	
	public ContactsPage clickOnContactsButton() {
		Actions act = new Actions(driver);
		act.moveToElement(contactsButton).click().perform();
		return contactsPage;		
	}
	
	public CompaniesPage clickOnCompaniesButton() {
		Actions act = new Actions(driver);
		act.moveToElement(companiesButton).click().perform();
		return companiesPage;		
	}
	
	public DealsPage clickOnDealsButton() {
		Actions act = new Actions(driver);
		act.moveToElement(dealsButton).click().perform();
		return dealsPage;		
	}	
	
}

