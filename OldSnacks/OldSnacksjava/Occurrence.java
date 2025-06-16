public class Occurrence{

	public static int character(String word, char ch){
		int check = 0;
		word = word.toLowerCase();

		for (int count = 0; count < word.length(); count++){
			
			if (word.charAt(count) == ch)		
			check++;
		}
		return check;
	}

	public static void main (String[] args){

		String words = "Hello World";
		char ch = 'o';
		System.out.print(character(words,ch));

	}


}