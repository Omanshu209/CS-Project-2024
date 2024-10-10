public class Q9
{
	public static void main(String[] args)
	{
		int[] arr = {110061, 110001, 110029, 110023, 110055, 110006, 110019, 110033};
		
		for(int i = 0 ; i < arr.length - 1 ; i++)
		{
			int min = i;
			
			for(int j = i + 1 ; j < arr.length ; j++)
				if(arr[j] < arr[min])
					min = j;
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("Sorted elements : ");
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
	}
}
