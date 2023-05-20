package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("There was a green house. \n"
				+ " Inside the green house there was a white house. \n"
				+ "Inside the white house there was a red house. \n"
				+ "Inside the red house there were lots of babies. \n"
				+ "What is this?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("watermelon")) {
			score = score+1;
			JOptionPane.showMessageDialog(null,"You are coreect!!!!! \n"
					+ "your score is currently " +score);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else{

			JOptionPane.showMessageDialog(null, "Wrong, continue. \n"
					+ "your score is currently " +score);

		}
		// 6. Add some more riddles
		answer = JOptionPane.showInputDialog("Paul's height is six feet, \n"
				+ "he's an assistant at a butcher's shop, and wears size 9 shoes. \n"
				+ "What does he weigh?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("meat")) {
			score = score+1;
			JOptionPane.showMessageDialog(null,"Awesome, you got it! \n"
					+ "Your score is currently " +score);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else{

			JOptionPane.showMessageDialog(null, "That doesn't look right! Try again. \n"
					+ "your score is currently " +score);

		}
		answer = JOptionPane.showInputDialog("You can drop me from the tallest building and I'll be fine, \n"
				+ "but if you drop me in water I die.\n"
				+ " What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("paper")) {
			score = score+1;
			JOptionPane.showMessageDialog(null,"Nice job! \n"
					+ "your score is currently " +score);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else{

			JOptionPane.showMessageDialog(null, "something's fishy here. \n"
					+ "your score is currently " +score);

		}
		// 2. Make a pop up to show the score.
	}

}



