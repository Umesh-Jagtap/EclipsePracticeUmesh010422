package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resourses.base;

public class SearchResults extends base{
	
	public WebDriver driver;
	
	By samsungsearch = By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])");
	
	
	
	public WebElement samsungSearchResults()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		
		
		int s=driver.findElements(samsungsearch).size();
		for(int i=1;i<s;i++)
		{
			
			String search = driver.findElements(samsungsearch+"["+i+"]").toString();
			
		}
		return null;
		
	}
	
	
	
	
	
	
	

}
