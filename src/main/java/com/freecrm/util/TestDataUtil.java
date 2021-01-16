package com.freecrm.util;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestDataUtil {

	public static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		try {
			reader = new Xls_Reader(
					"F:\\Selenium\\PageObjectModel1\\src\\main\\java\\com\\freecrm\\testdata\\TestData_POM1.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 2; i <= 5; i++) {

			String firstname = reader.getCellData("TeamIndia", 0, i);
			String lastname = reader.getCellData("TeamIndia", 1, i);
			String email = reader.getCellData("TeamIndia", 2, i);
			String position = reader.getCellData("TeamIndia", 3, i);

			Object[] ob = { firstname, lastname, email, position };
			myData.add(ob);

		}

		return myData;

	}

}
