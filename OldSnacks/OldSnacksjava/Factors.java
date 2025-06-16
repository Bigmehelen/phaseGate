public class Factors{

	public static int number(int numbers){
		int count = 0;
		for (int count = 1 ; count < numbers; count ++){
			if (numbers % count == 0 ){
				count++;
			}
		}
		int[] factors = new int[count];
		int check = 0;
		for(int counter = 1; counter <= numbers; counter++){
			if(numbers % counter == 0){
				factors[check] = counter
				check++
			}
		
		}
		return factors;
	}
	
	public static void main (String[] args){

		int[] nums = {8};
		System.out.print(Factors.number(nums));

	}

}