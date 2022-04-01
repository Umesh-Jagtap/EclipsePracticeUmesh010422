package ReadExelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFileXLSX {

	public static void main(String[] args) throws IOException {
		File file= new File("D:\\Umesh\\Java Eclipse\\Assignments\\ExelDemo\\student.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		Iterator<Row> itr=sheet.iterator();
		while(itr.hasNext()) {
			Row row=itr.next();
			Iterator<Cell> cellItertor=row.cellIterator();
			while(cellItertor.hasNext()){
				Cell cell=cellItertor.next();
				switch(cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue() + "\t\t");
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue() + "\t\t");
					break;
					
				}
			}
			System.out.println();
			
		}

	}

}
