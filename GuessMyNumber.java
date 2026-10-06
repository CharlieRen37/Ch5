import java.util.Scanner;
import java.util.Random;



public class GuessMyNumber{
	public static void main(String[] args){
		// pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
		Scanner in = new Scanner(System.in);
		int life=3;
		System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		int guess = in.nextInt();	
		//String ans = answer(guess,number,life);
		//System.out.println(ans);
		//if (ans.equals("You Got It RIGHT!!!!!!")) {
		//	return;
		//}
		answer(guess,number,life);
		life=answer(guess,number,life);
		if(life==3){
			return;
		}
		guess = in.nextInt();	
		answer(guess,number,life);
		life=answer(guess,number,life);
		if(life==2){
			return;
		}
		guess = in.nextInt();	
		answer(guess,number,life);
		life=answer(guess,number,life);
		return;
	}
	public static int answer(int n,int x,int a){
		System.out.println("Your guess is: " + n);
		if(a>1){
			if(n>x){
				System.out.println("Answer Too High, Take Another Guess: ");
				return a-1;
			}else if (n<x){
				System.out.println("Answer Too Low, Take Another Guess: ");
				return a-1;
			}else{
				System.out.println("You Got It RIGHT!!!!!!");
			}
		}else{
			if(n!=x){
				System.out.println("Answer Incorrect, You Ran Out of Tries. The number was "+x);
			}else {
				System.out.println("You Got It RIGHT!!!!!!");
			}
		}
	}
}
