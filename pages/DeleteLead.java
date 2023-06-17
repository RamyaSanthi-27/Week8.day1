package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class DeleteLead extends ProjectSpecificMethod{
	public DeleteLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public FindLead findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLead(driver);
	}
	
	public VerifyLeadID clickDeleteLead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Delete")).click();
		return new VerifyLeadID(driver);
	}
	

}
