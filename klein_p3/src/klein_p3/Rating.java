package klein_p3;

import java.util.Scanner;

public class Rating {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[] topics = {"Games", "School", "Movies", "Food", "Politics"};
		
		int[][]ratings = new int[5][10];
		
		System.out.println("How many people?");
		int people_rating = in.nextInt();
		
		for(int i = 0; i < people_rating; i++) {
			System.out.println("Rate each topic between 1 and 10");
			for(int j = 0; j < 5; j++) {
				System.out.println("What do you rate " + topics[j]);
				int rating = in.nextInt();
				ratings[j][rating - 1]++;
			}
		}
		for(int i = 0; i<5; i++)
		{
		    for(int j = 0; j<10; j++)
		    {
		        System.out.print(ratings[i][j]);
		    }
		    System.out.println();
		}
		
		in.close();
	}

}
