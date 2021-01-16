package com.freecrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pages.CompaniesPage;
import com.freecrm.pages.ContactsPage;
import com.freecrm.pages.DealsPage;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	CompaniesPage companiesPage;	
	DealsPage dealsPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		browserinitialization();
		loginPage = new LoginPage();
		//homePage = new HomePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
	}
	
	@Test(priority=1)
	public void validateTitleOfHomePageTest() {
		homePage = new HomePage();
		String titleofHomePage = homePage.validateTitleOfHomePage();
		Assert.assertEquals("Cogmento CRM", titleofHomePage);
	}
	
	/*@Test(priority=2)
	public void validateUsernameLabelTest() {
		homePage = new HomePage();
		boolean userNameLabelOfHomePage = homePage.validateUsernameLabel();
		Assert.assertTrue(userNameLabelOfHomePage);
	}*/
	
	@Test(priority=3)
	public void validateCrmLogoTest() {
		homePage = new HomePage();
		boolean crmLogoOfHomePage = homePage.validateCrmLogo();
		Assert.assertTrue(crmLogoOfHomePage);
	}
	
	/*@Test(priority=4)
	public void clickOnContactsButtonTest() {
		homePage = new HomePage();
		contactsPage = homePage.clickOnContactsButton();
	}
	
	@Test(priority=5)
	public void clickOnCompaniesButtonTest() {
		homePage = new HomePage();
		companiesPage = homePage.clickOnCompaniesButton();
	}
	
	@Test(priority=6)
	public void clickOnDealsButtonTest() {
		homePage = new HomePage();
		dealsPage = homePage.clickOnDealsButton();
	}*/
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("===========");
	}

}
