package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.ProjectSpecificMethod;

public class MergeLeads extends ProjectSpecificMethod{
	public MergeLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MergeLeads clickFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;
	}
	
	public MergeLeads enterFirstName(String fname1) throws InterruptedException {	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname1);
		return this;
	}
	
	public MergeLeads clickFindLeads() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public MergeLeads clickLeadID() throws InterruptedException {
		Thread.sleep(3000);
		//String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	public MergeLeads clickTolead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		return this;
	}

public MergeLeads enFirstName(String fname2) throws InterruptedException {
	    Thread.sleep(5000);		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname2);
		return this;
	}

public MergeLeads clFindLeads() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
}

public MergeLeads clLeadID() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(0));
	return this;
}
	public VerifyLeadID clickMerge() {		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new VerifyLeadID(driver);
	}
}
