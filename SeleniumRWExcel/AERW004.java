/*Dynamic Formula Application
 * "Task:** Modify an existing Excel report to add a summary row programmatically.
*   **Requirements:**
    *   Load an existing file (e.g., `Books.xlsx`) that contains a list of prices in a column.
    *   Identify the last row and create a new row at the bottom for ""Total Price"".
    *   Use the **`setCellFormula()`** method to inject an Excel `SUM` function 
    *   (e.g., `SUM(C2:C10)`) into the target cell.
    *   Handle both **`FileInputStream`** and **`FileOutputStream`** to read the existing data
    *    and then save the modifications back to the file."
 */
package readData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class AERW004 {

	public static void main(String[] args) throws IOException {
		
		String excelpath=".\\datafiles\\Books.xlsx";
		FileInputStream stream=new FileInputStream(excelpath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//Identify the last row and create a new row at the bottom for ""Total Price"".
		int lastrow=sheet.getLastRowNum();
		XSSFRow newrow=sheet.createRow(lastrow+1);
		
		XSSFCell cell=newrow.createCell(0);
		cell.setCellValue("Total Price");
		
		
		// Use the **`setCellFormula()`** method to inject an Excel `SUM` function 
		XSSFCell formulacell=newrow.createCell(1);
		formulacell.setCellFormula("SUM(B2:B" + (lastrow+1) + ")");
		
		
		FileOutputStream outstream=new FileOutputStream(excelpath);
		workbook.write(outstream);
		  
		  outstream.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

