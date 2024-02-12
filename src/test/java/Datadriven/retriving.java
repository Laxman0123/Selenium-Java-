package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class retriving {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleJava\\Excel\\ExcelBook.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet b = workbook.getSheet("sheet1");
		Row c;
		int rowc = b.getLastRowNum();
		for(int i=0; i<rowc; i++)
		{
			c = b.getRow(i);
			String data = c.getCell(0).getStringCellValue();
			System.out.println(data);
		}
		b.createRow(1).createCell(0).setCellValue("Laxman");
		FileOutputStream fo = new FileOutputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SeleJava\\\\Excel\\\\ExcelBook.xlsx");
//		b.write(fo);
			
	
	}

}
