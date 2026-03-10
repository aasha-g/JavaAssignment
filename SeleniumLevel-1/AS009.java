/*
 * "URL:  https://www.letskodeit.com/practice
The Task: Use the Enabled/Disabled Example and Element Displayed Example.
The Challenge:
Verify that the input box is initially enabled using isEnabled().
Click the ""Disable"" button and write a conditional statement to confirm the input box is no longer operational.
Click the ""Hide"" button and use isDisplayed() to validate that the element is removed from the UI while remaining in the DOM."
 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS009 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		//Verify that the input box is initially enabled using isEnabled().
		boolean input =driver.findElement(By.id("enabled-example-input")).isEnabled();
		System.out.println("input box is  enabled : "+input);
		
		//Click the ""Disable"" button  
		driver.findElement(By.id("disabled-button")).click();
		//write a conditional statement to confirm the input box is no longer operational.
		if(driver.findElement(By.id("enabled-example-input")).isEnabled()) 
		{
			System.out.println("The input box is still enabled.");
		}else
		{
			System.out.println("The input box is now DISABLED and non-operational.");
		}
		
		//Click the ""Hide"" button and use isDisplayed() 
		boolean hide=driver.findElement(By.id("hide-textbox")).isDisplayed();
		System.out.println("hide is displayed : "+hide);
		Thread.sleep(3000);
		
		//to validate that the element is removed from the UI while remaining in the DOM."
		driver.findElement(By.id("hide-textbox")).click();
		if(driver.findElement(By.id("displayed-text")).isDisplayed()) 
		{
			System.out.println("element is still displayed");
		}else
		{
			System.out.println("element is removed from the UI");
		}
		
		/*
		 * Output:
		 * input box is  enabled : true
		 * The input box is now DISABLED and non-operational.
		 * hide is displayed : true
		 * element is removed from the UI
		 */
	}

}

