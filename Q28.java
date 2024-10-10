import java.util.Scanner;

public class Q28
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		
		System.out.println("Enter the names : ");
		for(int i = 0 ; i < 10 ; i++)
			names[i] = sc.next().toUpperCase();
		
		for(int i = 0 ; i < 9 ; i++)
		{
			int min = i;
			for(int j = i + 1 ; j < 10 ; j++)
				if(names[j].compareTo(names[min]) < 0)
					min = j;
			
			String temp = names[min];
			names[min] = names[i];
			names[i] = temp;
		}
		
		System.out.println("Sorted names : ");
		for(int i = 0 ; i < 10 ; i++)
			System.out.println(names[i]);
	}
}
