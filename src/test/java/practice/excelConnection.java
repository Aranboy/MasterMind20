package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelConnection
{

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./ExcelFolder/Book.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		String s = sh.getRow(2).getCell(0).getStringCellValue();
		System.out.println(s);
	}

}
