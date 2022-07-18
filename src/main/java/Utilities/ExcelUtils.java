package Utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtils {
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;
    private static XSSFCell cell;

    public void setExcelFile(String excelFilePath, String sheetName) throws IOException {
        File file = new File(excelFilePath);
        FileInputStream inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet(sheetName);
    }

    public String getCellData(int rowNumber, int cellNumber) {
        cell = sheet.getRow(rowNumber).getCell(cellNumber);
        return (cell == null) ? "" : cell.getStringCellValue();
    }

    public int getRowCountInSheet() {
        int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        return rowcount;
    }

    public int getLastRowInSheet() {
        int rowcount = sheet.getLastRowNum();
        return rowcount;
    }

    public void setCellValue(int rowNum, int cellNum, String cellValue, String excelFilePath) throws IOException {
        if (sheet.getRow(rowNum) == null) {
            sheet.createRow(rowNum);
        }
        sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);
        FileOutputStream outputStream = new FileOutputStream(excelFilePath);
        workbook.write(outputStream);
    }
}
