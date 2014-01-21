package controller;

import model.TShirt;

public class Controller
{

	int[][] myInts = new int [5][3];
	String[][] myStrings = new String[4][4];
	TShirt[][] myShirts = new TShirt[6][4];
	
	
	
	public void start() 
	{
		fillInts();
		fillShirts();
		fillStrings();
		
		changeInts();
		changeShirts();
	}
	
	
	private void fillInts()
	{
		for(int row = 0; row < myInts.length; row++)
		{
			for(int col = 0; col < myInts[0].length; col++)
			{
				myInts[row][col] = row + 4 * 3 + col;
				
			}
		}
	}
	
	private void changeInts()
	{
		for(int row = 0; row < myInts.length; row++)
		{
			for(int col = 0; col < myInts[0].length; col++)
			{
				myInts[row][col] = row + 4 + col;
				
			}
		}
	}
	
	private void fillShirts()
	{
		String color = "purple";
		for(int row = 0; row < myShirts.length; row++)
		{
			for(int col = 0; col < myShirts[0].length; col++)
			{
				myShirts[row][col] = new TShirt(color);
			}
		}
	}
	
	private void changeShirts()
	{
		String color = "purple";
		for(int row = 0; row < myShirts.length; row++)
		{
			for(int col = 0; col < myShirts[0].length; col++)
			{
				color = "purple";
				if (col == 2)
				{
					color = "red";
					
				}
				myShirts[row][col] = new TShirt(color);
			}
		}
	}
	
	private void fillStrings()
	{
		myStrings[0][0] = "Aatrox";
		myStrings[0][1] = "Ahri";
		myStrings[0][2] = "Akali";
		myStrings[0][3] = "Alistar";
		myStrings[1][0] = "Amumu";
		myStrings[1][1] = "Anivia";
		myStrings[1][2] = "Annie";
		myStrings[1][3] = "Ashe";
		myStrings[2][0] = "Blitzcrank";
		myStrings[2][1] = "Brand";
		myStrings[2][2] = "Caitlyn";
		myStrings[2][3] = "Cassiopeia";
		myStrings[3][0] = "Cho'Gath";
		myStrings[3][1] = "Corki";
		myStrings[3][2] = "Darius";
		myStrings[3][3] = "Diana";
	}
}
