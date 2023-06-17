package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class DuplicateLead extends ProjectSpecificMethod{
	
	public DuplicateLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public FindLead findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLead(driver);
	}
	
	public DuplicateLead clickDuplicateLead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return this;
	}
	
	public VerifyLeadID clickCreateLeads() {
		driver.findElement(By.name("submitButton")).click();
		return new VerifyLeadID(driver);
	}
	

}
