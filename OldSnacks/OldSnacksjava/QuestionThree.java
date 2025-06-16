public class QuestionThree{

	public static int uniqueNumbers(int[] nums){
			int sum = 0;
			int check = 0;
		for (int count = 0; count < nums.length; count++) {
           		
			for (int counter = count; counter < nums.length; counter++){
				if (counter == nums[count]){
				check++;
                          	  sum += check++;
                		}
				
            		}	 
		}
		return sum ;

	}

	public static void main (String [] args){

		int[] numbers = {1,2,3,2,5,6};
	
		System.out.print(QuestionThree.uniqueNumbers(numbers));
	}


}