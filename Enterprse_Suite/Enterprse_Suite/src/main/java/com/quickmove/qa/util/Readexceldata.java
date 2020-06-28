package com.quickmove.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
@Test
public class Readexceldata {

	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\Admin\\eclipse-workspace\\Enterprse_Suite\\src\\main\\java\\com\\quickmove\\TestData\\TestData.xlsx";
static	XSSFWorkbook book;
static	XSSFSheet   sheet1;
	
	public   Readexceldata(String TESTDATA_SHEET_PATH) throws IOException {
		File src=new File(TESTDATA_SHEET_PATH);
		FileInputStream fis=new FileInputStream(src);
		 book=new XSSFWorkbook(fis);
		 sheet1=book.getSheetAt(0);
		 
		 
	}
	public String gettestdataexcel(int Sheetnumber,int row,int coloumn)
	{
		sheet1=book.getSheetAt(0);
			String data1=sheet1.getRow(row).getCell(coloumn).getStringCellValue();
			return data1;
			
		}
	public int getrowcount(int sheetindex)
	{
		int row=book.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;
		
	/*	
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		book.close();*/
	
	/*int rowcount=sheet1.getLastRowNum();
	
	for(int i=0;i<=rowcount;i++)
	{
		String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data0);*/
		}
		
	
}
