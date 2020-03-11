package com.qa.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.qa.Constants.Constants;
import com.qa.Utils.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass
{
	public static WebDriver driver;
	public static Logger logger;
	public static Properties prop;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger1;
	public static String projDir =  System.getProperty("user.dir");

	@BeforeSuite
	public void ReportSetup() throws IOException 
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/HereDevExtentReport1.html");
		extent = new ExtentReports ();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Application Name", "Here Solution Developer Documentation");
		htmlReporter.config().setDocumentTitle("Here Documentation Automation Testing Report");
		htmlReporter.config().setReportName("Here Documentation Automation Testing");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);	
	}


	public BaseClass()
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "//src/main/java/com/"
					+ "/qa/Config/Conf.properties");
			prop.load(ip);
//			logger.getLogger("Here Solution");
			PropertyConfigurator.configure(".\\src\\main\\java\\com\\qa\\Config\\log4j.properties");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}


	public static void initialization() 
	{
		
		String browserName = prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",projDir+"//Driver/chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",projDir+"//Driver/geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		try {
			driver.get(prop.getProperty("url"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}


	@AfterTest(alwaysRun = true)
	public void Exit() {

		driver.quit();
	}


	@AfterSuite
	public void endReport()
	{
		extent.flush();
	}



}
