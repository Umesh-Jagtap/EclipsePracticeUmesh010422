package stepDefinations;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;


@RunWith(Cucumber.class)
public class stepDefination extends base {
	
	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    driver = initializeDriver();
	}
	@Given("Navigate to the {string} site")
	public void navigate_to_the_site(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	}
	@Given("Click on the login button to land on secure sign in page")
	public void click_on_the_login_button_to_land_on_secure_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		if(l.getPopupsize()>0)
		{
			l.getpopUp().click();
		}
		l.getLogin().click(); //driver.findElement(By.css()
	}
	@When("User enters {string} and {string} and logs in")
	public void user_enters_and_and_logs_in(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage lp=new LoginPage(driver); //driver.findElement(By.css()
		lp.getEmail().sendKeys(string);
		lp.getPassword().sendKeys(string2);

		//log.info(text);
		
		lp.getLogin().click();
	}
	@Then("Verify thatt user is succesfully logged in")
	public void verify_that_user_is_succesfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    portalHomePage p = new portalHomePage(driver);
	    Assert.assertTrue(p.getInvalidLogin().isDisplayed());
	}
	@And("^close browser$")
    public void close_browser() throws Throwable {
       driver.quit();
    }
}
