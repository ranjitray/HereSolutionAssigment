package com.qa.Pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.junit.ArrayAsserts;

import com.qa.BaseClass.BaseClass;
import com.qa.Constants.Constants;
import com.qa.Utils.Utils;

public class DocumentPage extends BaseClass {
	
	@FindBy(xpath="//li[@class='menu-list-item menu-list-item--primary']//a[@class='menu-link menu-link--primary']//span[@class='link-content'][contains(text(),'Documentation')] ")
	WebElement Document;
	

	
	public void ClickOnDocumentLink()
	{
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICITWAIT);
		WebElement doc = wait.until(ExpectedConditions.elementToBeClickable(Document));
		doc.click();
	}
	public String DocumePageTitle() 
	{
		return driver.getTitle();
	}
	
	
	public void VerifyBrokenLink() throws MalformedURLException, IOException 
	{
//		 Get all the list of all links in the Document page
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
//		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of Full link-- >"+ linklist.size());

			
//		Get the link which has href properties
		List<WebElement> ActiveLink= new ArrayList<WebElement>();
		
//		iterate linklist and also exclude which does not have href attribut
		for(int i=0; i<linklist.size();i++)
		{
			if(linklist.get(i).getAttribute("href") != null && linklist.get(i).getAttribute("href").contains("javascript"))
			{
				ActiveLink.add(linklist.get(i));
			}
			
		}
		
		System.out.println("Size of Activelinks-- >"+ ActiveLink.size());
		for(int j=0;j<ActiveLink.size();j++)
		{
			HttpURLConnection con = (HttpURLConnection) new URL(ActiveLink.get(j).getAttribute("href")).openConnection();
			con.connect();
			String response =  con.getResponseMessage();
			con.disconnect();
			System.out.println(ActiveLink.get(j).getAttribute("href")+"-->"+response);
			
		}
			
	}
	
	
	
	
}
