package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment2_2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.linkText("click the button to display an  alert box:")).click();
        driver.switchTo().alert().accept();

	}

}

