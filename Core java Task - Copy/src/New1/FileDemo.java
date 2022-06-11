package New1;

import java.io.File;
import java.util.*;

public class FileDemo {
	
	public static void main(String args []) {
		
		File f = new File("F:\\abc.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File got created");
			}
			else {
				System.out.println("File not Created");
			}
		}
			catch (Exception e){
		    	e.printStackTrace();
	}

}
}