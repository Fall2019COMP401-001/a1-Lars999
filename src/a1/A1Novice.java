package a1;


import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int num = scan.nextInt();
		String[] arr = new String[num];
		// String correct = "";
		// Double total = 0.0;
		
		for (int i=0; i<arr.length; i++) {
			String f = scan.next();
			String l = scan.next();
			char firstInitial = f.charAt(0);
			int shop = scan.nextInt();
			String[] item = new String[shop];
			Double total = 0.00;
			for (int a=0; a<item.length; a++) {
				int itemNumber = scan.nextInt();
				String name = scan.next();
				Double price = 0.00;
				price = scan.nextDouble();
				total += price * itemNumber;
				
				
				
				
				
				
			
				 
			
		}
			
			String conversion = String.format("%.2f", total);
			 System.out.println(firstInitial + ". " + l + ": " + conversion);
			 
			 
		
			
		
		
		}	
		
		
	}
}
