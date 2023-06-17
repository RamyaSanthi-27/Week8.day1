package base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import util.ReadExcel;
import java.io.IOException;
import java.time.Duration;


public class ProjectSpecificMethod {
	public String sheets;
	public ChromeDriver driver;	
	
	
	@BeforeMethod
	public void launchBrowser() {
		
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	  @DataProvider
	  public String[][] getData() throws IOException {
			String[][] readData = ReadExcel.readData(sheets);
			return readData;
		}
	
}
