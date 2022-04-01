import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		/*String downloadPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umesh\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.setExperimentalOption("prefs", value);
		WebDriver driver = new ChromeDriver(c);
		
		driver.get("https://altoconvertpdftojpg.com/");
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class*='js-fileapi-wrapper']")).click();
		//driver.findElement(By.cssSelector("span[class*='sc-1rd62mt']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Umesh\\Example AutoIt\\fileupload.exe");
		//driver.findElement(By.cssSelector("button[class*='g-btn--primary']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Choose option')]")).click();
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[class*='medium']")));
		driver.findElement(By.cssSelector("button[class*='medium']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Download Now")));
		driver.findElement(By.linkText("Download Now")).click();
		File f = new File(downloadPath+"/converted.zip");
		if(f.exists())
		{
			System.out.println("File Found");
		}
////span[contains(text(),'Choose File')]
	}*/
		
		String downloadPath=System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Umesh\\chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options=new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver=new ChromeDriver(options);

		driver.get("https://altoconvertpdftojpg.com/");
		
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("[class*='btn--choose']")).click();

		Thread.sleep(10000);

		Runtime.getRuntime().exec("D:\\Umesh\\Example AutoIt\\fileupload.exe");

		WebDriverWait wait=new WebDriverWait(driver,10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));

		driver.findElement(By.cssSelector("button[class*='medium']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));

		driver.findElement(By.linkText("Download")).click();

		Thread.sleep(5000);

		File f=new File(downloadPath+"/converted.zip");

		if(f.exists())

		{

		Assert.assertTrue(f.exists());

		if(f.delete())

		System.out.println("file deleted");

		}

		}



}
