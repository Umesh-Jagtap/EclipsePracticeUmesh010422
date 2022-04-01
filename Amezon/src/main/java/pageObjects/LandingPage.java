package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By SearchBox = By.xpath("//input[@id='twotabsearchtextbox']");
	By SearchButton = By.xpath("//input[@id='nav-search-submit-button']");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}



	public WebElement searchBox()
	{
		return driver.findElement(SearchBox);
	}
	
	public WebElement searchProducts()
	{
		return driver.findElement(SearchButton);
	}

}
