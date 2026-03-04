/*
 * Assignment-3:
------------
Navigation and Search (JPetStore)
Target URL: https://petstore.octoperf.com/
Locators to Practice: Link Text, Partial Link Text, ID.

Instructions:
Click "Enter the Store" using Link Text.
Locate the Side bar menu and click on "Fish" using Partial Link Text.
Use the Search bar (locate it by Name) to search for "Angelfish".
Identify the "Sign In" link at the top of the page using its XPath.

 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS003 {
      
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com");
		driver.manage().window().maximize();
		
		//Click "Enter the Store" using Link Text.
		driver.findElement(By.linkText("Enter the Store")).click();
		
		//Locate the Side bar menu and click on "Fish" using Partial Link Text.
		//driver.findElement( By.id("Sidebar"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@src,'fish_icon')]/parent::a")).click();
		
		//Use the Search bar (locate it by Name) to search for "Angelfish".
		driver.findElement(By.name("keyword")).sendKeys("Angelfish");
		
		//Identify the "Sign In" link at the top of the page using its XPath.
		String C=driver.findElement(By.xpath("//a[text()='Sign In']")).getText();
		System.out.println(C);
	}

}

