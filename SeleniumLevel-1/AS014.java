/***Assignment 5: Bypassing Authenticated Popups**
 * "**Topic:** URL injection for authentication.
*   **Task:** Provide a URL that triggers a browser-level username/password popup.
    1.  Explain why `switchTo().alert()` and standard inspection do not work for these popups.
    2.  Student must implement the **injection syntax**: `http://admin:admin@the-internet.herokuapp.com/basic_auth`
     to bypass the login prompt and verify the ""Congratulations"" message."
 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS014 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		/*https://the-internet.herokuapp.com/basic_auth
		syntax:
		https://username:password@the-internet.herokuapp.com/basic_auth
		*/
		
		//URL injection for authentication.
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//verify the ""Congratulations"" message."
		boolean msg=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).isDisplayed();
		System.out.println(msg);
		
		String msg1=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
		System.out.println(msg1);
		
		driver.close();
		//Output:true
		//Congratulations! You must have the proper credentials.
			
		
		
		
		
		
		
	}

}

