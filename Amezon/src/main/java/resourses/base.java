package resourses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public Properties prop;
	
	public WebDriver driver;
	
	public WebDriver initializedriver() throws IOException
	{
		
		prop= new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Umesh\\eclipse-workspace\\Amezon\\src\\main\\java\\data.properties");
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umesh\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umesh\\chromedriver.exe");
		
	}
	
	
	
	

}
