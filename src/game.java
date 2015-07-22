import java.util.Random;
import java.util.Scanner;

public class game { //Class Name
	public static void main(String[] args) { //Main Method
		 
		Random randomGenerator = new Random(); //Making object of Java's Random Class
		int secretNumber = randomGenerator.nextInt(10); //Assign random number (0-9)
		 
		if (secretNumber == 0) { //assign number as 1 if 0 is generated
		    secretNumber = 1;
		}
		 
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String playerName = inputScanner.nextLine(); //ask player's name
		 
		System.out.print("Welcome "+playerName+", Please Enter your guess (1-9) : ");
		int playerGuess = inputScanner.nextInt(); // ask player's guess
		 
		//show the number guessed by the computer
		System.out.println("Computer guessed the number "+secretNumber);
		 
		//check if the guess is right or wrong
		if (secretNumber==playerGuess) {
		   System.out.println("Such Guess, Much talent, Wow");
		 }else{
		   System.out.println("HaHahahahahahaha, You Have No Power here !!");
		  }
		   inputScanner.close();
		 }
		}