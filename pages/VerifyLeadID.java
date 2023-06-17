package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class VerifyLeadID extends FindLead{

	public VerifyLeadID(ChromeDriver driver) {
		  super(driver);
		
	}
	
	
	public VerifyLeadID clickFindLID() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		return this;
	}
	public VerifyLeadID enterLeadId() throws InterruptedException {
		Thread.sleep(3000);
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
		return this;
	}
	
	public VerifyLeadID clickfindLID() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public VerifyLeadID verifyLeadId() throws InterruptedException {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		Thread.sleep(3000);
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return this;
	}
}
