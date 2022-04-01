package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resourses.base;

public class validateTitle extends base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initialiseDriver();
		log.info("Driver is initialize");
		//driver.get(prop.getProperty("url"));
		driver.get("http://qaclickacademy.com");
		log.info("Navigate to home page");
	}
	@Test
	public void basePageNavigation() throws IOException
	{
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.gettitle().getText(), "Features Course123");	
		log.info("Successfully validate test massege");
		//Assert.assertTrue(By.);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	

}
