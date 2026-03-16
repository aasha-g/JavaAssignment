package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment3_1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
        
        WebElement outerFrame=driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
        driver.switchTo().frame(outerFrame);
        
        WebElement innerFrame=driver.findElement(By.xpath("//h5[text()='iFrame Demo']"));
        
        driver.switchTo().frame(innerFrame);
        
        driver.findElement(By.xpath("//input[type='text']")).sendKeys("Automation practice");
        driver.switchTo().defaultContent();
	}

}

