
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a [@href='#Single']")).click();
        
        WebElement frame1=driver.findElement(By.xpath(""));
        
        driver.switchTo().frame(frame1);
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium training");
        
        
        
        
        
        
        
        
        
	}

}
