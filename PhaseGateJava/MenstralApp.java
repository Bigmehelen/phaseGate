import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class MenstralApp{
	
	public static String tracker(String previousPeriod, String nextPeriod) {
    		int start = Integer.parseInt(previousPeriod);
    		int end = Integer.parseInt(nextPeriod);
    		int length = start - end;
    		int result = Math.abs(length); 
    		return String.valueOf(result);
	}


	public static String fertileWindow(String nextPeriod){
		int ovulation = Integer.parseInt(nextPeriod);
		int daysOfOvulation = ovulation - 14;
		int lengthofOvulation = 5 - daysOfOvulation;
		int result = Math.abs(lengthofOvulation);
		return String.valueOf(result);
	}

	

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter previous menstral day and current menstral day to know your menstral cycle: ");
		String previous = sc.next();
		String next = sc.next();
		System.out.print("Your have " + tracker(previous, next) + " days cycle");
		System.out.println();

		System.out.print("Enter your menstral cycle to Know your ovulation days: ");
		String nextPeriod = sc.next();
		System.out.print("Your ovulation window starts on " + fertileWindow(nextPeriod) + " and last for seven days\n You can concieve these days");
		System.out.print("Safe days are days that are not in ovulation days");
		System.out.println();


	}
		

}