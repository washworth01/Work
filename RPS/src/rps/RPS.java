package rps;

import java.util.Random;
import java.util.Scanner;

public class RPS 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int playerWins = 0;
		int computerWins = 0;
		int totalTies = 0;
		
		for(int i = 0; i < 5; i++)
		{
		System.out.println("What do you want to play: 1. Rock  2. Paper  3. Scissor");
		int choice = s.nextInt();
		
		Random rand = new Random();
		int compChoice = rand.nextInt(3) +1;
		
		if(checkResults(choice, compChoice) == 1)
		{
			playerWins++;
		}
		else if(checkResults(choice, compChoice) == 2)
		{
			computerWins++;
		}
		else if(checkResults(choice, compChoice) == 0)
		{
			totalTies++;
		}
		System.out.print("Would you like to quit? 1.Yes / 2.No");
		
		int quit = s.nextInt();
		
			if(quit == 1)
			{
				i = 21;	
			}
		}
		
		System.out.println("The Player won " + playerWins + " games. The Computer won " + computerWins + " games. There were " + totalTies + " ties.");
		
		int total = playerWins + computerWins + totalTies;
		int playerPercentage = (playerWins / total)*100;
		int compPercentage = (computerWins / total)*100;
		int tiePercentage = (totalTies / total)*100;
		
		System.out.println("The Player won " + playerPercentage + "% of games. The Computer won "  + compPercentage + "% of games. The ties came to " + tiePercentage + "% of games.");
	}
	
	public static int checkResults(int player, int comp)
	{
		int outcome = 0;
		
		if (player	== 1)
		{
			System.out.println("Player picks: Rock");
		}
		else if (player == 2)
		{
			System.out.println("Player picks: Paper");
		}
		else if (player == 3)
		{
			System.out.println("Player picks: Scissors");
		}
		
		if (comp == 1)
		{
			System.out.println("Computer picks: Rock");
		}
		else if (comp == 2)
		{
			System.out.println("Computer picks: Paper");
		}
		else if (comp == 3)
		{
			System.out.println("Computer picks: Scissors");
		}
		
		if (player == 1)
		{
			if (comp == 1)
			{
				outcome = 0;
				System.out.println("It's a tie! No one wins.");
			}
			else if (comp == 2)
			{
				outcome = 2;
				System.out.println("Paper covers Rock. Computer wins!");
			}
			else if (comp == 3)
			{
				outcome = 1;
				System.out.println("Rock crushes Scissors. Player wins!");
			}
		}
		else if (player == 2)
		{
			if (comp == 1)
			{
				outcome = 1;
				System.out.println("Paper covers Rock. Player wins!");
			}
			else if (comp == 2)
			{
				outcome = 0;
				System.out.println("It's a tie! No one wins.");
			}
			else if (comp == 3)
			{
				outcome = 2;
				System.out.println("Scissors cut Paper. Computer wins!");
			}
		}
		else if (player == 3)
		{
			if (comp == 1)
			{
				outcome = 2;
				System.out.println("Rock crushes Scissors. Computer wins!");
			}
			else if (comp == 2)
			{
				outcome = 1;
				System.out.println("Scissors cut Paper. Player wins!");
			}
			else if (comp == 3)
			{
				outcome = 0;
				System.out.println("It's a tie! No one wins.");
			}
		}
		return outcome;
	}
}


