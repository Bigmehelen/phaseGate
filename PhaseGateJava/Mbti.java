import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Mbti{

	
	static List<List<String>> allQuestions = new ArrayList<>();

	public static List<List<String>> setOne(){
        	List<String> extrovertedEVsIntrovertedI = new ArrayList<>();

        	extrovertedEVsIntrovertedI.add("expand energy, enjoy groups");
        	extrovertedEVsIntrovertedI.add("conserve energy, enjoy one-on-one");
        	extrovertedEVsIntrovertedI.add("more outgoing, think out loud");
        	extrovertedEVsIntrovertedI.add("more reserved, think to yourself");
        	extrovertedEVsIntrovertedI.add("seek many tasks, public activities, interaction with others");
        	extrovertedEVsIntrovertedI.add("seek private, solitary activities with quiet to concentrate");
        	extrovertedEVsIntrovertedI.add("external, communicative, express yourself");
        	extrovertedEVsIntrovertedI.add("internal, reticent, keep to yourself");
        	extrovertedEVsIntrovertedI.add("active, initiate");
        	extrovertedEVsIntrovertedI.add("reflective, deliberate");
        	allQuestions.add(extrovertedEVsIntrovertedI);
        	return allQuestions;
    	}

	public static List<List<String>> setTwo(){        
		List<String> sensingSVsIntuitiveN = new ArrayList<>();

		sensingSVsIntuitiveN.add("interpret literally");
		sensingSVsIntuitiveN.add("look for meaning and possibilities");
		sensingSVsIntuitiveN.add("practical, realistic, experimental");
		sensingSVsIntuitiveN.add("imaginative, innovative, theoretical");
		sensingSVsIntuitiveN.add("standard, usual, conventional");
		sensingSVsIntuitiveN.add("different, novel, unique");
		sensingSVsIntuitiveN.add("focus on here-and-now");
		sensingSVsIntuitiveN.add("look to the future, global perspective, big picture");
		sensingSVsIntuitiveN.add("facts, things, what is");
		sensingSVsIntuitiveN.add("ideas, dreams, what could be, philosophical");
		allQuestions.add(sensingSVsIntuitiveN);
		return allQuestions;
	}

	public static List<List<String>> setThree(){
		List<String> thinkingTVsFeelingF = new ArrayList<>();

 		thinkingTVsFeelingF.add("logical, thinking, questioning");
		thinkingTVsFeelingF.add("empathetic, feeling, accommodating");
		thinkingTVsFeelingF.add("candid, straightforward, frank");
		thinkingTVsFeelingF.add("tactful, kind, encouraging");
		thinkingTVsFeelingF.add("firm, tend to criticize, hold the line");
		thinkingTVsFeelingF.add("gentle, tend to appreciate, conciliate");
		thinkingTVsFeelingF.add("tough-minded, just");
		thinkingTVsFeelingF.add("tender-hearted, merciful");
		thinkingTVsFeelingF.add("matter of fact, issue-oriented");
		thinkingTVsFeelingF.add("sensitive, people-oriented, compassionate");
		allQuestions.add(thinkingTVsFeelingF);
		return allQuestions;
	}

	public static List<List<String>> setFour(){
		List<String> judgingJVsPerceptionP = new ArrayList<>();
		judgingJVsPerceptionP.add("organized, orderly");
		judgingJVsPerceptionP.add("flexible, adaptable");
		judgingJVsPerceptionP.add("plan, schedule");
		judgingJVsPerceptionP.add("unplanned, spontaneous");
		judgingJVsPerceptionP.add("regulated, structured");
		judgingJVsPerceptionP.add("easy-going, live and let live");
		judgingJVsPerceptionP.add("preparation, plan ahead");
		judgingJVsPerceptionP.add("go with the flow, adapt as you go"); 
		judgingJVsPerceptionP.add("control, govern");
		judgingJVsPerceptionP.add("latitude, freedom");
		allQuestions.add(judgingJVsPerceptionP);
		return allQuestions;
	}
	
	public static void printAllQuestions(){
	int aCount = 0;
	int bCount = 0;
	Scanner scanner = new Scanner(System.in);
		for(int count = 0; count < 10; count+=2){
			for(int counter = 0; counter < allQuestions.size() ; counter++){
				List<String> currentQuestion = allQuestions.get(counter);
				System.out.print(" " + currentQuestion.get(count) + " ");
				System.out.println(" " + currentQuestion.get(count + 1) + " ");
				String answer = scanner.nextLine().toLowerCase();
				if(answer.equals("a")){
					aCount++;
				}
				else if(answer.equals("b")){
					bCount++;
				}
				else{
				break;
				
				}
			
			}
			System.out.println();
		}
		
	}		

	

	
	
}