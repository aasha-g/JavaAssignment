/*Double Click and Attribute Verification**
 * " **Topic:** Action chaining and `getAttribute()`.
*   **Task:** Use a page with two fields and a ""Copy Text"" button.
    1.  Clear ""Field 1"", enter ""Welcome"", and perform a `doubleClick()` on the button.
    2.  Verify that the text was copied to ""Field 2"".
    3.  **Note:** Students must explain why `getText()` returns an empty string for input boxes and must use `
    getAttribute(""value"")` instead to retrieve the text for validation."
 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AS017 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//switch to frame
		WebElement frame1=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
					
		//Clear ""Field 1"", enter ""Welcome""
		box1.clear();
		box1.sendKeys("Welcome");
		
		Actions act=new Actions(driver);
		
		//`doubleClick()` on the button.
		act.doubleClick(button).perform();
		Thread.sleep(3000);
		//getText() capture the inner text of the element
		//getAttribute returns the value of the attribute
		
		//Verify that the text was copied to ""Field 2"".
		String text=box2.getAttribute("value");
		
		System.out.println("captured text is: "+text);
		
		if(text.equals("Welcome"))
		{
			System.out.println("Text copied..");
		}else
		{
			System.out.println("Text not copied properly..");
		}
		
		Thread.sleep(2000);
		driver.close();
		
		/*
		 * Output:captured text is: Welcome
		 * Text copied..
		 */
	}

}

