import java.util.Scanner;

public class Q6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int sumOfDigits = 0, numOfDigits = 0;
		while(num > 0)
		{
			sumOfDigits += num % 10;
			numOfDigits++;
			num /= 10;
		}
		
		if(sumOfDigits == numOfDigits)
			System.out.println("It is a Superspy number");
		else
			System.out.println("It is not a Superspy number");
	}
}
