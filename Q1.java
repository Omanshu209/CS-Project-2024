/*
Question 1

WAP to cross multiply two matrices
*/

import java.util.Scanner;

public class Q1
{
	public int[][] mul_matrix(int[][] mat1, int[][] mat2)
	{
		int[][] product = new int[mat1.length][mat2[0].length];
		
		for(int i = 0 ; i < mat1.length ; i++)
		{
			for(int j = 0 ; j < mat2[0].length ; j++)
			{
				int val = 0;
				
				for(int k = 0 ; k < mat2.length ; k++)
					val += mat1[i][k] * mat2[k][j];
				
				product[i][j] = val;
			}
		}
		
		return product;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of rows and columns in the first matrix :");
		int rows1 = sc.nextInt();
		int columns1 = sc.nextInt();
		
		int[][] matrix1 = new int[rows1][columns1];
		for(int i = 0 ; i < rows1 ; i++)
		{
			for(int j = 0 ; j < columns1 ; j++)
			{
				System.out.print("Enter element : ");
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the no. of rows and columns in the second matrix :");
		int rows2 = sc.nextInt();
		int columns2 = sc.nextInt();
		
		int[][] matrix2 = new int[rows2][columns2];
		for(int i = 0 ; i < rows2 ; i++)
		{
			for(int j = 0 ; j < columns2 ; j++)
			{
				System.out.print("Enter element : ");
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		Q1 obj = new Q1();
		int[][] product = obj.mul_matrix(matrix1, matrix2);
		
		System.out.println("Product : ");
		for(int i = 0 ; i < product.length ; i++)
		{
			for(int j = 0 ; j < product[0].length ; j++)
				System.out.print(product[i][j] + " ");
			System.out.println();
		}
	}
}
