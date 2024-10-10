public class Q27
{
	public static boolean isPrime(int num)
	{
		int factors = 0;
		for(int i = 1 ; i <= num ; i++)
			if(num % i == 0)
				factors++;
		
		if(factors == 2)
			return true;
		return false;
	}
	
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++)
			if(isPrime(i))
				sum += i;
		System.out.println("Sum = " + sum);
	}
}
