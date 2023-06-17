package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		sheets="Login";
		
	}
	@Test(dataProvider = "getData")
	public void loginTest(String uname, String pwd) throws InterruptedException, IOException{
		//Create obj for loginPage
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassWord(pwd)
		.clickLogin();
		
	}

}
