package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EasyMyTrip {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.easemytrip.com/hotels/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("htl_dates")).click();
		
		String expDate = "20";
		String expDDate = "29";
		
		
		Thread.sleep(4000);
		
		Select sc1 = new Select(driver.findElement(By.className("ui-datepicker-year")));
		sc1.selectByVisibleText("2034");
		Thread.sleep(1500);
		Select sc = new Select(driver.findElement(By.className("ui-datepicker-month")));
		sc.selectByVisibleText("Apr");
		Thread.sleep(1500);
		List<WebElement> l1 = driver.findElements(By.xpath("//table//tbody//tr//td"));
		
		for(WebElement l2:l1) {
			String curDate = l2.getText();
			if (curDate.equals(expDate)) {
				l2.click();
				break;
			} 
		}
		List<WebElement> l3 = driver.findElements(By.xpath("//table//tbody//tr//td"));

		for(WebElement l4:l3) {
			String curDDate = l4.getText();
			if (curDDate.equals(expDDate)) {
				l4.click();
				break;
			} 
		}

		
	}

}
