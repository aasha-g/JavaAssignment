/*
 * "URL: https://www.letskodeit.com/practice
The Task: Navigate to the Web Table Example.
The Challenge: Locate the ""Price"" of the course ""Python Programming Language"" without using a static row index.
Key Concept: Students must use XPath Axes (such as following-sibling::) to locate the price cell relative to the text of the course name. This prevents the script from breaking if the row order changes."
 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS006 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		// 1. Locate the Price cell using following-sibling
        String xpath = "//td[text()='Python Programming Language']/following-sibling::td";
        WebElement priceCell = driver.findElement(By.xpath(xpath));

        // 2. Extract and print the price
        String price = priceCell.getText();
        System.out.println("The price for Python Programming Language is: " + price);

        driver.quit();
		
	}

}

