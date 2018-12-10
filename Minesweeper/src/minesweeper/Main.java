package minesweeper;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		boolean gameOver = false;
		int selectX;
		int selectY;
		int optionSelect;
		Scanner sc = new Scanner(System.in);
		
		while (gameOver != true)
		{
			System.out.println(minesweeper.Game.grid);
			for (int i = 0; i < minesweeper.Game.grid.getSize(); i++)
			{
				for (int j = 0; j < minesweeper.Game.grid.getSize(); j++)
				{
					System.out.print(minesweeper.Game.grid.getGameGrid()[i][j].toString() + "|");
				}
					System.out.println();
			}
			
			optionSelect = sc.nextInt();
			
			if (optionSelect == 1)
			{
				selectX = sc.nextInt();
				selectY = sc.nextInt();
				
				minesweeper.Game.selectTile(selectX, selectY);
			}
			else if (optionSelect == 2)
			{
				selectX = sc.nextInt();
				selectY = sc.nextInt();
				
				minesweeper.Game.selectTile(selectX, selectY);
			}
		}
		System.out.println(minesweeper.Game.grid);
	
	}
}