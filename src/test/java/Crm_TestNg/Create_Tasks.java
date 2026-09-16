package Crm_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Create_Tasks extends BaseTest{
	
	@Test(priority = 13)
	void tasks() throws InterruptedException {
		WebElement CREATE = driver.findElement(By.linkText("CREATE"));
		CREATE.click();
		
		WebElement CreateTasks1 = driver.findElement(By.linkText("Create Tasks"));
		CreateTasks1.click();
		
		driver.findElement(By.id("name")).sendKeys("TestSubject");
		Select status = new Select(driver.findElement(By.id("status")));
		status.selectByVisibleText("In Progress");
		Select Related = new Select(driver.findElement(By.id("parent_type")));
		Related.selectByVisibleText("Bug");
		driver.findElement(By.id("date_start_date")).sendKeys("08/27/2026");
		Select Start = new Select(driver.findElement(By.id("date_start_hours")));
		Start.selectByVisibleText("10");
		Select Startm = new Select(driver.findElement(By.id("date_start_minutes")));
		Startm.selectByVisibleText("30");
		Select date_start_meridiem = new Select(driver.findElement(By.id("date_start_meridiem")));
		date_start_meridiem.selectByVisibleText("am");
		driver.findElement(By.id("parent_name")).sendKeys("Test Department");
		
		driver.findElement(By.id("date_due_date")).sendKeys("08/28/2026");
		Select date_due_hours = new Select(driver.findElement(By.id("date_due_hours")));
		date_due_hours.selectByVisibleText("07");
		Select date_due_minutes = new Select(driver.findElement(By.id("date_due_minutes")));
		date_due_minutes.selectByVisibleText("30");
		Select date_due_meridiem = new Select(driver.findElement(By.id("date_due_meridiem")));
		date_due_meridiem.selectByVisibleText("pm");
		driver.findElement(By.id("contact_name")).sendKeys("contact name");
		Select priority = new Select(driver.findElement(By.id("priority")));
		priority.selectByVisibleText("Medium");
		
		driver.findElement(By.id("description")).sendKeys("Test description");

		driver.findElement(By.xpath("(//input[@value=\"Save\"])[2]")).click();
		
		Thread.sleep(2000);
		
		

	}

}
