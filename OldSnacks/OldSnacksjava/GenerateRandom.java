import java.util.Random;
import java.util.Scanner;

public class GenerateRandom{

	public static void main(String[] args){

	Random myRandom = new Random();
	Scanner sc = new Scanner(System.in);

	int check = 0;
	int result = 0;
	int correct = 0;
	for(int count = 1; count <= 10; count++){

		int randomGuess = myRandom.nextInt(10);
		int randomGuessTwo = myRandom.nextInt(10);

		if(randomGuess > randomGuessTwo){
		System.out.printf("%d - %d%n", randomGuess, randomGuessTwo);	

			System.out.print("Enter guess: ");
			int input = sc.nextInt(); 
			result = randomGuess - randomGuessTwo;
			check++;
			
			if(input == result && check == 2 ){
				System.out.print("correct guess");
				correct++;
			}			
			else if(input < result || input > result && check == 2){
				System.out.print(" Try again ");
			}
		}
		
	}
	System.out.printf(" Your result is %d%n" , correct);

}

}