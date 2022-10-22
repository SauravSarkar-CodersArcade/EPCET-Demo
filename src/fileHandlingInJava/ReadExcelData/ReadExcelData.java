package fileHandlingInJava.ReadExcelData;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// xlsx, xls
public class ReadExcelData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./resources/ExcelData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Info");
        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(1).getLastCellNum();
        System.out.println(rowCount);
        System.out.println(columnCount);

        for (int i=1; i<=rowCount; i++){// Skipping the heading
            XSSFRow currentRow = sheet.getRow(i);
            for (int j=0; j<columnCount; j++){
                String cellValue = currentRow.getCell(j).toString();
                System.out.println("\t\t" + cellValue);
            }
            System.out.println();
        }
        workbook.close();
    }
}
