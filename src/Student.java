
/**
 * COSC 210-001   Assignment 2
 * Student.java
 * 
 * This is the "Student" class which accepts information about the student
 * and returns desired information like name, total score and average score.
 * 
 * @author Nathaniel Churchill
 */
public class Student {
	//Attributes
	private String name;
	private int totalScore = 0;
	private int numberOfQuizzes = 0;
	private double averageScore = 0;

	public Student(String name) {//Parametized constructor
		super();
		this.name = name;
	}
	//Getter
	public String getName() {
		return this.name;
	}
	
	// Methods
	/**
	 * This method adds a quiz score to the total score for this student
	 * @param score a student's score for a quiz
	 */
	public void addQuiz( int score){
		this.totalScore += score;
		this.numberOfQuizzes++;
	}
	
	/**
	 * This method returns the total score for all quiz entries
	 * @return totalScore  
	 */
	public int totalScore(){
		return this.totalScore;
	}
	
	/**
	 * This method returns the average score for this student
	 * @return averageScore
	 */
	public double averageScore(){
		this.averageScore = (double) totalScore / numberOfQuizzes;
		return this.averageScore;
	}

}
