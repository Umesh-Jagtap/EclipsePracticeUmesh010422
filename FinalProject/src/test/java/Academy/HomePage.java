package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resourses.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initialiseDriver();
		//driver.get(prop.getProperty("url"));
		driver.get("http://qaclickacademy.com");
	}
	@Test(dataProvider="getdata")
	public void basePageNavigation(String Username,String password,String text) throws IOException
	{
		driver.get("http://qaclickacademy.com");
		LandingPage l= new LandingPage(driver);
		//l.getlogin().click();
		LoginPage lp = l.getlogin();
		lp.getEmail().sendKeys(Username);
		lp.getpass().sendKeys(password);
		//System.out.println(text);
		log.info(text);
		
		lp.getLogin().click();
		ForgotPassword fp = lp.forgotPassword();
		fp.getEmail().sendKeys("sdf");
		fp.sendmeInstructions().click();
		
	}

	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][3];
		data[0][0]="nonrestricteduser@qaclick.com";
		data[0][1]="123456";
		data[0][2]="Restricted User";
		data[1][0]="restricteduser@qaclick.com";
		data[1][1]="456789";
		data[1][2]="Nonrestricted User";
		return data;
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
