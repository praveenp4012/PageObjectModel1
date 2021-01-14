package com.freecrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pages.ContactsPage;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		browserinitialization();				
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = new HomePage();
		contactsPage = homePage.clickOnContactsButton();
		//contactsPage = new ContactsPage();	
		
	}
	
	@Test(priority=1)
	public void validateContactsLabelTest() {
		contactsPage = new ContactsPage();		
		boolean contactLabel = contactsPage.validateContactsLabel();
		Assert.assertTrue(contactLabel);
	}
	
	@Test(priority=2)
	public void addNewContactTest() {
		contactsPage = new ContactsPage();		
		contactsPage.addNewContact();
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("===Success===");
		driver.close();		
	}

}
