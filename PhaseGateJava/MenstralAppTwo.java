import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.ArrayList;

public class MenstralAppTwo{
		public static String tracker(String previousPeriod, String currentPeriod) {
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    		LocalDate previousDate = LocalDate.parse(previousPeriod, formatter);
		LocalDate currentDate = LocalDate.parse(currentPeriod, formatter);

		long length = ChronoUnit.DAYS.between(previousDate , currentDate );
		return String.valueOf(length);
	}


	public static String expectingNextPeriod(String lastPeriod , int cycleLength){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate lastStart = LocalDate.parse(lastPeriod, formatter);

		LocalDate theLength = lastStart.plusDays(cycleLength);

		return theLength.format(formatter);

	}


	public static String checkRegularOrNot(String[] periodDates, int cycleLength){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		ArrayList<Integer> actualCycleLengths = new ArrayList<>();

		for (int i = 1; i < periodDates.length; i++) {
		LocalDate previous = LocalDate.parse(periodDates[i - 1], formatter);
		LocalDate current = LocalDate.parse(periodDates[i], formatter);
		int cycle = (int) ChronoUnit.DAYS.between(previous, current);
		actualCycleLengths.add(cycle);
        	}

		for (int cycle : actualCycleLengths) {
			if (Math.abs(cycle - cycleLength) > 2) {
			return "Irregular";
			}
		}
		return "Regular";
	}

	 public static String fertileWindow(String startDate, int cycleLength) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
		LocalDate lastPeriodStartDate = LocalDate.parse(startDate, formatter);

		LocalDate ovulationDate = lastPeriodStartDate.plusDays(cycleLength - 14);

		LocalDate fertileStart = ovulationDate.minusDays(5);
		LocalDate fertileEnd = ovulationDate.plusDays(1);

		return "Ovulation Date: " + ovulationDate.format(formatter) + "\n" + "Fertile Window: " + fertileStart.format(formatter) + " to " + fertileEnd.format(formatter);

	}

	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter previous menstral day and current menstral day dd-MM-yyyy to know periodcycle: ");
		String previous = sc.next();
		String next = sc.next();
		System.out.print("Your have a " + tracker(previous, next) + " day cycle");
		System.out.println();

		System.out.print("Enter last period dd-MM-yyyy and cycle length to predit next period: ");
		String lastPeriod = sc.next();
		int cycleLength = sc.nextInt();
		System.out.print("Your next period is on " + expectingNextPeriod(lastPeriod , cycleLength));

		System.out.println();

		System.out.print("Enter number of period dates to check regularity: ");
		int numDates = sc.nextInt();
        	sc.nextLine(); 

       		 String[] dates = new String[numDates];
        	 System.out.println("Enter " + numDates + " period dates (dd-MM-yyyy):");
        	 for (int i = 0; i < numDates; i++) {
           	 dates[i] = sc.nextLine();
       		 }

        	String result = checkRegularOrNot(dates, cycleLength);
        	System.out.println("Period regularity: " + result);

		System.out.println();

		System.out.print("Enter start date dd-MM-yyyy : ");
		String startDay = sc.next();
		System.out.print("Enter cycle length: ");
		int noOfDays = sc.nextInt();

		String results = fertileWindow(startDay, noOfDays);
		System.out.println(results);

	}
		

}