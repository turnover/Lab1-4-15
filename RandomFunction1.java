import java.util.Scanner;
import java.util.Random;

public class RandomFunction1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		RandomNum compNum = new RandomNum();
		int guess;
		
		compNum.computerNum1 = 1 + (int) (Math.random()*10);
		
		System.out.println("Guess of a number between 0-10: ");
		guess= input.nextInt();
		
		if(compNum.computerNum1==guess)
		{
			System.out.println("Correct");
		}
		else if(compNum.computerNum1>guess)
		{
			System.out.println("Your guess is too low.");
		}
		else if(compNum.computerNum1<guess)
		{
			System.out.println("Your guess is too high.");
		}
		
		System.out.println("Please play again.");
		
	}

}
