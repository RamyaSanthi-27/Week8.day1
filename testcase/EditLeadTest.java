package testcase;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
public class EditLeadTest extends ProjectSpecificMethod{

	@BeforeTest
	public void setData() {
		sheets="EditLead";
	}
	
	@Test(dataProvider = "getData")
	public void editLeadTest(String uname,String pwd,String pnum,String cname ) throws InterruptedException, IOException{
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.findLead()
		.clickPhoneNum()
		.enterPhoneNum(pnum)
		.clickFindLeads()
		.clickLeadIDForEdit()
		.clickEditeLead()
		.enterCompanyName(cname)
		.clickTocreate()
		.VerifyFirstName();
	}
}
