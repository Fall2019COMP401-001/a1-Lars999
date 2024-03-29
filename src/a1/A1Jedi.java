package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numOfItems = scan.nextInt();
		ArrayList<String> nameOfItem = new ArrayList<String>();
		int[] customerCount = new int[numOfItems];
		int[] itemCount = new int[numOfItems];
		double[] priceOfItem = new double[numOfItems];
		for (int i=0; i < numOfItems; i++) {
			nameOfItem.add(scan.next());
			priceOfItem[i] = scan.nextDouble();
			customerCount[i] = 0;
		}
		int numOfCust = scan.nextInt();
		int[] numOfCustomers = new int[numOfCust];
		
		String[] nameOfCustomers = new String[numOfItems];
		boolean[] repeatItems = new boolean[numOfItems];
		for (int i=0; i < numOfCustomers.length; i++) {
			for (int y = 0; y < numOfItems; y++) {
				repeatItems[y] = false;
			}
			String first = scan.next();
			String last = scan.next();
			nameOfCustomers[i] = first + " " + last;
			int custItemNumber = scan.nextInt();
			for (int x = 0; x < custItemNumber; x++) {
				int custNumOfItems = scan.nextInt();
				String custNameOfItem = scan.next();
				int indexPos = nameOfItem.indexOf(custNameOfItem);
				if (repeatItems[indexPos] == false) {
					repeatItems[indexPos] = true;
					customerCount[indexPos] += 1;
					itemCount[indexPos] += custNumOfItems;
				} else {
					itemCount[indexPos] += custNumOfItems;
				}
			}
		}

		for (int i=0; i<itemCount.length; i++) {
			if (itemCount[i] == 0) {
				System.out.println("No customers bought " + nameOfItem.get(i));					
			} else {
			System.out.println(customerCount[i] + " customers bought " + itemCount[i] + " " + nameOfItem.get(i));
			}
		}
		
	}
}
