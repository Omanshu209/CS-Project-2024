import java.util.Scanner;

public class Q7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[4][4];
		
		System.out.println("Enter the elements : ");
		for(int i = 0 ; i < 4 ; i++)
			for(int j = 0 ; j < 4 ; j++)
				mat[i][j] = sc.nextInt();
		
		for(int i = 0 ; i < 4 ; i ++)
		{
			int sum = 0;
			for(int j = 0 ; j < 4 ; j++)
				sum += mat[i][j];
			System.out.println("Sum of row " + (i + 1) + " = " + sum);
		}
	}
}
