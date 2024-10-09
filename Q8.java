public class Q8
{
	void display()
	{
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 5 ; j++)
			{
				if(j % 2 == 0)
					System.out.print(1);
				else
					System.out.print(2);
			}
			
			System.out.println();
		}
	}
	
	void display(int m, int n)
	{
		if(m > n)
			System.out.println(m / n);
		else
			System.out.println(2 * n + 3 * m);
	}
	
	void display(double a, double b, double c)
	{
		double p = (a + b) / c, q = a + b + c;
		double z = p * q;
		System.out.println(z);
	}
	
	public static void main(String[] args)
	{
		Q8 obj = new Q8();
		obj.display();
		obj.display(17, 12);
		obj.display(12, 17);
		obj.display(1.2, 3.8, 2.6);
	}
}
