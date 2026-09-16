package Testng_DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo_parallelTesting {
	
	
	@Test(invocationCount = 3)
	void google() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	void facebook() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
	}
	

}
