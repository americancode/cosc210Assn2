import java.util.*;
/**
 * COSC 210-001   Assignment 2
 * Prog2.java
 * 
 * This program accept scores from a user until a negative number is
 * entered after this the program prints the student's name, total
 * score, and average score
 * 
 * @author Nathaniel Churchill
 */
public class Prog2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a student's name: ");
		Student studentOne = new Student(input.nextLine());
		
		System.out.print("Please enter the student's quiz grades or a neagtive "
				+ "number to quit: ");
		int temporaryScore = input.nextInt();// initialize the loop
		//Sentinel controlled loop
		while (temporaryScore >= 0) {
			studentOne.addQuiz(temporaryScore);
			System.out.print("Please enter the student's quiz grades or a neagtive "
					+ "number to quit: ");
			temporaryScore = input.nextInt();
		}
		
		//output
		System.out.println("\n");
		System.out.printf("The student's name is: %s\n", studentOne.getName());
		System.out.printf("The total quiz score for this student is: %d\n", studentOne.totalScore());
		System.out.printf("The average score for this student is: %.2f", studentOne.averageScore());
	}

}
