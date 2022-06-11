import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Sample {
	public static void main(String[] args) {
		try {
	    	 String csvFileAddress = "test.csv"; //csv file address
	         String xlsxFileAddress = "test.xlsx"; //xlsx file address
	         XSSFWorkbook workBook = new XSSFWorkbook();
	         XSSFSheet sheet = workBook.createSheet("sheet1");
	         String currentLine=null;
	         int RowNum=0;
	         BufferedReader br = new BufferedReader(new FileReader(csvFileAddress));
	         while ((currentLine = br.readLine()) != null) {
	             String str[] = currentLine.split(",");
	             RowNum++;
	             XSSFRow currentRow=sheet.createRow(RowNum);
	             for(int i=0;i<str.length;i++){
	                 currentRow.createCell(i).setCellValue(str[i]);
	             }
	         }

	         FileOutputStream fileOutputStream =  new FileOutputStream(xlsxFileAddress);
	         workBook.write(fileOutputStream);
	         fileOutputStream.close();
	         System.out.println("Done");
	        } catch (Exception ex) {
	         System.out.println(ex.getMessage()+"Exception in try");
	     }
	    }
	}

}
