import java.util.Scanner;

public class Q22
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		int vowels = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowels++;
		}
		
		System.out.println("Modified string : " + str);
		System.out.println("Number of Vowels : " + vowels);
	}
}
