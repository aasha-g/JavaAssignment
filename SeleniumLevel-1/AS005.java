/*Assignment-5:
------------
E-commerce Workflow (SauceDemo)
Target URL: https://www.saucedemo.com/
Locators to Practice: ID, Data-test attributes, Class Name.

Instructions:
Log in using the credentials provided on the page (e.g., standard_user).
Add the "Sauce Labs Backpack" to the cart by locating its "Add to cart" button via a unique ID.
Click the Shopping Cart icon (locate by Class Name).
Click "Checkout" and complete the "Your Information" page using ID locators for First Name, Last Name, and Zip Code.

 * 
 */
package seleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AS005 {

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
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		//Add the "Sauce Labs Backpack" to the cart by locating its "Add to cart" button via a unique ID.
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		//Click the Shopping Cart icon (locate by Class Name).
	    driver.findElement(By.className("shopping_cart_container")).click();
	    
	    //Click "Checkout" and complete the "Your Information" page using ID locators for First Name, Last Name, and Zip Code.
	    driver.findElement(By.id("checkout")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("first-name")).sendKeys("asha");
	    driver.findElement(By.id("last-name")).sendKeys("H");;
	    driver.findElement(By.id("postal-code")).sendKeys("12345");
	    driver.findElement(By.id("continue")).click();
	
	}

}

