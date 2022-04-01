package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	By email =By.cssSelector("[id='user_email']");
	By pass =By.cssSelector("[type='password']");
	By login =By.cssSelector("[value='Log In']");
	By forgotPass= By.xpath("//a[contains(text(),'Forgot Password?')]");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


    public ForgotPassword forgotPassword()
    {
    	driver.findElement(forgotPass).click();
    	ForgotPassword fp =new ForgotPassword(driver);
    	return fp;
    }
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getpass()
	{
		return driver.findElement(pass);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

}
