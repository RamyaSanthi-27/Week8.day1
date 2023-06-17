package testcase;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import week8.day2.ExtentReport.pages.LoginPage;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class MergeLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		sheets="MergeLead";
		testName="MergeLead Test";
		testDescription="MergeLead Test For LeafTap application";
		testAuthor="Ramya";
		tesCategory="Regression";

		
	}
	@Test(dataProvider = "getData")
	public void mergeLeadTest(String uname, String pwd, String fname1,String fname2) throws InterruptedException, IOException{
		LoginPage lp = new LoginPage(driver,node);
		lp.enterUserName(uname)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.mergeLead()
		.clickFromLead()
		.enterFirstName(fname1)
		.clickFindLeads()
		.clickLeadID()
		.clickTolead()
		.enFirstName(fname2)
		.clFindLeads()
		.clLeadID()
		.clickMerge()
		.clickFindLID()
		.enterLeadId()
		.clickfindLID()
		.verifyLeadId();
		
		
		
	}
}
