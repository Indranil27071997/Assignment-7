package Assignment7;

import java.util.Scanner;

public class TestScoreAnalyzer {
public static void main(String[] args) {
		
		ScoreAnalyzer obj =new ScoreAnalyzer();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of Batsmen");
		int number = scan.nextInt();
		
	
		for (int i=0;i<number;i++)
		{
			System.out.println("Enter the Runs Scored by Batsmen: "+(i+1));
			obj.addRunsToList(scan.nextInt());
		}
		obj.displayRuns();
		System.out.println("Run Rate :"+obj.calcRunRate());
		System.out.println("Lowest Run :"+obj.lowestRunsScored());
		System.out.println("The no of players who bat :"+number);
		scan.close();
			

	}

}