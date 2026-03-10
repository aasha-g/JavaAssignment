/*"URL:  https://www.letskodeit.com/practice
The Task: Use the ""Switch Window Example"" and ""Switch Tab Example"".
The Challenge:
Click ""Open Window"" to launch a new browser session.
Use getWindowHandles() to capture all IDs and switch the driver's focus to the new window.
Validate the Page Title of the new window (e.g., ""All Courses"") using getTitle().
Close only the child window and return the driver’s focus to the parent window to interact with the ""Radio Button Example""."
 * 
 */
package seleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS007 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		String parentwindow=driver.getWindowHandle();
		Thread.sleep(3000);
		
		//child window--->open window
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext())
		{
			String window=itr.next();
			driver.switchTo().window(window);
			System.out.println(window);
			if(driver.getTitle().equals("All Courses"))
			{
				driver.close();
			}
		}
		Thread.sleep(2000);
		
		//return to the parent window
		driver.switchTo().window(parentwindow);
		System.out.println("Back to Parent Window Title: " + driver.getTitle());
		
		//interact with the ""Radio Button Example
		
		driver.findElement(By.id("radio-btn-example")).click();
		driver.findElement(By.id("bmwradio")).click();
		
		//child window--->open Tab
				driver.findElement(By.id("opentab")).click();
				Thread.sleep(3000);
				Set<String> windows1 = driver.getWindowHandles();
				
				Iterator<String> itr1 = windows1.iterator();
				
				while(itr1.hasNext())
				{
					String window=itr1.next();
					driver.switchTo().window(window);
					if(driver.getTitle().equals("All Courses"))
					{
						driver.close();
					}
				}
				Thread.sleep(2000);
				
				//return to the parent window
				driver.switchTo().window(parentwindow);
				System.out.println("Back to Parent Window Title: " + driver.getTitle());
				
		
		driver.close();
		
		/*Output:
		 * 89756D1C66B23679B003F640443B292F
		 * CE1995FAEC62BCFE0D47942E9EEB10B
		 * Back to Parent Window Title: Practice Page
		 * Back to Parent Window Title: Practice Page
		 * 
		 */
	}

}

