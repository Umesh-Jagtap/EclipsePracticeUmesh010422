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

public class validateNavigationBar extends base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initialiseDriver();
		//driver.get(prop.getProperty("url"));
		driver.get("http://qaclickacademy.com");
	}
	
	
	
	@Test
	public void basePageNavigation() throws IOException
	{
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getNavbar().isDisplayed());
		log.info("Navigation Bar is display");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	

}
