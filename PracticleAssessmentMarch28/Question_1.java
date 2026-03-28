package readData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question_1 {

	public static void main(String[] args) throws IOException {
		
		String filepath=".\\datafiles\\data.xlsx";
		FileInputStream stream=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		XSSFSheet sheet=workbook.getSheet("Data-1");
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.getCell(c);
				double value= cell.getNumericCellValue();
				if(value%2==0)
				{
					cell.setCellValue("even");
				}else {
					cell.setCellValue("odd");
				}
				
				
			int read_excel(int row,int column) {

				for(int r=0;r<rows;r++)
				{
					XSSFRow row=sheet.getRow(r);
					for(int c=0;c<cols;c++)
					{
						XSSFCell cell=row.getCell(c);
			}
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
		
		
		
		
		
	}


		
	}

}

