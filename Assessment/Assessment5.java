/*"Write Selenium code to:

Enter your name in the textbox.

Select all text using CTRL + A.
Copy using CTRL + C.
Paste the copied text again in the same textbox."
 *
 */
package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment5 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("welcome");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL);
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL);
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
