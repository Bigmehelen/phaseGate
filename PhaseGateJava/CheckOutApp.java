import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Date;
public class CheckOutApp{
	
	private static List<List<String>> cartItems = new ArrayList<>();

	public static String printHeader(String name){
	LocalDate todayDate = LocalDate.now();
	Date today = new Date();
	String message = """
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 08088406240
Date: %s   %tT
Cashier: Heaven
Customer Name: %s

========================================================
		ITEMS	QTY	PRICE	TOTAL(NGN)
--------------------------------------------------------
	""".formatted(todayDate,today,name);
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
			for(int counter = 0; counter < cartItem.get(counter).size(); counter++){
			int theQuantity = Integer.parseInt(cartItems.get(1));
			double thePrice = Double.parseDouble(cartItems.get(2));
			double total = theQuantity * thePrice;
			String allTotal = String.valueOf(total);
			cartItems.add(allTotal);
			}
		}
		return cartItems;
	}

	/*public static String subTotal(){
		double total = 0;
		for(int count = 0; count < cartItems.size(); count++){
			for(int counter = 0; counter < cartItem.get(counter).size(); counter++){
				int theQuantity = Integer.parseInt(quantity);
				double thePrice = Double.parseDouble(price);
				double total = theQuantity * thePrice;
			}
			double allTotal = allTotal + total;
			String subTotal = String.valueOf(allTotal);
		}
		return subTotal;

	}

	public static String itemDiscount(String discount){
		
		double theDiscount = Double.parseDouble(discount/100);
		double allDiscount = theDiscount * subTotal();
		String discounts = String.valueOf(allDiscount);
		return discounts;
	}
	Final double vat = 0.175;
	public static String itemVat(){
		double theVat = vat * subTotal();
		String allVat = string.valueOf(theVat);
		return allVat;
	}
	
	public static String billTotal(){
		double subTotal = Double.parseDouble(subTotal()); 
		double discount = Double.parseDouble(itemDiscount(discount);
		double theBillTotal = subTotal() + vat() - discount;
		String allBillTotal = String.valueOf(theBillTotal);
		return allBillTotal;
	}

	public static String paymentMade(String payment){
		double itemPayment = Double.parseDouble(payment);
		double allPayment = itemPayment - billTotal();
		String thePayment = String.valueOf(allPayment)
		return thePayment;

	}*/

	public static void main (String[] args){
		String customer = "Helen";
		System.out.print(printHeader(customer));

		String item = "corn";
		String quantity = "2";
		String price = "300";
		System.out.print(total());

		

		}

}