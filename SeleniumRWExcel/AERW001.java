
/* Basic Excel Creation and Data Writing
 * "**Task:** Create a Java program that generates a new Excel file named `CompanyData.xlsx`.
*   **Requirements:**
    *   Create a workbook and a sheet named ""Employee Info"".
    *   Define a **header row** containing: ""ID"", ""Name"", and ""Department"".
    *   Add at least three rows of employee records using a **two-dimensional Object array**.
    *   Use a **nested for-loop** to iterate through the array and write the data into cells.
    *   Save the file to a specific local directory using `FileOutputStream`."
 */
package readData;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AERW001 {

	public static void main(String[] args) throws IOException {
		

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Employee Info");
		
		Object empdata[][]= { {"ID","Name","Department"},
		                      {"101","A","Engineer"},
		                      {"102","B","Analyst"},
		                      {"103","c","Manager"}
				
	                        };
		
		int rows=empdata.length;
		int cols=empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.createCell(c);
				Object value=empdata[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
		  String filepath=".\\datafiles\\CompanyData.xlsx";
		  FileOutputStream outstream=new FileOutputStream(filepath);
		  workbook.write(outstream);
		  
		  outstream.close();
		
		
		
		
		  System.out.println("CompanyData.xlsx file written successfully");
		
		
		

		
	}

}
