package com.freecrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		browserinitialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void validateTitleOfLoginPageTest() {
		String titleOfLoginPage = loginPage.validateTitleOfLoginPage();
		System.out.println(titleOfLoginPage);
		Assert.assertEquals("Cogmento CRM", titleOfLoginPage);
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
