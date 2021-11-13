package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPageObject;
import io.cucumber.java.en.*;

public class Steps 
{
	WebDriver driver;
	LoginPageObject lp;
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser()
	{
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver/chromedriver.exe" );
	    driver=new ChromeDriver();
	    lp=new LoginPageObject(driver);
	    driver.manage().window().maximize();
	    
	}

	@When("User navigate to the url {string}")
	public void user_navigate_to_the_url(String url) {
	    driver.get(url);
	   
	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
	    lp.setUsername(email);
	    lp.setPassword(password);
	    
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	    lp.clickLogin();
	    
	}

	@Then("User navigate to new page with page title {string}")
	public void user_navigate_to_new_page_with_page_title(String title1) {
	    if(driver.getPageSource().contains("Login was unsuccessful."))
	    {
	    	driver.close();
	    	//Assert.assertTrue(false);
	    }
	    else
	    {
	    	Assert.assertEquals(title1,driver.getTitle());
	    }
	    
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	    lp.clickLogout();
	    Thread.sleep(10000);
	    
	}

	@Then("User navigate to login page with page tilte {string}")
	public void user_navigate_to_login_page_with_page_tilte(String title2)
	{
	    //Assert.assertEquals(title2,driver.getTitle());
	   // System.out.println(driver.getTitle());
	    
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.quit();
	    
	}
}
