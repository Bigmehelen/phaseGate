import java.util.*;

public class StudentGrade{
	
	static List<List<String>> studentRecords = new ArrayList<>();

	public static List<List<String>> addStudent(String studentName, String subjectOne, String subjectTwo, String subjectThree){
		List<String> students = new ArrayList<>();
		students.add(studentName);
		students.add(subjectOne);
		students.add(subjectTwo);
		students.add(subjectThree);
		studentRecords.add(students);
		return studentRecords;
	}
	
	public static List<List<String>> totalScore(){
    		for (int count = 0; count < studentRecords.size(); count++){
			int theSubOne = Integer.parseInt(studentRecords.get(count).get(1));
			int theSubTwo = Integer.parseInt(studentRecords.get(count).get(2));
			int theSubThree = Integer.parseInt(studentRecords.get(count).get(3));
        		int total = theSubOne + theSubTwo + theSubThree;
			String theTotal = String.valueOf(total);
			studentRecords.get(count).add(theTotal);
    		}
    		return studentRecords;
	}

	public static List<List<String>> averageScore(){
		for(int count = 0; count < studentRecords.size(); count++){
			int theSubOne = Integer.parseInt(studentRecords.get(count).get(1));
			int theSubTwo = Integer.parseInt(studentRecords.get(count).get(2));
			int theSubThree = Integer.parseInt(studentRecords.get(count).get(3));
        		int total = theSubOne + theSubTwo + theSubThree;
			double average = total / studentRecords.size();
			String theAverage = String.valueOf(average);
			studentRecords.get(count).add(theAverage);
		}
		return studentRecords;
	}

	public static String printList(){
		StringBuilder builder = new StringBuilder();
		for(int count = 0; count < studentRecords.size(); count++){
			for(int counter = 0; counter < studentRecords.get(count).size(); counter++){
				builder.append(studentRecords.get(count).get(counter)).append("\t");
			}
			builder.append("\n");
		}
		return builder.toString();
	}


	public static String printStudents(){
		String thePrintList = printList();
		
		String message = """
============================================================
STUDENT		SUB1	SUB2	SUB3	TOT	AVE	POS
============================================================
%s

============================================================
============================================================
			""".formatted(thePrintList);
	return message;
	}


	public static void main (String[] args){
		addStudent("Student 1", "67", "21", "49");
		addStudent("Student 2", "98", "62", "52");
		addStudent("Student 3", "93", "34", "27");
		addStudent("Student 4", "78", "83", "66");
		totalScore();
		averageScore();
		System.out.print(printStudents());


	}	

}