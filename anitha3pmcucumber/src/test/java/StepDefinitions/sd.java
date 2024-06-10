package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sd {
	 ChromeDriver ob;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     ob= new ChromeDriver();
	    ob.get("http://www.mycontactform.com");//1
	}
    @When("user enters username and password")
	public void user_enters_username_and_password() {
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
	    ob.findElementByName("pass").sendKeys("12345");
	    }
    @And("click on login button")
	public void click_on_login_button() {
		 ob.findElementByClassName("btn_log").click();
	  }
    @Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		Thread.sleep(3000);
	   ob.quit();
	}

}
