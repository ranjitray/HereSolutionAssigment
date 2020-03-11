package com.qa.TestCase;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.BaseClass.BaseClass;
import com.qa.Constants.Constants;
import com.qa.Pages.MapPage;
import com.qa.Utils.Utils;

public class MapTest extends BaseClass {
	
	MapPage mappage;
	
	
	@BeforeSuite
	public void Setup() {
		initialization();
		mappage = new MapPage();
	}
	
	public MapTest() {
		super();
		
	}
	
	@Test(priority = 1,description = "Click on JS link under Intercative Maps section")
	public void ClickOnJSLink()
	{
		logger1 = extent.createTest("Clicking on JS link under Intercative Maps section ");
		mappage.ClickOnMapJSLink();
		Utils.captureScreenshot(driver, "JSlinkClick");
		
	}
	
	@Test(priority = 2,description = "Verify page title after clicking on JS link under Inteeractive Maps")
	public void VerifyMapJSTitile()
	{
		logger1 = extent.createTest("Verify Page title of  JS link under Intercative Maps section ");
		String title = mappage.MapJSTitle();
		assertEquals(title, Constants.MAPJS_TITLE);
	
	}
	
	@Test(priority = 3,description = "Verify page header Text aftet clicking on JS ")
	public void VerifyMapJSHeaderText()
	{
		logger1 = extent.createTest("Verify Page header text on JS link under Intercative Maps section ");
		String headerText = mappage.MapJSHeaderText();
		assertEquals(headerText, Constants.MAPJS_HEADERTEXT);
	}
	
	
	@Test(priority = 4, description = "Clicking on SDK for Android Lite Edition")
	public void ClickOnAndroidLite() throws Throwable
	{
		logger1 = extent.createTest("Clicking on Android Lite Edition under Intercative Maps section ");
		mappage.MouseHoverMapSDK4Android();
		mappage.ClickOnMapSDK4AndrioidLite();
		Utils.captureScreenshot(driver, "Mouse Hover and Click Android Lite Edition");
		
	}
	
	@Test(priority = 5, description = "Verify page title --Map SDK for Android Lite Edition")
	public void VerifyMapSDK4AndroidLiteTitle()
	{
		logger1 = extent.createTest("Verify page title --Map SDK for Android Lite Edition");
		String title = mappage.VerifyMapSDK4AndrioidLiteTitle();
		assertEquals(title, Constants.MAPSDK_ANDROID_LITE_TITLE);
		
	}
	
	@Test(priority = 6, description = "Verify header Text - SDK for Android Lite Edition ")
	public void VerifyMapSDK4AndroidHeaderText()
	{
		logger1 = extent.createTest("Verify header Text - SDK for Android Lite Edition");
		String HeaderText = mappage.VerifyMapSDK4AndroidLiteHeaderText();
		assertEquals(HeaderText, Constants.MAPSDK_ANDROID_LITE_HEADERTEXT);
		
	}
	
	
	@Test(priority = 7, description = " Click on SDK for Android (Premium Edition)")
	public void ClickOnMapSDK4AndroidPremium() throws Throwable {
		
		logger1 = extent.createTest("Clicking on Android (Premium Edition) under Intercative Maps section ");
		mappage.ClickOnmapSDK4AndroidPremium();
		Utils.captureScreenshot(driver, "Mouse Hover and Click Android Premium Edition");
		
	}
	
	@Test(priority = 8, description = "Verify the title of SDK Andriod Premium Edition ")
	public void VerifyMapSDK4AndroidPremiumTitle()
	{
		logger1 = extent.createTest("Verify the title of SDK Andriod Premium Edition ");
		String title = mappage.VerifyMapSDK4AndrioidPremiumTitle();
		assertEquals(title, Constants.MAPSDK_ANDROID_PREMIUM_TITLE);
		
		
	}
	
	@Test(priority = 9, description = "Verify the Header Text of SDK Andriod Premium Edition ")
	public void VerifyMapSDK4AndroidPremiumHeaderText()
	{
		logger1 = extent.createTest("Verify the Header Text of SDK Andriod Premium Edition");
		String title = mappage.VerifyMapSDK4AndroidPremiumHeaderText();
		assertEquals(title, Constants.MAPSDK_ANDROID_PREMIUM_HEADERTEXT);
		
		
	}
	
	@Test(priority = 10, description = " Click on Andriod SDK Starter Edition ")
	public void ClickOnMapSDK4AndroidStarter() throws Throwable 
	{
		logger1 = extent.createTest("Clicking on Android (Standard Edition) under Intercative Maps section ");
		mappage.ClickOnmapSDK4AndroidStarter();
		Utils.captureScreenshot(driver, "Mouse Hover and Click Android Starter Edition");
		
	}
	
