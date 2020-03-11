package com.qa.Utils;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.qa.Constants.Constants;

public class Utils {
	



		static DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy/MM/dd hh.mm.ss");
		static LocalDateTime currenttime = LocalDateTime.now();
		static String time =dateformat.format(currenttime);
		
		// Explicit timeout function for web element - Click Event
		public static void clicksWithExPlicitTimeOut(WebDriver driver,int timeout, WebElement element) 
		{
			new WebDriverWait(driver, Constants.EXPLICITWAIT)
			.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		
		public static void mouseHover(WebDriver driver, WebElement element) throws Throwable {
			
			Actions actions = new Actions(driver);
			actions.moveToElement(element).build().perform();
			Thread.sleep(2000);
		}
		// Capturing Screenshot with specified name 
		
		public static String captureScreenshot(WebDriver driver, String screenShotName )
		{

			try {
				// Convert Webdriver Object to Screenshot
				TakesScreenshot ts = (TakesScreenshot)driver;
				
				// Calling getScreenshotAs method to create Image file
				File srcFile = ts.getScreenshotAs(OutputType.FILE);
				
				// Move Image file to New Destination path
				File DestFile = new File("./Screenshot/"+screenShotName+System.currentTimeMillis()+".png");
				
				// Copy the file at destination
				FileUtils.copyFile(srcFile, DestFile);
				
				Reporter.log("*******Screenshot captured for "+screenShotName+"*********", true);
			} catch (Exception e) {
				Reporter.log("Exeception while taking the Screenshot"+e.getMessage());
				e.printStackTrace();

			} 
			
			return screenShotName;

		}
		
		public static void explicitlyWait(WebDriver driver,WebElement element) 
		{
			WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICITWAIT);
			wait.until(ExpectedConditions.visibilityOf(element));
		}

}
