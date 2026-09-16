package Testng_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_2D_array {
	
	
	@Test(dataProvider = "datapro")
	void login(String user, String pass) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("submit")).click();
	}
	
	@DataProvider(name="datapro")
	public String[][] getdata() {
		String s1 [][] = new String[3][2];
		
		s1[0][0]="student";
		s1[0][1]="Password123";
		
		s1[1][0]="new";
		s1[1][1]="pass";
		
		s1[2][0]="stui";
		s1[2][1]="rose123";
		
		return s1;
	}

}
