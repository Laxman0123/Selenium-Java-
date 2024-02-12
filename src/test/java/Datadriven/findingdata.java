package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class findingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream  fso = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleJava\\Excel\\ExcelBook.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook(fso);
		XSSFSheet wso = wbo.getSheet("Sheet1");
		String data = wso.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);


	}

}
