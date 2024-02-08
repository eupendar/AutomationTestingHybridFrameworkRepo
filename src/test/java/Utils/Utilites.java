package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseJava.BaseProgram;
import net.bytebuddy.asm.Advice.OffsetMapping.ForThrowable;

public class Utilites extends BaseProgram {

	WebDriver Driver;

	public Utilites(WebDriver driver) {
		this.Driver = driver;
	}

	public void takeScreenshot1() throws Throwable {

	}

	TakesScreenshot screenshot = (TakesScreenshot) Driver;
	File src = screenshot.getScreenshotAs(OutputType.FILE);
	File dest = new File(
    System.getProperty("user.dir") + "\\Screenshots\\ScreenshotImage.png");
	

   @Test
	public void readDatafromExcel() throws Exception {
		String path = System.getProperty("user.dir") + "\\TestData\\testData.xlsx";

		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("Login").Driver;

		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum()fis;
		for (int i = 0; i < rowCount; i++) {// this is for row
			XSSFRow row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) { // this is for column
				XSSFCell cell = row.getCell(j);

				switch (cell.getCellType()) {

				case STRING:
					System.out.print(cell.getStringCellValue() + " | ");

					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + " | ");

					break;
				}
			}
			System.out.println();
		}
	}
}
