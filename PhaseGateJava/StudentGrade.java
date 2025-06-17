import java.util.Scanner;
import java.util.*;

public class StudentGrade{

	public static String[][] setDimension(String noOfStudent, String noOfSubject){
		int student = Integer.parseInt(noOfStudent);
		int subject = Integer.parseInt(noOfSubject);
		String studentAndSubject[][] = new String[student][subject];
		return studentAndSubject;
		
	}
	
	public static String[][] addScore(String[][]studentAndSubject){
		Scanner sc = new Scanner(system.in);
		for(int count = 0; count < studentAndSubject.length; count++){
			for(int counter = 0; counter < studentAndSubject[count].length; counter++){
			System.out.print("Enter score for student" + (count + 1));
			System.out.print("Enter score for subject" + (counter + 1));
			studentAndSubject[count][counter] = sc.nextLine();

			}
			System.out.print("=====Saved Succefully====");
		}
		return studentAndSubject;

	}

	
	
	public static void main (String[] args){

	Scanner scanner = new Scanner(system.in);
	System.out.print("Enter no of student: ");
	String noOfStudent =  scanner.nextLine();
	System.out.print("Enter no of subject: ");
	String noOfsubject = scanner.nextLine();
	String studentAndSubject[][] = setDimension(noOfStudent, noOfsubject);
	 studentAndSubject[][] = addScore(studentAndSubject);



	}

	
}