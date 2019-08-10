package com.orangeHRM.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.IIOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	
	public void  openExcel(String filePath,String sheetname) {
		try {
		fis=new FileInputStream(filePath);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetname);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getCellData(int rowIndex, int cellIndex) {
		return sheet.getRow(rowIndex).getCell(cellIndex).toString();
		
	}
	public int getRowNumber() {
		return sheet.getPhysicalNumberOfRows();
	}
	public int getcolNumber(int rowIndex) {
		return sheet.getRow(rowIndex).getLastCellNum();
	}

}
