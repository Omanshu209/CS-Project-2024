/*
Question 12

W.A.P. to take a numerical input from the user and verify whether it is a Cyclo number or not!
[A Cyclo number is a number whose first digit is equal to its last digit]
*/

import java.util.Scanner;

public class Q12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt(), lastDigit = num % 10;
		
		while(num >= 10)
			num /= 10;
		
		if(lastDigit == num)
			System.out.println("It is a cyclo number!");
		
		else
			System.out.println("It is not a cyclo number!");
	}
}
