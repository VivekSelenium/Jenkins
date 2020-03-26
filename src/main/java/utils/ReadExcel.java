package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readExcelData(String fileName) throws IOException {
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx"); // Locate the workbook and open it.
		XSSFSheet sheet = wBook.getSheet("Sheet1");// Navigate to the sheet with the reference to book // XSSFSheet sheetAt = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum(); // With reference to the sheet, find the number of active rows available
		int colCount = sheet.getRow(0).getLastCellNum();// sheet.getPhysicalNumberOfRows();// With ref of sheet, get the header row. With ref of header row,get the number // of active cols available
		String[][] data = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) { // Iterate over the rows
			XSSFRow row = sheet.getRow(i);	
			for (int j = 0; j < colCount; j++) { // Iterate over the cells
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();// Read the data from the cell
				System.out.println(data[i-1][j]);
			}
			}
		wBook.close();
		return data;
	}
}
