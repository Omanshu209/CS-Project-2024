import java.util.Scanner;

public class Q3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		String str = sc.nextLine();
		
		str = str.toUpperCase();
		String newStr = "";
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			int ASCII = (int) ch;
			
			if(ASCII >= 65 && ASCII <= 90)
			{
				if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
					newStr += (char) (ASCII + 1);
				else
					newStr += (char) (ASCII - 1);
			}
			
			else
				newStr += ch;
		}
		
		System.out.println("Modified string : " + newStr);
	}
}
