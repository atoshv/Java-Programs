package programs;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		File src = new File(System.getProperty("user.dir") + "//testData//testData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(cellCount);
		
		for (int i = 1; i <=rowCount; i++)
			
			for (int j = 0; j <= cellCount-1; j++) {
				
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
	}
}
