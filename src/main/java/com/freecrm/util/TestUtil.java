package com.freecrm.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.freecrm.base.TestBase;

public class TestUtil extends TestBase {

	public static long implicit_wait = 30;
	public static long page_load_timeOut = 30;

	public static void takeScreenshotForError() throws IOException {
		
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File scrPrint = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/screenshots/" + "Screenshot" + dateName
				+ ".png";
		FileUtils.copyFile(scrPrint, new File(destination));

	}

}
