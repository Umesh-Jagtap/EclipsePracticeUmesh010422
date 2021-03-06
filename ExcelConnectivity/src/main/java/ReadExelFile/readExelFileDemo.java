package ReadExelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class readExelFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(new File("D:\\Umesh\\Java Eclipse\\Assignments\\ExelDemo\\student1.xls"));
		HSSFWorkbook hw = new HSSFWorkbook(fis);
		HSSFSheet shit = hw.getSheetAt(0);
		FormulaEvaluator fe= hw.getCreationHelper().createFormulaEvaluator();
		
		for(Row row:shit) {
			
			for(Cell cell:row) {
				
				switch(fe.evaluateInCell(cell).getCellType()) {
				case NUMERIC:
					System.out.println(cell.getNumericCellValue()+ "\t\t");
				break;
				case STRING:
					System.out.println(cell.getStringCellValue()+ "\t\t");
				break;
				}
			}
			System.out.println();
		}
		
	}

}
