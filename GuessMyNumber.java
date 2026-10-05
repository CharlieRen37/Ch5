import java.util.Scanner;
import java.util.Random;



public class GuessMyNumber{
	public static void main(String[] args){
		// pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
		Scanner in = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		int guess = in.nextInt();
		System.out.println("Your guess is: " + guess);
	}
	public static String answer(int n,int x){
		if(n>x){
			return "Answer Too High";
			return "Take Another Guess";
		}else if (n<x){
			System.out.println("Answer Too Low");
		}
	}
}
