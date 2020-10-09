class largerProduct
{
	public static void main(String[] args)
	{
		int[] arr={-11,-22,50,3,5};
		int sum=1,sum1=1;
		int i;
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				arr[i]=arr[i]+arr[i-1];
				arr[i-1]=arr[i]-arr[i-1];
				arr[i]=arr[i]-arr[i-1];
				i=0;
			}
		}
		
			int j=0;	
			sum=arr[j]*arr[j+1]*arr[arr.length-1];
			

			sum1=arr[arr.length-3]*arr[arr.length-2]*arr[arr.length-1];
			
			if(sum>sum1)
			{
				System.out.println("The numbers are: "+arr[j]+","+arr[j+1]+","+arr[arr.length-1]);
			}
			else
			{
				System.out.println("The numbers are: "+arr[arr.length-3]+","+arr[arr.length-2]+","+arr[arr.length-1]);
			}
	}
}

