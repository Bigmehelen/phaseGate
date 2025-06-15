import java.util.ArrayList;
import java.util.List;

public class StudentGrade{
	
	List<String> students = new ArrayList<>();
	public static List<String> addStudent(String studentName, String score){
		
		students.add(studentName);
		student.add(score);
		return students;
	}
	
	public static List<String> totalScore(){
    		for (int count = 0; count < students.size(); count++){
			int theScore = Integer.parseInt(student.get(count).get(1));
        		int total = total + theScore 
			String theTotal = String.valueOf(total);
			students.add(theTotal);
    		}
    		return students;
	}

	public static String averageScore(){
		for(int count = 0; count < student.size(); count++){
			if(student.get(count).get(1) < 0){
				return 0.0;
			}
			int theScore = Integer.parseInt(student.get(count).get(1));
			int total = total + theScore;
			double average = total / student.size();
			String theAverage = String.valueOf(average);
		}
		return theAverage;
	}

		

}