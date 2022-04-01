package resourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initialiseDriver() throws IOException
	{
	    prop = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\Umesh\\eclipse-workspace\\FinalProject\\src\\main\\java\\resourses\\data.properties");
	    prop.load(fi);
	    String browserName = prop.getProperty("browser");
	    System.out.println(browserName);
	    
	    if(browserName.equals("chrome"))
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umesh\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    }
	    else if(browserName.equals("firfox"))
	    {
	    	//code of firefox
	    }
	    else if(browserName.equals("IE"))
	    {
	    	//code 
	    }
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenshotpath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourse = ts.getScreenshotAs(OutputType.FILE);
		String destFile= System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(sourse, new File(destFile));
		return destFile;
	}
	

}
