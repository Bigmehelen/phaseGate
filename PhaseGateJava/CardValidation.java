import java.util.Arrays;

public class CardValidation{

	public static String cardNumber(String[] theNumber){
		int[] cardNums = new int[theNumber.length];
		for(int counter = 0; counter < cardNums.length; counter++){
			int eachNum = Integer.parseInt(theNumber[counter]);
			cardNums[counter] = eachNum;
		}
		
		if(cardNums.length < 13 && cardNums.length > 16){
 			return "Invalid number";
		}
		else if(cardNums.length >= 13 && cardNums.length <=16){

			if(cardNums[0] == 4){
			return "Visa card";
			}
			else if(cardNums[0] == 5){
			return "Master Card";
			}
			else if(cardNums[0] == 3 && cardNums[1] == 7){
			return "American Express card";
			}
			else if (cardNums[0] == 6){
			return "Discovery Card";
			}
			else{
			return "Invalid card";
			}
		}
		return "heloo";
	}

	public static String printCreditCart(String[] theNumber){

	String theCardNumber = cardNumber(theNumber);

	String message = """
**************************************************
**Credit Card Type:	%s
**Credit Card Number:		
**Credit Card Digit Length:
**Credit Card Validity Status: 

**************************************************
		""".formatted(theCardNumber);
		return message;

	}
	public static void main (String[] args){
		
String[] number = {"3","7","9","9","8","3","1","6","1","9","6","9","0","4","0","3"};
		System.out.print(printCreditCart(number));

	}


}