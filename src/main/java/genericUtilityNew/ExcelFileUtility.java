package genericUtilityNew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility 
{
	/*
	 * Read single data
	 */
	public void readSingleData(String sheetName,int rowNum,int cellNum) throws Exception {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\ReadData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
	public Object[][] readMultipleData(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".\\\\\\\\src\\\\\\\\test\\\\\\\\resources\\\\\\\\ReadData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int lastRow=sh.getLastRowNum();
//		sh.getPhysicalNumberOfRows()
		int lastCell=sh.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[lastRow][lastCell];
//		Object[][] data=null;
		
		/*
		for(int i=0;i<lastRow;i++)
		{
			for(int j=0;j<lastCell;j++)
			{
				data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}*/
		   for (int i = 0; i < lastRow; i++) {
		        for (int j = 0; j < lastCell; j++) {
		            Cell cell = sh.getRow(i + 1).getCell(j);
		            if (cell != null) {
		                if (cell.getCellType() == CellType.STRING) {
		                    data[i][j] = cell.getStringCellValue();
		                } else if (cell.getCellType() == CellType.NUMERIC) {
		                    data[i][j] = cell.getNumericCellValue();
		                } else if (cell.getCellType() == CellType.BOOLEAN) {
		                    data[i][j] = cell.getBooleanCellValue();
		                } else if (cell.getCellType() == CellType.BLANK) {
		                    data[i][j] = ""; // Or whatever default value you want to use
		                }
		            } else {
		                data[i][j] = ""; // Or whatever default value you want to use
		            }
		        }
		    }
		return data;
	}

}
