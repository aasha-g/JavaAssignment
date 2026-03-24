/*  Heterogeneous Data Handling with Collections
 * "**Task:** Write a program that uses a Java **ArrayList** to populate an Excel sheet
 *  with different data types.
*   **Requirements:**
    *   Store data in an `ArrayList<Object[]>` where each object array contains a String (Name), 
    *   an Integer (Age), and a Boolean (IsActive).
    *   While writing to the Excel file, use the **`instanceof` operator** to check if the data
    *    is a String, Integer, or Boolean.
    *   Implement the corresponding `setCellValue` method for each detected type to 
    *   ensure data integrity."
 */
package readData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.*;

public class AERW002 {

	public static void main(String[] args) throws IOException {
		

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("userdata");
		
		ArrayList<Object[]> userdata = new ArrayList<>();
		userdata.add(new Object[]{"Name", "Age", "IsActive" });
        userdata.add(new Object[]{"A", 36, true});
        userdata.add(new Object[]{"B", 28, false});
        userdata.add(new Object[]{"C", 21, true});
        
		//using for...each loop
        int rownum=0;
        
        for(Object[]data:userdata) 
        {
        	XSSFRow row=sheet.createRow(rownum++);
        	int cellnum=0;
        	for(Object value:userdata)
        	{
        		XSSFCell cell=row.createCell(cellnum);
								
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
        	}
        }
        
        
          String filepath=".\\datafiles\\UserData.xlsx";
		  FileOutputStream outstream=new FileOutputStream(filepath);
		  workbook.write(outstream);
		  
		  outstream.close();
		
		
		
		
		  System.out.println("UserData.xlsx file written successfully");
        
        
        
	}

}

