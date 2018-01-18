package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class HomePage extends LeafTapsWrappers{
	
	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if (!verifyTitle("Opentaps Open Source ERP + CRM")) {
			reportStep("This Not Home Page", "FAIL");
		}
	}	
	
	public LoginPage clickLogOut() {
		clickByClassName("decorativeSubmit");
		return new LoginPage(driver, test);
	}
	
	public HomePage verfiLoginName(String text) {
		verifyTextContainsByXpath("//h2", text);
		return this;
	}	
}
