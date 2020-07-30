package assignment8;
import java.io.IOException;
import java.io.File;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Badminton");
		file.mkdir();
		File file1 = new File(file, "singles.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		File file2 = new File(file, "dubbles.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		File file3 =new File("C:\\Badminton\\courts");
		file3.mkdir();
		File file4 = new File(file3, "Smash.dat");
		try {
			file4.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		File file5 = new File(file,"doubles.txt");
		file2.renameTo(file5);
		file1.delete();
	}
}