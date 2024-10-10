import java.util.Scanner;

public class Q26
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		String newStr = "";
		boolean storeAlpha = true;
		for(int i = 0 ; i <= str.length() - 1 ; i++)
		{
			if(str.charAt(i) == ' ')
				storeAlpha = true;
			
			else if(Character.isLetter(str.charAt(i)) && storeAlpha)
			{
				newStr += Character.toUpperCase(str.charAt(i)) + ".";
				storeAlpha = false;
			}
		}
		
		System.out.println("Modified string : " + newStr);
	}
}
