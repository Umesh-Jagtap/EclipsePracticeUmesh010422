package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class portalHomePage {

	
	public WebDriver driver;
	
	By Invalidemail=By.cssSelector("div[class='alert alert-danger alert-show mb-5']");
		
	
	
	
	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	
	
	public WebElement getInvalidLogin()
	{
		return driver.findElement(Invalidemail);
	}
	
	
	
}
