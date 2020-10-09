import java.util.Scanner;
class product
{
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		product PA=new product();
		System.out.println("Enter the number of terms");
		int n=s.nextInt();
		int[] array=new int[n];
		int i;
		System.out.println("The array elements are: ");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		productOf(n,array);
	}
	public static void productOf(int n,int[] array)
	{
		int[] array2=new int[n];
		int i,j;
		System.out.println("Output");
		for(i=0;i<n;i++)
		{
			int produ=1;
			for(j=0;j<n;j++)
			{
				if(i!=j)
				{
					produ=produ*array[j];
				}
			}
			array2[i]=produ;
			System.out.println(array2[i]);
		}
	}
}