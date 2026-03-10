/* Switching Between Multiple Browser Windows**
 * "**Topic:** Window Handles.
*   **Task:** Navigate to a site and click a link that opens a new tab/window.
    1.  Capture the parent window handle using `getWindowHandle()`.
    2.  Capture all open handles using `getWindowHandles()`.
    3.  Iterate through the handles, switch to the child window, verify its title,
     perform an action (like filling a text box), close it, and switch back to the parent window."
 */
package seleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS019 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		// Capture the parent window handle using `getWindowHandle()`.
		String firstwindow=driver.getWindowHandle();
		Thread.sleep(3000);
		
        //Navigate to a site and click a link that opens a new tab/window
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(3000);
		//Capture all open handles using `getWindowHandles()`
        Set<String> windows = driver.getWindowHandles();
		
        // Iterate through the handles, switch to the child window, verify its title,
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext())
		{
			String window=itr.next();
			
			driver.switchTo().window(window);
			
			if(driver.getTitle().equals("New Window"))
			{
				System.out.println("title matches");
				driver.close();
			}
			
			Thread.sleep(3000);
		}
		driver.switchTo().window(firstwindow);
		
		//perform an action (like filling a text box)
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
	}
          //output:title matches
}

