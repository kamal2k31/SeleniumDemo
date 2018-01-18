package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_Login extends LeafTapsWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName =  "TC001_Login";
		testDescription = "Login to LeafTaps";
		authors = "sarath";
		category = "smoke";
		browserName = "chrome";
		dataSheetName = "TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void login(String uName, String pwd, String vName) {
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verfiLoginName(vName)
		.clickLogOut();		
	}

}
