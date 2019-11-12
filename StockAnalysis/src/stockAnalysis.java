import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class stockAnalysis {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Anurag\\StockAnalysis\\MSFT.csv");
		
		Scanner sc;

		try {
			sc = new Scanner(file);
			
//			if (sc.hasNextLine())
//			{
				sc.nextLine();
//			}
			double sum = 0;
			int count=0;
			while(sc.hasNextLine()) {	
				var line = sc.nextLine();
				var data = line.split(",");
				var doubleData = Double.valueOf(data[4]); 
				sum+=doubleData;
				count++;
				//System.out.printf("%f, %f",doubleData,sum);
				//System.out.println();
			}
			System.out.printf("Average = %f", sum/count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("File not found.");
		}
		
	}

}
