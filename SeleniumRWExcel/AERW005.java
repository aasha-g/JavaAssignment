/*Advanced: Web Scraping to Excel 
 * "Task:** Integrate Selenium WebDriver with Apache POI to perform data-driven web scraping.
*   **Requirements:**
    *   Use Selenium to navigate to a website containing a **WebTable**.
    *   Iterate through the rows and columns of the web table using `findElements(By.xpath(...))`.
    *   As the script scrapes each cell value from the web, simultaneously write that data into a 
    *   new Excel sheet in real-time.
    *   The student must manage the **WebDriver** lifecycle while maintaining an open **POI Workbook**
    *    object to ensure allscraped data is captured before the browser closes."
 */ 
       
//package readData;
//public class AERW005 {

package readData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AERW005 {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("WebTable Data");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();

      
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']"));

        for (int i = 0; i < rows.size(); i++) 
        {
            Row excelRow = sheet.createRow(i);

            List<WebElement> cols = rows.get(i).findElements(By.xpath("td"));

            for (int j = 0; j < cols.size(); j++) 
            
            {

                String cellData = cols.get(j).getText();

                excelRow.createCell(j).setCellValue(cellData);

                System.out.print(cellData + "  ");
            }

            System.out.println();
        }

       
        FileOutputStream file = new FileOutputStream("\\.datafiles\\WebTableData.xlsx");
        workbook.write(file);

        
        file.close();
        workbook.close();
        driver.quit();

       

    }
}

