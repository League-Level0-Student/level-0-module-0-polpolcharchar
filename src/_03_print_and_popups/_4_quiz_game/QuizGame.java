package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
			
				// 3.  Use an if statement to check if their answer is correct
			String answer = JOptionPane.showInputDialog("What does 2 + 2 equal?");
				if(answer.equalsIgnoreCase("4")) {
					score += 1;
				}
				else {
					score -= 1;
				}
			String answer1 = JOptionPane.showInputDialog("What does 5 + 2 equal?");
				if(answer1.equalsIgnoreCase("7")) {
					score += 1;
				}
				else {
					score -= 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		//System.out.println(score);
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}
