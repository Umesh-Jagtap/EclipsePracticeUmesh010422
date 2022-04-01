package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LandingPage {

	
	public WebDriver driver;
	
	By popup =By.xpath("//button[contains(text(),'NO THANKS')]");
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

   


	public WebElement getLogin()
	{
		//driver.findElement(popup).click();
		 return driver.findElement(signin);
		 
	}
	
	
	
	 public int getPopupsize()
	    {
	    	return driver.findElements(popup).size();
	    }
	 public WebElement getpopUp()
	    {
	    	return driver.findElement(popup);
	    }
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
	
}
