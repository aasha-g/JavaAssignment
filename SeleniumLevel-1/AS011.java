/*Advanced Checkbox Logic (Selecting All and Last $n$)
 * " **Topic:** Looping and dynamic locators.
*   **Task:** Using a page with multiple checkboxes (like the Seven Days list):
    1.  Identify a common attribute to capture all Seven Elements into a `List<WebElement>`.
    2.  Use an **enhanced for loop** to select all checkboxes.
    3.  Implement a logic-based script to select only the **last three checkboxes** 
    dynamically, regardless of the total count, using the formula: 
    `Total - Count = Starting Index`."
 */
package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS011 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();

		// Identify a common attribute to capture all Seven Elements into a `List<WebElement>
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		
		
		//Use an **enhanced for loop** to select all checkboxes.
	    for(WebElement checkbox:checkboxes)
	    {
	    	checkbox.click();
	    }
		
		
		//Implement a logic-based script to select only the **last three checkboxes**
		//`Total - Count = Starting Index[7-3=4]
		/*for(int i=4;i<checkboxes.size();i++)
		{
			System.out.println(checkboxes.get(i));
		}
		*/
		
		driver.close();
		
		
	}

}

