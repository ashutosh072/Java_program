import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParllelExecution {

	@Test
	public void chromeLaunch() {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse-Workspace\\Java_program\\exefiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver =new RemoteWebDriver(DesiredCapabilities.chrome());	
		Reporter.log("Chrome launched ", true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https:google.com");

	}
//	@Test
//	public void IoLaunch() {
//		
//		
//		System.setProperty("webdriver.edge.driver", 
//				"D:\\Eclipse-Workspace\\Java_program\\exefiles\\IEDriverServer.exe");
//		WebDriver driver = new EdgeDriver();
//		//driver =new RemoteWebDriver(DesiredCapabilities.chrome());	
//		Reporter.log("EDGE LAUNCHED  ", true);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https:google.com");
//
//	}
}
