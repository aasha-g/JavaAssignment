/*
 * Assignment-2:
------------ 
Form Interaction & Dropdowns (BlazeDemo)
Target URL: https://blazedemo.com/
Locators to Practice: Name, XPath, Tag Name.

Instructions:

Navigate to the site and locate the "Departure City" and "Destination City" dropdowns.
Select "Mexico City" as the departure and "London" as the destination.
Click the "Find Flights" button.
On the results page, use a relative XPath to click the "Choose This Flight" button for the third flight listed in the table.
Fill out the "Purchase" form using Name locators for the text fields (Name, Address, City, etc.).

 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS002 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://blazedemo.com");
		driver.manage().window().maximize();
		
		//locate the "Departure City"
		driver.findElement(By.name("fromPort")).sendKeys("Mexico");
		//locate "Destination City"
		driver.findElement(By.name("toPort")).sendKeys("London");
		//Click the "Find Flights" button.
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(2000);
		//"Choose This Flight" button for the third flight
		driver.findElement(By.xpath("(//input[@value='Choose This Flight' ])[3]")).click();
		

        Thread.sleep(2000);

        // Fill Purchase Form using Name locators
        driver.findElement(By.name("inputName")).sendKeys("Asha");
        driver.findElement(By.name("address")).sendKeys("gadag");
        driver.findElement(By.name("city")).sendKeys("gadag");
        driver.findElement(By.name("state")).sendKeys("karnataka");
        driver.findElement(By.name("zipCode")).sendKeys("582101");
        driver.findElement(By.name("cardType")).sendKeys("Visa");
        driver.findElement(By.name("creditCardNumber")).sendKeys("123456789");
        driver.findElement(By.name("creditCardMonth")).sendKeys("2");
        driver.findElement(By.name("creditCardYear")).sendKeys("2027");
        driver.findElement(By.name("nameOnCard")).sendKeys("asha");
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
        Thread.sleep(2000);
		
		
	}

}

