/*
 * " **Topic:** Basic element interaction.
*   **Task:** Navigate to the practice page and locate the **""Radio Button Example""** and **""Checkbox Example""**. 
*   Students should write a script to:
    1.  Select a specific radio button (e.g., ""Honda"").
    2.  Select a specific checkbox (e.g., ""BMW"").
    3.  Verify that only one radio button can be selected at a time,
     while multiple checkboxes can be selected.
*   **Key Concept:** Using `click()` for both selection and unselection."
 */
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS010 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		// 1.  Select a specific radio button (e.g., ""Honda"").
		driver.findElement(By.id("radio-btn-example"));
        Thread.sleep(2000);			
		driver.findElement(By.id("hondaradio")).click();//clicked on honda radio button
				
		//2.  Select a specific checkbox (e.g., ""BMW"").
		driver.findElement(By.xpath("//legend[normalize-space()='Checkbox Example']"));
		driver.findElement(By.id("bmwcheck")).click();//bmw checkbox
		
		//3.  Verify that only one radio button can be selected at a time
		driver.findElement(By.id("benzradio")).click();//clicked on benz radio button
		
		//to verify
		boolean bmwrd=driver.findElement(By.id("hondaradio")).isSelected();
		boolean benzrd=driver.findElement(By.id("benzradio")).isSelected();
		
		 System.out.println("BMW Radio Selected: " + bmwrd);
	     System.out.println("Honda Radio Selected After BMW Click: " + benzrd);
	     
	     //while multiple checkboxes can be selected.
	     driver.findElement(By.id("benzcheck")).click();//benz checkbox
	     driver.findElement(By.id("hondacheck")).click();//honda checkbox
	     
	     // 3. Verify multiple checkboxes can be selected
	        boolean bmwCheck = driver.findElement(By.id("bmwcheck")).isSelected();
	        boolean benzCheck = driver.findElement(By.id("benzcheck")).isSelected();
	        boolean hondaCheck=driver.findElement(By.id("hondacheck")).isSelected();
	        
	        System.out.println("BMW Checkbox Selected: " + bmwCheck);
	        System.out.println("Benz Checkbox Selected: " + benzCheck);
	        System.out.println("Benz Checkbox Selected: " + hondaCheck);

	        Thread.sleep(3000);
	        driver.close();
	     
	     /*
	      * BMW Radio Selected: false
	      * Honda Radio Selected After BMW Click: true
	      * BMW Checkbox Selected: true
	      * Benz Checkbox Selected: true
	      * Benz Checkbox Selected: true
	      */
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
	}

}

