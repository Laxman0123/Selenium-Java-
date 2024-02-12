package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class creatingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleJava\\Excel\\ExcelBook.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook(file);
		XSSFSheet sheet = wbo.getSheet("sheet1");
		for(int i=0; i<7; i++)
		{
			sheet.createRow(i).createCell(0).setCellValue("pavani");
			
		}
		FileOutputStream outp =new FileOutputStream("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\SeleJava\\\\Excel\\\\ExcelBook.xlsx");
		wbo.write(outp);

	}

}
