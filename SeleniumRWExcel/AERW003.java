/* Reading and Identifying Formula Cells
 * "Develop a utility to read data from an existing Excel file that contains calculated values.
*   **Requirements:**
    *   Open an Excel file that has columns for ""Salary"", ""Bonus"", and a ""Total"" 
    *   (where Total is a formula like `A2+B2`).
    *   Use a **switch-case statement** on `getCellType()` to identify the nature of each cell.
    *   Crucially, ensure the code can detect **`CellType.FORMULA`** and retrieve the numeric result
    *    of that formula using `getNumericCellValue()`."
 */
package readData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class AERW003 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(".\\datafiles\\FormulaCell.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue());break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());break;
				case FORMULA:
					System.out.print(cell.getNumericCellValue());break;	
				}
				System.out.println(" | ");
			}
			System.out.println();
		}
		
		
		
		
		file.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}

