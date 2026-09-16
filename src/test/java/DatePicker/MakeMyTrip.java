package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MakeMyTrip {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		
		class Drive{
			@SuppressWarnings("null")
			void calling1(String ca) {
	
				driver.findElement(By.xpath(ca)).click();
				
			}
		}
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		
		String expMnthYear = "July 2027";
		String expDay = "29";
		
		Drive s1 = new Drive();
		Thread.sleep(3000);
		s1.calling1("//label[@for=\"departure\"]");
		
		Thread.sleep(3000);
		
		
		while (true) {
			String actMnthYear = driver.findElement(By.xpath("//div[@role=\"heading\"]")).getText();
			
			if (actMnthYear.equals(expMnthYear)) {
				
				List<WebElement> l1 = driver.findElements(By.xpath("(//div[@class=\"dateInnerCell\"]) "));
				
				for(WebElement l2 : l1) {
					
					 String actday = l2.getText();
					 if(actday.equals(expDay)) {
						  l2.click();
						  break;
					 }
					
				}
			

				break; 
				
			} else {
				
				 s1.calling1("//span[@aria-label=\"Next Month\"]");
				
			}
			
		}
		
		
		
	}

}
