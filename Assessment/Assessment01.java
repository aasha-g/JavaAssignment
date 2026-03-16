package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:basic:0")).click();
		
		//driver.findElement(By.xpath("//input[@id='j_idt87:basic:0']")).click();
		//
		//driver.findElement(By.xpath("//input[@value='js']")).click();
		//driver.findElement(By.xpath("//input[@value='c#']")).click();
		//driver.findElement(By.xpath("//input[@value='ot']")).click();
		
		
	}

}

