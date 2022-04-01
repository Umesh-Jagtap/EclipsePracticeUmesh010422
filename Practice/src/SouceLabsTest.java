import java.net.MalformedURLException;


import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SouceLabsTest {
	
	//public static final String USERNAME = "oauth-umeshjagtap777-da0a4";
	//  public static final String ACCESS_KEY = "9fc572f0-898c-4270-b0d5-fb24a5ea7bb5";
	 // public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "https://oauth-umeshjagtap777-da0a4:9fc572f0-898c-4270-b0d5-fb24a5ea7bb5@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	
	  public static final String USERNAME = "oauth-umeshjagtap777-da0a4";

	  public static final String ACCESS_KEY = "9fc572f0-898c-4270-b0d5-fb24a5ea7bb5";

	 public static final String URL = "https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.eu-central-1.saucelabs.com:443/wd/hub";


	                                  //https://oauth-umeshjagtap777-da0a4:9fc572f0-898c-4270-b0d5-fb24a5ea7bb5@ondemand.eu-central-1.saucelabs.com:443/wd/hub
	//public static final String URL = "https://oauth-umeshjagtap777-da0a4:9fc572f0-898c-4270-b0d5-fb24a5ea7bb5@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		/*DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platform","Windows 10");
		caps.setCapability("version", "91.0");*/
		
		/*MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "91.0");
		browserOptions.setCapability("sauce:options", sauceOptions);*/

		/*DesiredCapabilities caps = DesiredCapabilities.chrome();

		caps.setCapability("platform", "Windows 10");

		caps.setCapability("version", "92.0");*/
		
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "92.0");
		browserOptions.setCapability("sauce:options", sauceOptions);

		WebDriver driver=new RemoteWebDriver(new java.net.URL(URL), sauceOptions);

		driver.get("http://google.com");

		System.out.println(driver.getTitle());
		
		/*WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), sauceOptions );
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());*/

	}

}
