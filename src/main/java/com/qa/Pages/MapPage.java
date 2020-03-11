package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.BaseClass.BaseClass;
import com.qa.Constants.Constants;
import com.qa.Utils.Utils;

public class MapPage extends BaseClass{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICITWAIT);
	
//	Locator - JS SDK
	@FindBy(xpath="//div[@id='maps_ff_doc_tag']//span[@class='cta__content'][contains(text(),'JS')]")
	WebElement MapJSlink;
	
	@FindBy(xpath="//h1[contains(text(),'Maps API for Javascript')] ")
	WebElement MapJSHeaderText;
	
	@FindBy(tagName="h1")
	WebElement MapJSHeader;
	
//	Locator - Android SDK
	
	@FindBy(xpath="//div[@id='maps_ff_doc_tag']//div[@class='cta cta--inline cta--developer cta__content'][contains(text(),'HERE SDK for Android')] ")
	WebElement MapSDKforAndroid;

	@FindBy(xpath="//div[@id='maps_ff_doc_tag']//ul//li//span[@class='cta__content'][contains(text(),'SDK for Android (Lite Edition)')] ")
	WebElement MapSDK4Andriodlite;
	
	@FindBy(tagName="h1")
	WebElement MapSDk4AndriodliteHeader;

	
	@FindBy(xpath="//div[@id='routing_api']//ul//li//span[@class='cta__content'][contains(text(),'SDK for Android (Premium Edition)')] ")
	WebElement MapSDK4AndroidPremium;
	
	@FindBy(tagName="h1")
	WebElement MapSDK4AndriodPremiumHeader;
	 
	@FindBy(xpath="//div[@id='maps_ff_doc_tag']//ul//li//span[@class='cta__content'][contains(text(),'SDK for Android (Starter Edition)')] ")
	WebElement MapSDK4AdroidStarter;
	
	@FindBy(tagName="h1")
	WebElement MapSDK4AndriodStarterHeader;
	
	
//	Locator for iOS SDK 
	@FindBy(xpath="//div[@id='maps_ff_doc_tag']//div[@class='cta cta--inline cta--developer cta__content'][contains(text(),'HERE SDK for iOS')] ")
	WebElement MapSDK4iOS;
	
	@FindBy(xpath="//div[@id='maps_ff_doc_tag']//ul//li//span[@class='cta__content'][contains(text(),'SDK for iOS (Lite Edition)')] ")
	WebElement MapSDK4iOSLite;
	
	@FindBy(tagName="h1")
	WebElement MapSDK4iOSLiteHeader;
	
	@FindBy(xpath="//div[@id='maps_ff_doc_tag']//ul//li//span[@class='cta__content'][contains(text(),'SDK for Android (Premium Edition)')] ")
	WebElement MapSDK4iOSPremium;
	
	@FindBy(tagName="h1")
	WebElement MapSDK4iOSPremiumHeader;
	
	@FindBy(xpath="//div[@id='maps_ff_doc_tag']//ul//li//span[@class='cta__content'][contains(text(),'SDK for iOS (Starter Edition)')] ")
	WebElement MapSDK4iOSStarter;
	
	@FindBy(tagName="h1")
	WebElement MapSDK4iOSStarterHeader;
		
	
	public MapPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnMapJSLink()
	{
		MapJSlink.click();
	}
	
	public String MapJSTitle() 
	{
		System.out.println("MapJSTitle==>"+ driver.getTitle());
		
		return driver.getTitle();
	}
	
	public String MapJSHeaderText()
	{
//		WebElement header1 = driver.findElement(By.tagName("h1"));
		System.out.println("Map JS Header Text-->"+MapJSHeader.getText());
		return  MapJSHeader.getText();
	}
	
	public void MouseHoverMapSDK4Android() throws Throwable {
		driver.navigate().back();
		Utils.mouseHover(driver, MapSDKforAndroid);
	}
	
	public void ClickOnMapSDK4AndrioidLite() throws InterruptedException
	{	
		Utils.explicitlyWait(driver, MapSDK4Andriodlite);
		MapSDK4Andriodlite.click();
		Thread.sleep(2000);
	}
	
	public String VerifyMapSDK4AndrioidLiteTitle()
	{
		
		System.out.println("MapSDK4AndrioidLiteTitle==>"+ driver.getTitle());
		return driver.getTitle();
	}
	
	public String VerifyMapSDK4AndroidLiteHeaderText()
	{
		System.out.println("Map SDK For Android Lite Header Text-->"+MapSDk4AndriodliteHeader.getText());
		return MapSDk4AndriodliteHeader.getText();
		
	}
	
	public void ClickOnmapSDK4AndroidPremium() throws Throwable
	{
		driver.navigate().back();
		Utils.mouseHover(driver, MapSDKforAndroid);
		js.executeScript("window.scrollBy(0,2000)");
		MapSDK4AndroidPremium.click();
	}
	
	public String VerifyMapSDK4AndrioidPremiumTitle()
	{
		
//		wait.until(ExpectedConditions.titleContains(Constants.MAPSDK_ANDROID_PREMIUM_TITLE));
		return driver.getTitle();
	}
	
	public String VerifyMapSDK4AndroidPremiumHeaderText()
	{
		System.out.println("Map SDK For Android Premium Header Text-->"+MapSDK4AndriodPremiumHeader.getText());
		return MapSDK4AndriodPremiumHeader.getText();
		
	}
	
	public void ClickOnmapSDK4AndroidStarter() throws Throwable
	{
		driver.navigate().back();
//		js.executeScript("arguments[0].scrollIntoView(true);",MapSDKforAndroid);
		js.executeScript("window.scrollBy(0,2000)");
		Utils.mouseHover(driver, MapSDKforAndroid);
		MapSDK4AdroidStarter.click();
	}
	
	public String VerifyMapSDK4AndrioidStarterTitle()
	{
		
		wait.until(ExpectedConditions.titleContains(Constants.MAPSDK_ANDROID_STARTER_TITLE));
		return driver.getTitle();
	}
	
	public String VerifyMapSDK4AndroidstarterHeaderText()
	{
		System.out.println("Map SDK For Android Starter Header Text-->"+MapSDK4AndriodStarterHeader.getText());
		return MapSDK4AndriodStarterHeader.getText();
		
	}
	
