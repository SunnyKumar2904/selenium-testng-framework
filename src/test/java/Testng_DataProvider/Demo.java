package Testng_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
	
	
	
	@Test(dataProvider = "datapro")
	void login(String a) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.id("ti6dpd")).sendKeys(a, Keys.ENTER );
	}
	
	
	@DataProvider(name = "datapro")
	public String [] getdata() {
		String [] s1 = new String[3];
		s1[0]="Java";
		s1[1]="Python";
		s1[2]="C/C++";
		return s1;
	}

}
