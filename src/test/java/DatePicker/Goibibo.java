package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Goibibo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@class=\"sc-koXPp bDtzaf\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"flt_fsw_inputBox dates inactiveWidget \"]")).click();
		
		String expYearmnth = "July 2027";
		String expDate = "19";
		
		while (true) {
			
			Thread.sleep(1000);
			
			String actYearMnth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
			
			if(actYearMnth.equals(expYearmnth)) {
				List<WebElement> l1 = driver.findElements(By.xpath("//div[@class=\"dateInnerCell\"]"));
				for(WebElement l2 :l1) {
					String actDate = l2.getText();
					if(actDate.equals(expDate)) {
						l2.click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			}
			
		}
		
	}

}
