import java.util.Scanner;

public class Q2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[4][4];
		
		System.out.println("Enter elements : ");
		for(int i = 0 ; i < 4 ; i++)
			for(int j = 0 ; j <4 ; j++)
				mat[i][j] = sc.nextInt();
		
		int left = 0, right = 0;
		for(int i = 0 ; i < 4 ; i++)
		{
			left += mat[i][i];
			right += mat[i][3 - i];
		}
		
		System.out.println("Sum of left diagonal = " + left);
		System.out.println("Sum of right diagonal = " + right);
	}
}
