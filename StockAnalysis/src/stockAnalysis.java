import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.*;

public class stockAnalysis {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Anurag\\StockAnalysis\\MSFT.csv");
		
		List<StockDailyDetails> stockDailyDetailList = new ArrayList<StockDailyDetails>();
		
		try {
			Scanner sc = new Scanner(file);

			// skip header
			sc.nextLine();

			while(sc.hasNextLine()) {	
				var line = sc.nextLine();
				var data = line.split(",");
				var openPrice = Double.valueOf(data[1]);
				var highPrice = Double.valueOf(data[2]);
				var lowPrice = Double.valueOf(data[3]);
				var closePrice = Double.valueOf(data[4]); 
				var adjClosePrice = Double.valueOf(data[5]);
				var volume = Long.valueOf(data[6]);
				
				var stockDetail = new StockDailyDetails();
				stockDetail.OpenPrice = openPrice;
				stockDetail.HighPrice = highPrice;
				stockDetail.LowPrice = lowPrice;
				stockDetail.ClosePrice = closePrice;
				stockDetail.AdjClosePrice = adjClosePrice;
				stockDetail.Volume = volume;
				
				stockDailyDetailList.add(stockDetail);
			}
			
			var count = stockDailyDetailList.size();
			double openSum = 0.0;
			double closeSum = 0.0;
			for (StockDailyDetails stockDailyDetails : stockDailyDetailList) {
				openSum += stockDailyDetails.OpenPrice;
				closeSum += stockDailyDetails.ClosePrice;
			}
			
			System.out.printf("Average Open Price = %f\r\n", openSum/count);
			System.out.printf("Average Close Price = %f\r\n", closeSum/count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("File not found.");
		}
		
	}

}
