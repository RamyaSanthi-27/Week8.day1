package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class DeleteLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		sheets="DeleteLead";
	}
	
	@Test(dataProvider = "getData")
	public void deleteLeadTest(String uname,String pwd,String pnum) throws InterruptedException, IOException{
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
		.clickLeadIDForDel()
		.clickDeleteLead()
		.clickFindLID()
		.enterLeadId()
		.clickfindLID()
		.verifyLeadId();
		
		
	}
	
}
