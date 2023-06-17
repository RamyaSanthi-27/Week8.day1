package testcase;
import java.io.IOException;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
public class CreateLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		sheets="CreateLead";
	}
	@Test(dataProvider = "getData")
	public void createLeadTest(String uname,String pwd,String cname,String fname,String lname, String pnum) throws InterruptedException, IOException{
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.createLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterPhoneNum(pnum)
		.submitCreateLead()
		.VerifyFirstName();
	}
	

}




