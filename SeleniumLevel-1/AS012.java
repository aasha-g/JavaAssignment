/*Managing Different Types of Alerts**
 * " **Topic:** JavaScript Alerts and popups.
*   **Task:** Use the ""Switch To Alert Example"". Students must handle three scenarios:
    1.  **Normal Alert:** Click a button, capture the text using `getText()`, and click ""OK"" via `accept()`.
    2.  **Confirmation Alert:** Click a button and close it using `dismiss()` to simulate clicking ""Cancel"".
    3.  **Prompt Alert:** Switch to the alert, use `sendKeys()` to enter a value, and then `accept()` it."
 */
package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS012 {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		/*//**Normal Alert:** Click a button, capture the text using `getText()`, and click ""OK"" via `accept()
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		*/
		
		//**Confirmation Alert:** Click a button and close it using `dismiss()`
		//to simulate clicking ""Cancel"".
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();//close using accept
		driver.switchTo().alert().dismiss();//close using cancel
		
		*/
		//**Prompt Alert:** Switch to the alert, use `sendKeys()`
		//to enter a value, and then `accept()` it."
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("hello");
		myalert.accept();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}

