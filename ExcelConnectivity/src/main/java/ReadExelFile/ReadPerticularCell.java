package ReadExelFile;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPerticularCell {
	
	
	public String getCellData(int vRow,int vColumn) throws InvalidFormatException, IOException {
		String value=null;
		File fis= new File("D:\\Umesh\\Java Eclipse\\Assignments\\ExelDemo\\student.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		Sheet sheet=wb.getSheetAt(0);
		Row row=sheet.getRow(vRow);
		Cell cell=row.getCell(vColumn);
		value=cell.getStringCellValue();
		return value;
		
	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		ReadPerticularCell rp = new ReadPerticularCell();
		String CellData=rp.getCellData(3, 3);
		System.out.println(CellData);
	}

}
