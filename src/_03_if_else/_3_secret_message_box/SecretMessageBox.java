package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		 
	
	
	// 1. Set a password in a String variable
		String passcode = "leaguePassKey";
	
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
String secmessage = JOptionPane.showInputDialog("give me a secret message, right now.");
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
String guess = JOptionPane.showInputDialog("Try and guess this passcode to continue!");
	// 4. If their guess matches the password, show them the secret message
if (guess.equals(passcode)) {
	JOptionPane.showMessageDialog(null,secmessage);
} else {
	JOptionPane.showMessageDialog(null,
			"Intruder Alert!\n"
			
			+ " Authorities are on the way. \n"
			+ "Please stay where you are. "
			
			
			+ " Please do not panic."
			+ " Once again, do not panic. For more details, call Nick Graham, \n"
			+ " at 1800-LKE-CODE (949-5033). If you have any questions or want to learn more,\n "
			+ " Call the League of Amazing Programmers at (858) 284-0481. This message is a copyright\n of the United States Government. \n Please do not recreate this message. Breaching the box\n is considered a national security threat, and the President is ready to take action.\n"
			+ "If this is an emergency, call the emergency services immediately. If you think this message \n was sent in error, or if you are a government official, \n Please report to the president immediately. ");
	
}



	// 5. If the password does not match, pop-up "INTRUDER!!" input.equals("passcode");





}
}
