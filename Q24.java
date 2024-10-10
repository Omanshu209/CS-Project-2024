import java.util.Scanner;

public class Q24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("Enter the elements : ");
		for(int i = 0 ; i < 10 ; i++)
			arr[i] = sc.nextInt();
		
		System.out.print("Original Array : ");
		for(int i = 0 ; i < 10 ; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		for(int i = 0 ; i < 9 ; i++)
		{
			for(int j = 0 ; j < 9 - i ; j++)
			{
				if(arr[j] < arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.print("Sorted Array   : ");
		for(int i = 0 ; i < 10 ; i++)
			System.out.print(arr[i] + " ");
	}
}
