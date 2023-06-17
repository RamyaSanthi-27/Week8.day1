package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.ProjectSpecificMethod;
public class EditLeagePage extends ProjectSpecificMethod{

	public EditLeagePage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	
	public FindLead findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLead(driver);
	}
	
	public EditLeagePage clickEditeLead() {
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}
	
	public EditLeagePage enterCompanyName(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	
	public ViewLead clickTocreate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead(driver);
	}
	
}


