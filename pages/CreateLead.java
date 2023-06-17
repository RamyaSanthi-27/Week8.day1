package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod{
	
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}
		public CreateLead enterCompanyName(String cname) {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			return this;

		}
		public CreateLead enterFirstName(String fname) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			return this;
		}
		
		public CreateLead enterLastName(String lname) {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			return this;
		}
		public CreateLead enterPhoneNum(String pnum) {
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
			return this;
		}
		
		public ViewLead submitCreateLead() {
			driver.findElement(By.name("submitButton")).click();	
			return new ViewLead(driver);
		}
		
		
		
		
		
	

	

}
