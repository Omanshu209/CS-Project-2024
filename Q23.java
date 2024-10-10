public class Q23
{
	void display()
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	
	void display(int num)
	{
		while(num > 0)
		{
			System.out.println(Math.sqrt(num % 10));
			num /= 10;
		}
	}
	
	public static void main(String[] args)
	{
		Q23 obj = new Q23();
		obj.display();
		obj.display(4329);
	}
}
