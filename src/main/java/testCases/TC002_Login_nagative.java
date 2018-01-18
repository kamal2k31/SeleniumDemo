package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_Login_nagative extends LeafTapsWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName =  "TC002_Login_nagative";
		testDescription = "Login to LeafTaps(nagative)";
		authors = "sarath";
		category = "sanity";
		browserName = "chrome";
		dataSheetName = "TC002";
	}
	
	@Test(dataProvider="fetchData")
	public void login(String uName, String pwd, String vName) {
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLoginForFailure()
		.verfiLoginName(vName);
	}

}
