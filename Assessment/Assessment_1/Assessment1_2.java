package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment1_2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Option1']")).click();

	}

}

