import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int score=0;
		char playAgain;

		System.out.println("===== Guess The Number Game =====");
		do{
			int number = r.nextInt(100)+1;

			int guess=0;
			int attempts=0;
			int maxAttempts=10;

			System.out.println("Guess a number between 1 and 100");
			System.out.println("You have maximum 10 attempts");

			while(guess!=number && attempts<maxAttempts){
				System.out.println("Enter your guess : ");
				guess = sc.nextInt();
				attempts++;

				if(guess>number){
					System.out.println("Too HIGH!");
				}else if(guess<number){
					System.out.println("Too LOW!");
				}else{
					System.out.println("🎉Correct! you guessed it in "+attempts+" attempts.");
					score=score+(11-attempts)*10;
					break;
				}
			}
			if(guess!=number){
				System.out.println("😞 Sorry! The number was"+ number);
			}
			System.out.println("Your current score : "+score);
			System.out.println("Play again? if yes then click y or Y");
			playAgain=sc.next().charAt(0);

		}while(playAgain=='y'||playAgain=='Y');
		System.out.println("Final Score : "+score);
		System.out.println("Thanks for playing!");

		sc.close();
	}
}