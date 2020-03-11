package com.qa.TestCase;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.BaseClass.BaseClass;
import com.qa.Constants.Constants;
import com.qa.Pages.DocumentPage;

public class DocumentPageTest extends BaseClass {
	
	DocumentPage DocPage;
	
	@BeforeSuite
	public void Setup() {
		initialization();
		DocPage = new DocumentPage();
	}
	
	public DocumentPageTest() {
		super();
		
	}
	
	
//	@Test(description = "Clicking on Document Link")
//	public void ClickOnDocument() {
//
//		DocPage.ClickOnDocumentLink();
//		logger.info("Clicked in Document link successfully");
//	}
	
	@Test(priority = 1, description = "Verify Document Page Title")
	public void DocumentPageTitle() {
		String title = DocPage.DocumePageTitle();
		assertEquals(title, Constants.DOCUMENT_PAGE_TITLE);
	}
	
	
//	@Test(description = "Verify the brokenlink in the page")
//	public void CheckBrokenlinks() throws MalformedURLException, IOException {
//		DocPage.VerifyBrokenLink();
//	}
//	
	
	
	
	

}
