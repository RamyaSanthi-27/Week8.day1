package pages;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyLeadPage extends ProjectSpecificMethod{
	
	public MyLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLead createLead() throws InterruptedException{		
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver);
	}
	public FindLead findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLead(driver);
	}
	public MergeLeads mergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeads(driver);
	}
	
	
	
}
