package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{
	
	public Homepage(WebDriver driver) {
		
		super(driver);//super calling statement will always call parent constructor
	}
	
		//xpath for Myaccount
		@FindBy(xpath="//span[text()='My Account']")
		WebElement linkaccount;
		
		//xpath for registration
		@FindBy(xpath="//a[normalize-space()='Register']")
		WebElement linkRegister;
		
		
		
		public void ClickMyAccount() {
			linkaccount.click();
		}
		public void ClickRegister() {
			linkRegister.click();
			
		}
		
	}


