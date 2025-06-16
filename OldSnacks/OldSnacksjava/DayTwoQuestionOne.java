public class DayTwoQuestionOne{

	public static boolean numbers(String number){
		
	for(int count = 0; count <= number.length; count++){
		
		for(int counter = count; counter < number.length; counter++){
			if(count == number.charAt(counter)) {
				check++;
			}
			if (check == number.charAt(count)){
				checker++;
			}
		}
			if (count == 4) return true
			else 
			return false
	}
	

	public static void main (String [] args){
		String[] number = "1210";
		
	System.out.print(DayTwoQuestionOne.numbers(number));
		
	}
	
}