package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLead extends ProjectSpecificMethod{
	
	public ViewLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public ViewLead VerifyFirstName() {
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("LeadName : "+firstName);
		return this;
	}
	
	
	
}
