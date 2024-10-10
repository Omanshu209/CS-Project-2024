import java.util.Scanner;

public class Q29
{
	public static boolean isVowel(char ch)
	{ 
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U')
			return true;
		return false;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str = sc.nextLine().toUpperCase();
		
		int pairs = 0;
		System.out.println("Pair of vowels : ");
		for(int i = 0 ; i < str.length() - 1 ; i++)
		{
			if(isVowel(str.charAt(i)) && isVowel(str.charAt(i + 1)))
			{
				System.out.println(str.substring(i , i + 2));
				pairs++;
			}
		}
		
		System.out.println("Total pair of vowels = " + pairs);
	}
}
