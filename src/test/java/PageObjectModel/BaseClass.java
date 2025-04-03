package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {

	




	WebDriver driver;
	@Parameters("Browser")
	@BeforeClass
	public void setup(String Browser) {
		if(Browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		}
		else if(Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		}
		else if(Browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		}
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}

	
	@AfterClass
	public void teardown() {
		driver.close;
	}


}
