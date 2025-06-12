import java.util.ArrayList;
import java.util.List;
import java. util.Scanner;
public class MainCheckOutApp{

	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	String cashierName = null;
	String discount = "0";
	String balance = "0";
	System.out.print("What is the customer's Name: ");
		String customer = sc.nextLine();
		
	System.out.print("What did the user buy: ");
		String items = sc.nextLine();
			
	System.out.print("How many pieces: ");	
		String quantity = sc.nextLine();

	System.out.print("How much per unit: ");
	String price = sc.nextLine();
	CheckOutApp.addItems(items,quantity,price);
	CheckOutApp.printFirstBill(cashierName , customer, discount);

 		boolean userInput = true;
		while (userInput){
		System.out.print("Add more items? ");
		String add = sc.nextLine().toLowerCase();
			switch (add){
			case "yes"-> {
				System.out.print("What did the user buy: ");
					items = sc.nextLine();
				System.out.print("How many pieces: ");	
					quantity = sc.nextLine();
				System.out.print("How much per unit: ");	
					price = sc.nextLine();
				CheckOutApp.addItems(items,quantity,price);
				continue;
				}

			case "no"-> {
				System.out.print("What is your name: ");
					 cashierName = sc.nextLine();
				System.out.print("How many discount: ");
					discount = sc.nextLine();
					CheckOutApp.printFirstBill(cashierName , customer, discount);
				System.out.print("How much did the customer give you? ");
				String amountPaid = sc.nextLine();
				CheckOutApp.printFinalBill(cashierName , customer, amountPaid,balance);
				}
		
			}
			userInput = false;
		}
	

	}

}