//	iOS
	public void ClickOnMapSDK4iOSLite() throws Throwable
	{
		driver.navigate().back();
		
		js.executeScript("window.scrollBy(0,2200)");
//		js.executeScript("arguments[0].scrollIntoView(true);",MapSDK4iOS);
		Utils.mouseHover(driver, MapSDK4iOS);
		MapSDK4iOSLite.click();
//		Thread.sleep(2000);
	}
	
	public String VerifyMapSDK4iOSLiteTitle() throws InterruptedException
	{
		
		Thread.sleep(1000);
		System.out.println("MapSDK4iOSLiteTitle==>"+ driver.getTitle());
//		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICITWAIT);
//		wait.until(ExpectedConditions.titleContains(Constants.MAPSDK_iOS_LITE_TITLE));
		return driver.getTitle();
	}
	
	public String VerifyMapSDK4iOSLiteHeaderText()
	{
		System.out.println("Map SDK For iOS Lite Header Text-->"+MapSDk4AndriodliteHeader.getText());
		return MapSDK4iOSLiteHeader.getText();
		
	}
	
	public void ClickOnMapSDK4iOSPremium() throws Throwable
	{
		driver.navigate().back();
		
		js.executeScript("window.scrollBy(0,2200)");
		Utils.mouseHover(driver, MapSDK4iOS);
		MapSDK4iOSPremium.click();
	}
	
	public String verifyMapSDK4iOSPremiumTitle() throws InterruptedException
	{
		
		Thread.sleep(1000);
		System.out.println("MapSDK4iOSPremiumTitle==>"+ driver.getTitle());
//		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICITWAIT);
//		wait.until(ExpectedConditions.titleContains(Constants.MAPSDK_iOS_LITE_TITLE));
		return driver.getTitle();
	}
	
	public String VerifyMapSDK4iOSPremiumHeaderText()
	{
		System.out.println("Map SDK For iOS Premium Header Text-->"+MapSDK4iOSPremiumHeader.getText());
		return MapSDK4iOSPremiumHeader.getText();
		
	}
	
	public void ClickOnMapSDK4iOSStarter() throws Throwable
	{
		driver.navigate().back();
		
		js.executeScript("window.scrollBy(0,2200)");
		Utils.mouseHover(driver, MapSDK4iOS);
		MapSDK4iOSStarter.click();
	}
	
	public String verifyMapSDK4iOSStarterTitle() throws InterruptedException
	{
		
		Thread.sleep(1000);
		System.out.println("MapSDK4iOSStarterTitle==>"+ driver.getTitle());
//		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICITWAIT);
//		wait.until(ExpectedConditions.titleContains(Constants.MAPSDK_iOS_LITE_TITLE));
		return driver.getTitle();
	}
	
	public String VerifyMapSDK4iOSStarterHeaderText()
	{
		System.out.println("Map SDK For iOS Starter Header Text-->"+MapSDK4iOSStarterHeader.getText());
		return MapSDK4iOSStarterHeader.getText();
		
	}
	
	
	
	
	
	
	
	
	
}
