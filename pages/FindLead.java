package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.ProjectSpecificMethod;

public class FindLead extends ProjectSpecificMethod{

	public FindLead(ChromeDriver driver) {
		this.driver=driver;
		
	}
	public FindLead clickPhoneNum() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public FindLead enterPhoneNum(String pnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
		return this;
	}
	
	public FindLead clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public ViewLead clickLeadIDforCreate() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLead(driver);
	}
	
	public DuplicateLead clickLeadIDForDup() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new DuplicateLead(driver);
	}
	
    public DeleteLead clickLeadIDForDel() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new DeleteLead(driver);
	}
    
    public EditLeagePage clickLeadIDForEdit() throws InterruptedException {
    	Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new EditLeagePage(driver);
	}
}
