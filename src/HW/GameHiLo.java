package HW;

/**************************************************************************
 * Author: Greys Espinoza
 * Date created: 02/27/20
 * Homework 2
 **************************************************************************
 * This is a program that plays the Hi-Lo guessing game with numbers. Users 
 * have to guess the number. The program will count how many times they 
 * tried and if they want to play again after they guess the number.  
 * ************************************************************************
 */
import java.util.Scanner;
public class GameHiLo {

	 public static void main(String[] args) {
	 //Initializing scanner
     Scanner scan = new Scanner(System.in);
	 String playAgain = "";
	 do {
		 
	 // Assigning the number 55 and setting up the variables .
	 int Number = 55;
	 int guess = 0;
	 int Numbersoftries=0;
	 
	 //Loop until the user has guessed the number.
	 
	 while (guess != Number) {
	 System.out.println("Guess a number between 1 and 100:");
	 
	   // Use Scanner for getting input from user.
	   guess = scan.nextInt();
	 
	   // Counting the number of tries.
	   Numbersoftries++;
	 
	   if (guess < Number) {
	    System.out.println(guess + " is too low. Try again.");}
	 
	   else if (guess > Number) {
	    System.out.println(guess + " is too high. Try again.");}
	 
	   else {
	    System.out.println(guess + " is correct. You win!");
	    System.out.println("The number that you tried are : "+Numbersoftries);}
	
	         } // End of while loop for guessing
	 
	 //Asking to the user if they want to play again or no.
	 System.out.println("Would you like to play again (y/n)?");
	 playAgain = scan.next();
	 } 
	 while(playAgain.equalsIgnoreCase("y"));
	 System.out.println("Thank you for playing! Goodbye.");
	 scan.close();
	 }
	}


