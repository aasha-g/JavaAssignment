/*Mouse Over and Context Click (Right-Click)**
 * " **Topic:** The `Actions` class.
*   **Task:** 
    1.  **Mouse Over:** Navigate to a menu (like ""Desktops""), hover over it to reveal sub-menus, 
    hover over a sub-item (like ""Mac""), and then click it.
    2.  
 on a specific button to trigger a context menu,
     then select an option from that menu (e.g., ""Copy"")."
 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AS016 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//**Mouse Over:** Navigate to a menu (like ""Desktops"")
		WebElement computers=driver.findElement(By.xpath("//ul[@class='top-menu']/li/a[contains(text(),'Computers')]"));
		WebElement notebooks=driver.findElement(By.xpath("//li/ul[@class='sublist firstLevel']/li/a[@href='/notebooks']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(computers).moveToElement(notebooks).click().build().perform();
		Thread.sleep(3000);
		
		//**Right-Click:** Perform a `contextClick()`
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//right click
		act.contextClick(button).perform();
		
		//click on copy
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(5000);
		//close alert box
		driver.switchTo().alert().accept();
		
		driver.close();
		
		
	}

}

