package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("mousehover")).click();
        boolean a=driver.findElement(By.linkText("Top")).isDisplayed();
        System.out.println(a);
        boolean b=driver.findElement(By.linkText("Reload")).isDisplayed();
        System.out.println(b);
        
        
	}

}

