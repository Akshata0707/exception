package checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("wakeup.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		}finally {
			System.out.println("irrespective ofexceptions occur or not finally block will always execute");
		}
	}
}
