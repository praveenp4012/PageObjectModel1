/*package com.freecrm.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pages.ContactsPage;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.LoginPage;
import com.freecrm.util.TestDataUtil;

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
	public void addNewContactParamTest() {
		contactsPage = new ContactsPage();		
		contactsPage.addNewContactParam("Sachin","Tend","sachin.ten@gmail.com","Batsman");
	}
	
	@Test(priority=3)
	public void addNewContactPropTest() {
		contactsPage = new ContactsPage();		
		contactsPage.addNewContactProp();
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestDataUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData" , priority=3)
	public void addNewContactExcelTest(String firstnm, String lastnm, String email, String position) {
		contactsPage = new ContactsPage();		
		contactsPage.addNewContactExcel(firstnm, lastnm, email, position);
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("===Success===");
		//driver.close();		
	}

}
*/