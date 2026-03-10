/*
 * Handling Alerts without `switchTo()
 * "**Topic:** Explicit Wait strategies.
*   **Task:** Challenge students to handle an alert **without using the standard switching command**.
    1.  Declare a `WebDriverWait` instance.
    2.  Use `ExpectedConditions.alertIsPresent()` to capture the alert into an `Alert` variable.
    3.  Perform the `accept()` operation once the alert is dynamically detected."
 */
package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AS013 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//  1.  Declare a `WebDriverWait` instance.
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);

		//2.  Use `ExpectedConditions.alertIsPresent()
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		
		// 3.Perform the `accept()` operation once the alert is dynamically detected."
		
		myalert.accept();
		
		driver.close();
	}
 
	        //Output:I am a JS Alert
}

