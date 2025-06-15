import java.util.Arrays;

public class CardValidation{

	public static String cardNumber(String theNumber){
		String[] nums = new String[theNumber.length()];
 		for(int counter = 0; counter < theNumber.length(); counter++){
			nums[counter] = String.valueOf(theNumber.charAt(counter));

		}
		
		if(nums.length < 13 && nums.length > 16){
 			return "Invalid number";
		}
		else if(nums.length >= 13 && nums.length <=16){

			if(nums[0].equals("4")){
			return "Visa card";
			}
			else if(nums[0].equals("5")){
			return "Master Card";
			}
			else if(nums[0].equals("3") && nums[1].equals("7")){
			return "American Express card";
			}
			else if (nums[0].equals("6")){
			return "Discovery Card";
			}
			else{
			return "Invalid card";
			}
		}
		return "heloo";
	}
	
	public static String checkValidation(){
	String cardNumbers = cardNumber(theNumber);
	int[] cardNums = new int[theNumber.length()];
		for(int counter = 0; counter < cardNums.length; counter++){
		int eachNum = Integer.parseInt(nums[counter]);
			cardNums[counter] = eachNum;
		}


	}
	  
	public static String printCreditCart(String theNumber){

	String theCardNumber = cardNumber(theNumber);
	

	String message = """
**************************************************
**Credit Card Type:	%s
**Credit Card Number:	%s	
**Credit Card Digit Length:%d
**Credit Card Validity Status: 

**************************************************
		""".formatted(theCardNumber, theNumber, theNumber.length());
		return message;

	}
	public static void main (String[] args){
		
	String number = "3799831619690403";
	System.out.print(printCreditCart(number));
	

	}


}