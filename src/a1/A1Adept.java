package a1;


import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numberOfItems = scan.nextInt();
		double completeTotal = 0.0;
		// double personalTotal = 0.0;
		double total = 0.0;
		double max = 0.0;
		double min = 100000000.0;
				
		String[] priceName = new String[numberOfItems]; 
		double[] prices = new double[numberOfItems];
		for (int i=0; i<priceName.length; i++) {
			String itemName = scan.next();
			priceName[i] = itemName;
			double price = scan.nextDouble();
			prices[i] = price;
		}
			
			int cust = scan.nextInt();
			String[] customer = new String[cust];
			double[] customerPrice = new double[cust];
			// double[] customerPrice = new double[cust];
			for (int x=0; x<cust; x++) {
				String f = scan.next();
				String l = scan.next();	
				customer[x] = f + " " + l;
				// System.out.println(customer[x]);
				
				total = 0.0;
				double personalTotal = 0.0;
			
				// int count = scan.nextInt();
				
				// String [] list = new String [count];
				// double[] customerPrice = new double[cust];
				int num = scan.nextInt();
				for (int a=0; a<num; a++) {
					// int num = scan.nextInt();
					int count = scan.nextInt();
					String name = scan.next();	
					double itemPrice = findPrice(priceName, prices, name); 
					total = count * itemPrice;
					personalTotal += total;
					completeTotal += total;
					customerPrice[a] = personalTotal;
					
				
			}	
			
		}
		
			String biggestName = "Janet Weiss";
			double biggestTotal = customerPrice[0];
			
			for (int i=0; i<customerPrice.length; i++) {
				if (customerPrice[i] > (biggestTotal)) {
					biggestName = customer[i];
					biggestTotal = customerPrice[i];
					
				}
			 	// System.out.println(customer[i]);
			}
			System.out.println("Biggest: " + biggestName +  " (" + String.format("%.2f", biggestTotal) + ")");
			
		
		String smallestName = "";
		double smallestTotal = customerPrice[0];
		for (int j=0; j<customerPrice.length; j++) {
			// min = customerPrice[i];
			if (customerPrice[j] < smallestTotal) {
				smallestName = customer[j];
				smallestTotal = customerPrice[j];
			
			}
		}
		System.out.println("Smallest: " + smallestName + " (" + String.format("%.2f", smallestTotal) + ")");
		
	
		double avg = completeTotal / cust;	
		System.out.println("Average: " + String.format("%.2f", avg));
		scan.close();
	}
	public static double findPrice(String[] priceName, double[] prices, String name) {
		double price = 0.0;
		for (int i=0; i<priceName.length; i++) {
			if (name.equals(priceName[i])) {
				price = prices[i];
			}
		}
		return price;
	}
	
}
			

