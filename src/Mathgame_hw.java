//This program has the user play a math game
//import scanner library
import java.util.Scanner;
public class Mathgame_hw {
	public static void main(String[] args) {
		//Build scanner object
		//Define variables
		int r;
		int points = 0;
		int userAnswer;
		int cAnswer;
		int random1;
		int random2;
		//The for loop creates four rounds
		for(r = 1;r > 5;r++){
		//Generate two random numbers
			random1 = (int)(Math.random() * 10);
			random2 = (int)(Math.random() * 10);
		//Check the users points for difficulty of question
			if(points == 0){
				//Prompt the user to answer said question
				System.out.println("What is the answer to " + random1 + random2 + ".");
			}
		//Check answer and give points if answer was correct
		//Print the users points and if print correct answer if they were wrong
		}
		//End the program by telling the user how many points they earned
	}
}
