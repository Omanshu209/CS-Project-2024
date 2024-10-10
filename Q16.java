public class Q16
{
	double perform(double r, double h)
	{
		double l, CSA;
		l = Math.sqrt(r * r + h * h);
		CSA = 22 / 7 * r * l;
		return CSA;
	}
	
	void perform(int r, int c)
	{
		for(int i = 1 ; i <= r ; i++)
		{
			for(int j = 1 ; j <= c ; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	
	void perform(int m, int n, char ch)
	{
		if(ch == 'Q')
			System.out.println(m / n);
		else if(ch == 'R')
			System.out.println(m % n);
	}
	
	public static void main(String[] args)
	{
		Q16 obj = new Q16();
		System.out.println(obj.perform(2.0, 2.0));
		obj.perform(4, 5);
		obj.perform(17, 12, 'Q');
		obj.perform(17, 12, 'R');
	}
}
