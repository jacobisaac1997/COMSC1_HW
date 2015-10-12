//This program has the user play a math game
//import scanner library
import java.util.Scanner;
public class Mathgame_hw {
	public static void main(String[] args) {
		//Build scanner object
		Scanner input = new Scanner(System.in);
		//Define variables
		int r;
		int points = 0;
		int userAnswer = 0;
		int cAnswer= 0;
		int random1;
		int random2;
		//The for loop creates four rounds
		for(r = 0;r < 3;r++){
		//Generate two random numbers
			random1 = (int)(Math.random() * 10);
			random2 = (int)(Math.random() * 10);
		//Check the users points for difficulty of question
			if(0 == points){
				//Prompt the user to answer said question
				System.out.println("What is the answer to " + random1 + "+" + random2 + ".");
				userAnswer = input.nextInt();
				cAnswer = random1 + random2;
			}
			if(1 == points){
				System.out.println("What is the answer to " + random1 + "-" + random2 + ".");
				userAnswer = input.nextInt();
				cAnswer = random1 - random2;
			}
			if(2 == points){
				System.out.println("What is the answer to " + random1 + "*" + random2 + ".");
				userAnswer = input.nextInt();
				cAnswer = random1 * random2;
			}
		//Check answer and give points if answer was correct
		if(userAnswer == cAnswer){
			System.out.println("That was the correct answer.");
			points ++;
		}
		//Print the users points and print correct answer if they were wrong
		if(userAnswer != cAnswer){
			System.out.println("That was not the correct answer.");
			System.out.println("The correct answer was " + cAnswer + ".");
		}
			System.out.println("You now have " + points + " point(s)");
		}
		//End the program by telling the user how many points they earned
		System.out.println("You have earned a total of " + points + " point(s).");
	}
}
