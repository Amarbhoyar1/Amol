package BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class 
{

	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("");
		
	    Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");
		
		
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
		return value;
		
}
	public static void CaptureScreenShot(WebDriver driver, int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\User\\eclipse-workspace\\Mavenframework\\Screen shot\\screenshot");
		FileHandler.copy(src, dest);
	}
	
	public static String getPFdata(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Mavenframework\\properties.property");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		
		return value;
	
}
}