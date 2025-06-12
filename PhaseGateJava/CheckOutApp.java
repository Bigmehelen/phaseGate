import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Date;
public class CheckOutApp{
	
	static List<List<String>> cartItems = new ArrayList<>();

	public static String printHeader(String cashierName , String name){
	LocalDate todayDate = LocalDate.now();
	Date today = new Date();
	String message = """
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 08088406240
Date: %s   %tT
Cashier: %s
Customer Name: %s

========================================================
	ITEMS	QTY	PRICE	TOTAL(NGN)
--------------------------------------------------------
	""".formatted(todayDate,today,cashierName,name);
	return message;
	}

	public static List<List<String>> addItems(String item , String quantity, String price){
		List<String> items = new ArrayList<>();
		items.add(item);
		items.add(quantity);
		items.add(price);
		cartItems.add(items);
		return cartItems;
	}

	public static List<List<String>> total(){
		for(int count = 0; count < cartItems.size(); count++){
		if(cartItems.size() < 4){
			int theQuantity = Integer.parseInt(cartItems.get(count).get(1));
			double thePrice = Double.parseDouble(cartItems.get(count).get(2));
			double total = theQuantity * thePrice;
			String allTotal = String.valueOf(total);
			cartItems.get(count).add(allTotal);
			}
		}
		return cartItems;
	}

	public static void printTotal(){
	List<List<String>> cartnewItems = total();
	for(int count = 0; count < cartnewItems.size(); count++){
		for(int counter = 0; counter < cartnewItems.get(count).size(); counter++){
			System.out.print("\t" + cartnewItems.get(count).get(counter));
		}
		System.out.println();
	}

	}

	public static String theSubTotal(){
		double total = 0;
		String subTotal = "";
		double allTotal = 0;;
		for(int count = 0; count < cartItems.size(); count++){
			for(int counter = 0; counter < cartItems.get(count).size(); counter++){
				int theQuantity = Integer.parseInt(cartItems.get(count).get(1));
				double thePrice = Double.parseDouble(cartItems.get(count).get(2));
				total = theQuantity * thePrice;
			}
			 allTotal = allTotal + total;
			subTotal = String.valueOf(allTotal);
		}
		return subTotal;

	}

	public static String itemDiscount(String discounts){
		double theDiscount = Double.parseDouble(discounts); 
		double itemSubTotal = Double.parseDouble(theSubTotal());
		double allDiscount = (theDiscount / 100) * itemSubTotal;
		String discount = String.valueOf(allDiscount);
		return discount;
	}

	static double vat = 0.175;
	public static String itemVat(){
		double theVat = Double.parseDouble(theSubTotal());
		double vats = theVat * vat;
		String allVat = String.format("%.2f",vats);
		return allVat;
	}

	public static String billTotal(String discount){
		double subTotal = Double.parseDouble(theSubTotal()); 
		double theDiscount = Double.parseDouble(itemDiscount(discount));
		double value = Double.parseDouble(itemVat());
		double theBillTotal = subTotal + value - theDiscount;
		String allBillTotal = String.valueOf(theBillTotal);
		return allBillTotal;
	}
	public static String printDiscount(String discount){
		String itemSubTotal = theSubTotal();
		String discounts = itemDiscount(discount);
		String vatValue = itemVat();
		String billTotal = billTotal(discount);
		String message = """
---------------------------------------------------------
	Sub Total : 	%s 
	Discount :	%s

	Vat @ 17.50 :	%s
=========================================================
	Bill Total:  	%s
=========================================================
THIS IS NOT A RECEIPT KINDLY PAY 	%s

			""".formatted(itemSubTotal, discounts, vatValue,billTotal,billTotal);
	return message;
	}
	
	public static String amount(String costPaid){
		double theCostPaid = Double.parseDouble(costPaid);
		String valueCostPaid = String.valueOf(theCostPaid);
		return valueCostPaid;
	}

	public static String balance(String bill , String cost){
		double theBillTotal = Double.parseDouble(billTotal(bill));
		double theAmount = Double.parseDouble(amount(cost));
		double paymentValue = theAmount - theBillTotal;
		double payment = Math.abs(paymentValue);
		String thePayment = String.format("%.2f", payment);
		return thePayment;

	}

	public static String printBillTotal(String bill, String costPaid){
		String bills = billTotal(bill);
		String theAmount = amount(costPaid);
		String theBalance = balance(bill,costPaid);                
		String message = """

	Bill Total : 	%s
	Amount paid:	%s
	Balance: 	%s

==========================================================
	THANK YOU FOR YOUR PATRONAGE
==========================================================
		""".formatted(bills, theAmount, theBalance);
		return message;
	}
	public static void printFirstBill(String cashierName, String name, String discount ){
		System.out.println(printHeader(cashierName , name));
		printTotal();
		System.out.println(printDiscount(discount));
	}
	
	public static void printFinalBill(String cashierName, String name, String amount, String balance ){
		printHeader(cashierName , name);
		System.out.print(printBillTotal(balance ,amount));
	}
		

}