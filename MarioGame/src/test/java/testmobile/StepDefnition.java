package testmobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefnition {
	WebDriver driver=null;
	PageFactoryMobile pagefactory=null;
	
	@Given("^User is on the sampleform page$")
	public void user_is_on_the_sampleform_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bbhargav\\Desktop\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("file:///C:/Users/bbhargav/Desktop/Demo.html");
         pagefactory=new PageFactoryMobile(driver);
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	    
	}

	@When("^user enters (\\d+)$")
	public void user_enters(Integer ano) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pagefactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pagefactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pagefactory.setMobile(ano.toString());
		Thread.sleep(1000);
		pagefactory.setButton();
	}

	@Then("^display alert message$")
	public void display_alert_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String alertmsg=driver.switchTo().alert().getText();
		Thread.sleep(1000);
		System.out.println("alertmsg:"+" "+alertmsg);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	
	


}
