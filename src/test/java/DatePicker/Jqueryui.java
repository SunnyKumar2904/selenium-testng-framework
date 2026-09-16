package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Jqueryui {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		String expMnth = "July";
		String expYear = "2034";
		String expDate = "29";
		
		while(true) {
			String curMnth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String curYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if (curMnth.equals(expMnth) && curYear.equals(expYear)) {
				List<WebElement> l1 = driver.findElements(By.xpath("//table//tbody//tr//td"));
				
				for(WebElement l2:l1) {
					String curDate = l2.getText();
					if(curDate.equals(expDate)) {
						l2.click();
						break;
					}
				}
				
				break;
				
			} else {
				driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-e' and starts-with(text(), 'Next')] ")).click();
			}
					
		}
		
		
	}
	
}
