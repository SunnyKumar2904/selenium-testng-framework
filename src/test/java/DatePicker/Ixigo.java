package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ixigo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ixigo.com/");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//p[@data-testid=\"departureDate\"]")).click();
		
		String expYearMnt = "August 2027";
		String expDate = "17";
		
		Thread.sleep(3000);
		
		while(true) {
			
			Thread.sleep(3000);
			
			String curYermnt = driver.findElement(By.xpath("//span[@class=\"react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from\"]")).getText();
			
			if(curYermnt.equals(expYearMnt)) {
				List<WebElement> l1 = driver.findElements(By.xpath("//button//abbr"));
				for(WebElement l2:l1) {
					
					String curDate = l2.getText();
					if(curDate.equals(expDate)) {
						l2.click();
						System.out.println(curDate);
						break;
					}
					
				}
				
				break;
			} else {
				driver.findElement(By.xpath("//button[@class=\"react-calendar__navigation__arrow react-calendar__navigation__next-button\"]")).click();
			}
			
		}
		
	}

}
