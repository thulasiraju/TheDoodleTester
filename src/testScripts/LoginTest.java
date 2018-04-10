package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest{
	
	
	
	@Test
	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSPL-0088\\Automation\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa1.gststar.com/GSTStar");
		driver.findElement(By.id("Email")).sendKeys("thulasiraju@clonect.com");
		driver.findElement(By.id("Password")).sendKeys("cspl@1234");
		driver.findElement(By.id("loginbtn")).click();
		
	}
	

}
