package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment1 {

	public static void main(String[] args) {
		
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://leafground.com/dashboard.xhtml");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='email']")).click();

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

