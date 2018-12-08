package testmobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryMobile {
	
	WebDriver wd;

	public PageFactoryMobile(WebDriver wd) {
		
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}

	public PageFactoryMobile() {
		
	}

	@FindBy(name="Phone")
	@CacheLookup
	WebElement mobileNo;
	
	@FindBy(how = How.ID, using = "btnPayment")
	@CacheLookup
	WebElement button;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement name;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement email;
	
	
	public void setMobile(String mobileNoTemp) {
		mobileNo.sendKeys(mobileNoTemp);
	}
	
	public void setButton() {
		button.click();
	}
	public void setFname(String fNameTemp) {
		name.sendKeys(fNameTemp);
	}


	public void setEmail(String emailTemp) {
		email.sendKeys(emailTemp);
	}
	    

		public WebElement getMobileNo() {
			return mobileNo;
		}
		public WebElement getButton() {
			return button;
		}

		public WebElement getName() {
			return name;
		}

		public WebElement getEmail() {
			return email;
		}
}
