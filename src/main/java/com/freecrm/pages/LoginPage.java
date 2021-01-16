package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.TestBase;

public class LoginPage extends TestBase {
	
	HomePage homePage;

	// Page Factory or Object Repository of Login Page
	@FindBy(xpath = "//input[@name='email333']")
	WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//div[contains(@class,'submit')]")
	WebElement loginButton;

	@FindBy(xpath = "//a[text()='Sign Up']")
	WebElement signupButton;

	// Initializing Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	public String validateTitleOfLoginPage() {
		return driver.getTitle();
	}
	
	public HomePage login(String user, String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();		
		return homePage;
	}

}
