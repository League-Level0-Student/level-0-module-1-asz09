package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String anthony="Anthony is very skilled";
String nick="Nick is a frequent Back Market user. He also spends all his money on Nick Graham *trademark sign* shirts and clothing.";
String mike="Made a 15 year old YT video of him playing Guitar Hero while wearing a banana costume.";
String osvaldo="Osvaldo is a spy for Russian president Vladimir Putin. He is known to hack people's Google accounts and delete them. He is a fugitive of the San Diego Police Department and is actively being searched for. ";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input = JOptionPane.showInputDialog("Enter a name to find out something cool about the person typed.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (input.equalsIgnoreCase("osvaldo")){
	JOptionPane.showMessageDialog(null,osvaldo);
}
if (input.equalsIgnoreCase("nick")){
	JOptionPane.showMessageDialog(null,nick);
	
	if (input.equalsIgnoreCase("mike")){
		JOptionPane.showMessageDialog(null,mike);
		
		
}


}
	}
}

