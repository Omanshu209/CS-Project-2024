import java.util.Scanner;

public class Q30
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[3][3];
		
		System.out.println("Enter the elements : ");
		for(int i = 0 ; i < 3 ; i++)
			for(int j = 0 ; j < 3 ; j++)
				mat[i][j] = sc.nextInt();
		
		int sumOfEven = 0, prodOfOdd = 1;
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				int num = mat[i][j];
				
				if(num % 2 == 0)
					sumOfEven += num;
				else
					prodOfOdd *= num;
			}
		}
		
		System.out.println("Sum of Even Nos. = " + sumOfEven);
		System.out.println("Product of Odd Nos. = " + prodOfOdd);
	}
}
