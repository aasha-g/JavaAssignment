/*
 * Assignment-4:
------------
Advanced UI Elements (LetsKodeIt Practice)
Target URL: https://www.letskodeit.com/practice
Locators to Practice: ID, CSS Selector, Class Name.

Instructions:
Select a radio button from the "Radio Button Example" section using its ID.
Select "Apple" and "Orange" from the "Checkbox Example" section.
Handle the "Web Table Example": Locate the price of the "Python Programming Language" course using a CSS Selector.
Practice interacting with the "Mouse Hover" element to click a sub-menu item.

 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AS004 {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		//Select a radio button from the "Radio Button Example" section using its ID.
		driver.findElement(By.id("radio-btn-example")).click();
		Thread.sleep(2000);
		
		//Select "BMW" and "BENZ" from the "Checkbox Example" section.
		driver.findElement(By.id("bmwcheck")).click();
		driver.findElement(By.id("benzcheck")).click();
		Thread.sleep(2000);
		
		//Handle the "Web Table Example": Locate the price of the "Python Programming Language" course using a CSS Selector.
	String s=driver.findElement(By.cssSelector("tbody tr:nth-child(3) td:nth-child(3)")).getText();
		System.out.println(s);//body tr:nth-child(3) td:nth-child(3)
	
	    //"Mouse Hover" element to click a sub-menu item.
		WebElement hoverElement = driver.findElement(By.id("mousehover"));

        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();

        Thread.sleep(2000);

        // Click Top option from hover menu
        driver.findElement(By.linkText("Top")).click();

        Thread.sleep(2000);

	
	
	
	}
	

}

