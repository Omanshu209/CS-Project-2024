import java.util.Scanner;

public class Q5
{
	public static void main(String[] args)
	{
		double[] arr = {5.6, 11.5, 20.8, 35.4, 43.1, 52.4, 66.6, 78.9, 80.0, 95.5};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value to search : ");
		double val = sc.nextDouble();
		
		boolean found = false;
		int l = 0, u = arr.length;
		
		while(l <= u)
		{
			int mid = (l + u) / 2;
			
			if(arr[mid] == val)
			{
				found = true;
				break;
			}
			
			else if(arr[mid] < val)
				l = mid + 1;
			else
				u = mid - 1;
		}
		
		if(found)
			System.out.println("Search successful");
		else
			System.out.println("Search element not found");
	}
}
