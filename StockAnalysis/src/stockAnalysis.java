import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class stockAnalysis {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Anurag\\StockAnalysis\\MSFT.csv");
		
		Scanner sc;

		try {
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("File not found.");
		}
	}

}
