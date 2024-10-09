/*
Question 15

W.A.P. to take a number as an input from the user and check if it is a Lead Number or not!
[A number is said to be a lead number if the sum of its even digits is equal to the sum of its odd digits]
*/

import java.util.Scanner;

public class Q15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sumOfOdd = 0, sumOfEven = 0;
		
		while(num > 0)
		{
			int digit = num % 10;
			
			if(digit % 2 == 0)
				sumOfEven += digit;
			else
				sumOfOdd += digit;	
			num /= 10;
		}
		
		if(sumOfOdd == sumOfEven)
			System.out.println("It is a lead number!");
		else
			System.out.println("It is not a lead number!");
	}
}
