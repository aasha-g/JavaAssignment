/*Navigating Frames and Inner iFrames**
 * " **Topic:** Handling frames and `defaultContent()`.
*   **Task:** Use the frame-based practice page.
    1.  Switch to the first frame using a web element locator and enter text.
    2.  Switch back to the main page using `defaultContent()` before switching to a second frame.
    3.  **Advanced:** Navigate to an **inner iframe** within Frame 3, 
    locate a radio button inside that nested frame, and click it."
 */

package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS015 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame:1
		//Switch to the first frame using a web element locator and enter text.
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		//Switch back to the main page using `defaultContent()
		driver.switchTo().defaultContent();
		
		//frame:2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("hello");
		
		//Switch back to the main page using `defaultContent()
		driver.switchTo().defaultContent();
		
		//frame:3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		
		//inner iframe-part of frame3
		driver.switchTo().frame(0);//switching to frame using index
		
		//driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		WebElement rdbutton=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", rdbutton);
		
		driver.switchTo().defaultContent();
		
		driver.close();
		
	}

}

