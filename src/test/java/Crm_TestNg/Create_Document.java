package Crm_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Create_Document extends BaseTest {
	
	
	@Test(priority = 11)
	void document() throws InterruptedException {
		WebElement CREATE = driver.findElement(By.linkText("CREATE"));
		CREATE.click();

		WebElement createDocuments = driver.findElement(By.linkText("Create Documents"));
		createDocuments.click();

		WebElement document_name = driver.findElement(By.id("document_name"));
		document_name.sendKeys("Project Proposal 2026");

		Select status = new Select(driver.findElement(By.id("status_id")));
		status.selectByVisibleText("Draft");

		WebElement revision = driver.findElement(By.name("revision"));
		revision.clear();
		revision.sendKeys("23");

		Select documentType = new Select(driver.findElement(By.id("template_type")));
		documentType.selectByVisibleText("Mail Merge");

		WebElement isTemplate = driver.findElement(By.id("is_template"));
		isTemplate.click();

		WebElement publish_date = driver.findElement(By.id("active_date"));
		publish_date.sendKeys("07/30/2026");

		WebElement exp_date = driver.findElement(By.id("exp_date"));
		exp_date.sendKeys("12/31/2026");

		Select categoryName = new Select(driver.findElement(By.id("category_id")));
		categoryName.selectByVisibleText("Marketing");

		Select subCategoryName = new Select(driver.findElement(By.id("subcategory_id")));
		subCategoryName.selectByVisibleText("Marketing Collateral");

		WebElement description = driver.findElement(By.id("description"));
		description.sendKeys("Test document creation for system automation.");

		WebElement assigned_user_name = driver.findElement(By.id("assigned_user_name"));
		assigned_user_name.sendKeys("Will Westin");
		
		driver.findElement(By.xpath("(//input[@ value='Save'])[2]")).click();
		
		Thread.sleep(2000);


	}

}
