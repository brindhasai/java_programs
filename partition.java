import java.util.Scanner;
import java.util.Arrays;
class partition
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n=s.nextInt();
		int[] array=new int[n];
	
		System.out.println("The input set is: ");
		for(int i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		part(array,n);
	}
	
	public static void part(int[] array,int n)
	{
		int i;
		for(i=1;i<n;i++)
		{
			if(array[i]<array[i-1])
			{
				array[i]=array[i]+array[i-1];
				array[i-1]=array[i]-array[i-1];
				array[i]=array[i]-array[i-1];
				i=0;
			}
		}
		checktotal(array,n);
	}
		
	public static void checktotal(int[] array,int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total=total+array[i];
		}
			
		int halftotal=total/2;
		
		if(total%2!=0)
		{
			System.out.println("Cant spilt the subset into two");
		}
		else if(total%2==0)
		{
			sub(array,n,halftotal);
		}
	}

	public static void sub(int[] array,int n,int halftotal)
	{
		int[] a1=new int[n];
		int sum=0;
		boolean isFastpath = true;
    		int lastindex = 0;
    		for (int j=n-1;j>=0;j--) 
		{
        		sum = sum + array[j];
        		if (sum == halftotal) 
			{ 
            			if (isFastpath) 
				{ 
                			System.out.println("Found SubSets" + (j - 1) + " and "+ j + "..." + (n-1));
            			} 
				else 
				{
         			       a1[j] = array[j];
                		       //array[j] = 0;
                		       //System.out.println("Found");
                		       System.out.println("Set 1" + Arrays.toString(a1));
                		       System.out.println("Set 2" + Arrays.toString(array));
            			}
            			return;
        		} 
			else 
			{
            		if (sum < halftotal && ((halftotal - sum) >= array[0])) 
			{
         		       if (lastindex > j && a1[lastindex] == 0) 
				{
       			             a1[lastindex] = array[lastindex];
                    			array[lastindex] = 0;
                		}
                lastindex = j;
                continue;
            }
            isFastpath = false;
            if (a1[lastindex] == 0) 
	    {
                a1[lastindex] = array[lastindex];
                array[lastindex] = 0;
            }
            sum = sum - array[j];
       	    }
    	}

	}
}
