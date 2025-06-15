import java.util.Arrays;
import java.util.Scanner;
public class MainMenstralApp{

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter last period date (dd-MM-yyyy): ");
        String lastPeriod = sc.next();
        
        System.out.print("Enter cycle length to predict next period: ");
        int cycleLength = sc.nextInt();

        System.out.println("Your next period will be " + MenstralAppTwo.tracker(lastPeriod, cycleLength));
        System.out.println(MenstralAppTwo.fertileWindow(lastPeriod, cycleLength));

        sc.nextLine(); 
        System.out.print("Enter number of recorded period dates to check regularity: ");
        int numberOfDates = sc.nextInt();
        sc.nextLine(); 

        String[] dates = new String[numberOfDates];

        for (int i = 0; i < numberOfDates; i++) {
            System.out.print("Enter date " + (i + 1) + " (dd-MM-yyyy): ");
            dates[i] = sc.nextLine();
        }

        System.out.print("Enter your average cycle length again: ");
        int avgCycleLength = sc.nextInt();

        String result = MenstralAppTwo.checkRegularOrNot(dates, avgCycleLength);
        System.out.println("Period regularity: " + result);

        
    }

}