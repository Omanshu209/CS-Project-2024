import java.util.Scanner;

public class Q25
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		
		System.out.println("Enter the elements : ");
		for(int i = 0 ; i < 20 ; i++)
			arr[i] = sc.nextInt();
		
		int max = arr[0], min = arr[0];
		for(int i = 0 ; i < 20 ; i++)
		{
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("Range = " + (max - min));
	}
}
