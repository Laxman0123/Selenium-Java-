package Keywordf;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class keyscript {
	

@Test
	
	public void data() throws IOException, InterruptedException 
	{
	    Actionkeyword key=new Actionkeyword();//created object for keyword class
	    FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleJava\\Excel\\TestData.xlsx");
		
		
		XSSFWorkbook wbo = new XSSFWorkbook(fis);
		XSSFSheet wso = wbo.getSheet("Sheet1");

		Row r;
		
		int rowc=wso.getLastRowNum();
		 
		 for(int i=1;i<=rowc;i++)
		 {
			 r=wso.getRow(i);
			 
			 String runmode=r.getCell(4).getStringCellValue();
			 
			 if(runmode.equals("y"))
		{
		
				 String action=r.getCell(3).getStringCellValue();
					
					if(action.equals("launch browser"))
					{
						key.launchbrowser();
						
					}
					else if(action.equals("navigate"))
					{
						key.navigate();
					}
					else if(action.equals("enterusername"))
						
					{
						key.enterusername();
					}
						
					else if(action.equals("enterpassword"))
					{
						key.enterpassword();
						
					}
					
					else if(action.equals("clickonlogin"))
					{
						key.clicklogin();
					}
					else if(action.equals("logout"))
					{
						key.logout();
					}
					
					else if(action.equals("close"))
					{
						key.close();
					}
	        }
     }
	}

}
