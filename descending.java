import java.util.Scanner;
class descending
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		System.out.println("The elements are: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=s.nextInt();
		}
		System.out.println(check(arr));
	}
	
    	public boolean check(int[] arr) 
	{
        	if (arr.length<=0) 
		{
            		return false;
        	} 
		else
		{
        	
		int count = 0;
        	
		for (int i = 0; i < arr.length-1; i++) 
		{
	        	if (arr[i] > arr[i + 1]) 
			{
                		if (i >= 1 && arr[i - 1] < arr[i + 1]) 
				{
                   			arr[i] = arr[i + 1];
                		} 
				else if (i >= 1 && arr[i - 1] > arr[i + 1]) 
				{
                    			arr[i + 1] = arr[i];
                		}
                		count++;
            		}
            	if (count >= 2) 
		{
                	return false;
            	}
        	}
		}
        	return true;
    	}
}
