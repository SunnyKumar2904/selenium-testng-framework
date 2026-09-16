package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Yatra {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.xpath("//div[@class=\"css-1ysxxro\"]")).click();
		
		String expYearmnth = "July 2027";
		String expDate = "19";
		
		while (true) {
			
			Thread.sleep(1000);
			
			String actYearMnth = driver.findElement(By.xpath("(//span[@class=\"react-datepicker__current-month\"])")).getText();
			
			if(actYearMnth.equals(expYearmnth)) {
				System.out.println(actYearMnth);
				List<WebElement> l1 = driver.findElements(By.xpath("//span[@aria-label=\"MAHA SHIVARATHIRI\"]"));
				for(WebElement l2 :l1) {
					String actDate = l2.getText();
					if(actDate.equals(expDate)) {
						l2.click();
						System.out.println(actDate);
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("(//button[@aria-label=\"Next Month\"])[2]")).click();
			}
			
		}
		
		
	}

}
