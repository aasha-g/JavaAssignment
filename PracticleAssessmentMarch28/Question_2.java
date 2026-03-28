package readData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_2 {

	public static void main(String[] args) throws IOException {
		String filepath=".\\datafiles\\data.xlsx";
		FileInputStream stream=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		XSSFSheet sheet=workbook.getSheet("Data-2");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
 
		WebElement username=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
		String value1=cell.getStringCellValue();
		username.sendKeys(value1);
		
		
		XSSFCell cell1=row.getCell(1);
		String value2=cell.getStringCellValue();
		username.sendKeys(value2);
		//login
		driver.findElement(By.id("login-button")).click();
		
		
		
		
	}

}