	@Test(priority = 11, description = "Verify the title of SDK Andriod Starter Edition ")
	public void VerifyMapSDK4AndroidStarterTitle()
	{
		logger1 = extent.createTest("Verify the title of SDK Andriod Starter Edition ");
		String title = mappage.VerifyMapSDK4AndrioidPremiumTitle();
		assertEquals(title, Constants.MAPSDK_ANDROID_STARTER_TITLE);
				
	}
	
	@Test(priority = 12, description = "Verify header text of SDK Andriod Starter ")
	public void VerifyMapSDK4AndroidStarterHeaderText()
	{
		logger1 = extent.createTest("Verify header text of SDK Andriod Starter ");
		String title = mappage.VerifyMapSDK4AndroidstarterHeaderText();
		assertEquals(title, Constants.MAPSDK_ANDROID_STARTER_HEADERTEXT);
		
	}
	
//	For  iOS SDK
	
	@Test(priority = 13, description = " Click on iOS SDK Lite Edition ")
	public void ClickOnMapSDK4iOSLite() throws Throwable {
		
		logger1 = extent.createTest("Clicking on iOS SDK Lite Edition under Intercative Maps section ");
		mappage.ClickOnMapSDK4iOSLite();
		Utils.captureScreenshot(driver, "Mouse Hover and Click iOS SDK Lite Edition");
		
	}
	
	@Test(priority = 14, description = "Verify the title of SDK iOS Lite Edition ")
	public void VerifyMapSDK4iOSLiteTitle() throws InterruptedException
	{
		logger1 = extent.createTest("Verify the title of SDK iOS Lite Edition ");
		String title = mappage.VerifyMapSDK4iOSLiteTitle();
		assertEquals(title, Constants.MAPSDK_iOS_LITE_TITLE);
		
	}
	@Test(priority = 15, description = "Verify the Header Text of SDK iOS Lite Edition ")
	public void VerifyMapSDK4iOSLiteHeaderText()
	{
		logger1 = extent.createTest("Verify the Header Text of SDK iOS Lite Edition");
		String title = mappage.VerifyMapSDK4iOSLiteHeaderText();
		assertEquals(title, Constants.MAPSDK_iOS_LITE_HEADERTEXT);
		
	}
	
	@Test(priority = 16, description = " Click on iOS SDK Premium Edition ")
	public void ClickOnMapSDK4iOSPremium() throws Throwable {
		
		logger1 = extent.createTest("Clicking on iOS SDK Premium Edition under Intercative Maps section ");
		mappage.ClickOnMapSDK4iOSLite();
		Utils.captureScreenshot(driver, "Mouse Hover and Click iOS SDK Premium Edition");
	}
	
	@Test(priority = 17, description = "Verify the title of SDK iOS Premium Edition ")
	public void VerifyMapSDK4iOSPremiumTitle() throws InterruptedException
	{
		logger1 = extent.createTest("Verify the title of SDK iOS Premium Edition ");
		String title = mappage.verifyMapSDK4iOSPremiumTitle();
		assertEquals(title, Constants.MAPSDK_iOS_PREMIUM_TITLE);
		
	}
	@Test(priority = 18, description = "Verify the Header Text of SDK iOS Premium Edition ")
	public void VerifyMapSDK4iOSPremiumHeaderText()
	{
		logger1 = extent.createTest("Verify the Header Text of SDK iOS Premium Edition  ");
		String title = mappage.VerifyMapSDK4iOSPremiumHeaderText();
		assertEquals(title, Constants.MAPSDK_iOS_PREMIUM_HEADERTEXT);
		
	}
	
	@Test(priority = 19, description = " Click on iOS SDK Starter Edition ")
	public void ClickOnMapSDK4iOSStarter() throws Throwable {
		
		logger1 = extent.createTest("Clicking on iOS SDK Standard Edition under Intercative Maps section ");
		mappage.ClickOnMapSDK4iOSLite();;
		Utils.captureScreenshot(driver, "Mouse Hover and Click iOS SDK Starter Edition");
	}
	
	@Test(priority = 20, description = "Verify the title of SDK iOS Starter Edition ")
	public void VerifyMapSDK4iOSStarterTitle() throws InterruptedException
	{
		logger1 = extent.createTest("Verify the title of SDK iOS Starter Edition ");
		String title = mappage.verifyMapSDK4iOSStarterTitle();
		assertEquals(title, Constants.MAPSDK_iOS_STARTER_TITLE);
		
	}
	@Test(priority = 21, description = "Verify the Header Text of SDK iOS Starter Edition ")
	public void VerifyMapSDK4iOSStarterHeaderText()
	{
		logger1 = extent.createTest("Verify the Header Text of SDK iOS Starter Edition ");
		String title = mappage.VerifyMapSDK4iOSStarterHeaderText();
		assertEquals(title, Constants.MAPSDK_iOS_STARTER_HEADERTEXT);
		
		
	}
	

}
