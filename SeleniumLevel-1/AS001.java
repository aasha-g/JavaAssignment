/*
 * Selenium Assignment

URl : https://blazedemo.com/
	  https://petstore.octoperf.com/
	  https://www.letskodeit.com/practice
	  https://www.saucedemo.com/
	

Assignment-1:
------------  
1. Open urls using different browser using selenium webdriver using Switch case.
use the browsers : Edge, Chrome, Firefox

 */
package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AS001 {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String browser="chrome";
		
		switch(browser) {
		
		case "chrome":
			driver=new ChromeDriver();
			System.out.println("chrome browser is launched");
			break;
			
		case "edge":
			driver=new EdgeDriver();
			System.out.println("edge browser is launched");
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			System.out.println("firefox browser is launched");
			break;
			
		 default:
             System.out.println("Invalid Browser Name");
             return;
		}
		
		
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		driver.get("https://petstore.octoperf.com/");
		driver.get("https://www.letskodeit.com/practice");
		driver.get("https://www.saucedemo.com");
		driver.close();
		
		//Output:chrome browser is launched
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

