package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//div[text()='Contacts']")
	WebElement contactsTextLabel;
	
	@FindBy(xpath="//a[contains(@href,'new')]")
	WebElement addNewContactBtn;
	
	@FindBy(name="first_name")
	WebElement firstNameTextBox;
	
	@FindBy(name="last_name")
	WebElement lastNameTextBox;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement emailAddTextBox;
	
	@FindBy(name="position")
	WebElement positionTextBox;
	
	@FindBy(xpath="//div[@name='company']//input")
	WebElement companyTextBox;
	
	@FindBy(xpath="//button[contains(@class,'linkedin')]")
	WebElement saveBtn;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateContactsLabel() {
		return contactsTextLabel.isDisplayed();
	}
	
	public void addNewContact() {
		addNewContactBtn.click();
		firstNameTextBox.sendKeys(prop.getProperty("firstname1"));
		lastNameTextBox.sendKeys(prop.getProperty("lastname1"));
		emailAddTextBox.sendKeys(prop.getProperty("email1"));
		positionTextBox.sendKeys(prop.getProperty("position1"));
		companyTextBox.sendKeys(prop.getProperty("company1"));
		saveBtn.click();
	}
 
}
