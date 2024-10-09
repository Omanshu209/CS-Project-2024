/*
Question 4

Print the following pattern :

34567
3456
345
34
3

*/

public class Q4
{
	public static void main(String[] args)
	{
		for(int i = 7 ; i >= 3 ; i--)
		{
			for(int j = 3 ; j <= i;  j++)
				System.out.print(j);
			System.out.println();
		}
	}
}
