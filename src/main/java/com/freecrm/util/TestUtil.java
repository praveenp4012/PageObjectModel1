package com.freecrm.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.freecrm.base.TestBase;

public class TestUtil extends TestBase {

	public static long implicit_wait = 30;
	public static long page_load_timeOut = 30;

	public static void takeScreenshotForError() throws IOException {
		File scrPrint = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String currDirect = System.getProperty("user.dir");

		FileUtils.copyFile(scrPrint, new File(currDirect + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}

}
