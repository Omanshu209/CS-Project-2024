/*
Question 13

W.A.P to take a character as input from the user and determine whether it is a capital letter, small case letter, digit or a special symbol using its ASCII value
*/

import java.util.Scanner;

public class Q13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character : ");
		char character = sc.next().charAt(0);
		
		int ASCII = (int) character;
		
		if(ASCII >= 65 && ASCII <= 90)
			System.out.println(character + " is a capital letter");
		
		else if(ASCII >= 97 && ASCII <= 122)
			System.out.println(character + " is a small case letter");
		
		else if(ASCII >= 48 && ASCII <= 57)
			System.out.println(character + " is a number(digit)");
		
		else
			System.out.println(character + " is a special symbol");
	}
}
