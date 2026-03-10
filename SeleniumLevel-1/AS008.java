/*
 * "URL: Swag Labs Login//https://www.saucedemo.com/
The Task: Automate the login process using the provided credentials (e.g., standard_user and secret_sauce).
The Challenge: Write a Relative XPath for the ""Login"" button that does not rely on a static ID, assuming the ID might change upon refresh.
Key Concept: Using XPath functions like contains() or starts-with() to create robust locators for elements with potentially dynamic attributes."
 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AS008 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		
		//Log in using the credentials provided on the page (e.g., standard_user).
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
		//driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).click();
	}

}

