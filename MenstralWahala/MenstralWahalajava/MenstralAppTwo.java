import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class MenstralAppTwo{

	public static String tracker(String currentPeriod, int cycleLength){

    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    		LocalDate currentDate = LocalDate.parse(currentPeriod, formatter);
		LocalDate nextPeriodDate = currentDate.plusDays(cycleLength);
		return nextPeriodDate.format(formatter);
	}

	public static String fertileWindow(String currentPeriod, int cycleLength){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String theTracker = tracker(currentPeriod, cycleLength);
		LocalDate periodDate = LocalDate.parse(theTracker, formatter);
		LocalDate ovulationDate = periodDate.minusDays(14);
		LocalDate fertileStart = ovulationDate.minusDays(5);
		LocalDate fertileEnd = ovulationDate.plusDays(1);

return "Ovulation Date: " + ovulationDate.format(formatter) + "\n" + "Fertile Window: " + fertileStart.format(formatter) + " to " + fertileEnd.format(formatter);

	}


	public static String checkRegularOrNot(String[] periodDates, int cycleLength){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		int[] actualCycleLengths = new int[periodDates.length - 1];
		for (int count = 1; count < periodDates.length; count++){
			LocalDate previous = LocalDate.parse(periodDates[count - 1], formatter);
			LocalDate current = LocalDate.parse(periodDates[count], formatter);
			int cycle = (int)ChronoUnit.DAYS.between(previous, current);
			actualCycleLengths[count - 1] = cycle;
        	}
			for (int counter = 0; counter < actualCycleLengths.length; counter++){
				if(Math.abs(actualCycleLengths[counter] - (cycleLength)) > 2){
				return "Irregular";
				}
			
			}
			return "Regular";
	}
	
	
}