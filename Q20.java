import java.util.Scanner;

public class Q20
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("Enter the elements : ");
		for(int i = 0 ; i < 10 ; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the no. to be searched : ");
		int n = sc.nextInt();
		
		boolean found = false;
		for(int i = 0 ; i < 10 ; i++)
			if(arr[i] == n)
				found = true;
		
		if(found)
			System.out.println("Search successful");
		else
			System.out.println("Search element not found");
	}
}
