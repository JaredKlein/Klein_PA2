package klein_01;

import java.util.Scanner;

public class Encrypt {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		num = in.nextInt();
		
		System.out.println("Your number is " + num);
		
		int first = (num / 1000);
		int second = num / 100 % 10;
		int third = num /10 % 10;
		int fourth = num % 10;
		
		first = (first + 7) % 10;
		second = (second + 7) % 10;
		third = (third + 7) % 10;
		fourth = (fourth + 7) % 10;
		
		int temp;
		int temp2;
		
		temp = first;
		first = third;
		third = temp;
		temp2 = second;
		second = fourth;
		fourth = temp2;
		
		
		System.out.println("It is now encrypted to " + first + "" + second + "" + third + "" + fourth);

		in.close();
		
	}

}
