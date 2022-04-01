package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	By signin =By.cssSelector("a[href*='sign_in']");
	By title =By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navbar = By.xpath("//header/div[2]/div[1]/nav[1]");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public LoginPage getlogin()
	{
		driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
	}
	
	public WebElement gettitle()
	{
		return driver.findElement(title);
		
	}
	
	public WebElement getNavbar()
	{
		return driver.findElement(navbar);
		
	}

}
