public class UniqueNumbers{

	public static int number(int[] nums){
			int sum = 0;
		for (int count = 0; count < nums.length; count++) {
           		int check = 0;
			for (int counter = 0; counter < nums.length; counter++) {
				if (counter == nums[count]){
				check++;
                          	 sum = sum + check;       
                		}
            		}
		}
		return sum ;
	}

	public static void main (String [] args){

		int[] numbers = {1,2,3,2,8,6,3};
	
		System.out.print(number(numbers));
	}


}