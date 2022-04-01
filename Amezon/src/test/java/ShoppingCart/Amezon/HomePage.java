package ShoppingCart.Amezon;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resourses.base;

public class HomePage extends base{
	
	//public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializedriver();

	}
	
	@Test
	public void homePageNavigation()
	{
		driver.get("https://www.amazon.in/");
		
		LandingPage l1 = new LandingPage(driver);
		l1.searchBox().sendKeys("Samsung");
		l1.searchProducts().click();
		
		
	
	}

}
