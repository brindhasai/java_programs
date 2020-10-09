import java.util.Scanner;
class MyDiamond
{
   public static void main(String[] args)
   {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the row number: ");
	int rows=s.nextInt();
	int count=1;
	int j,k,n=1;
	int xflag=0;
	int yflag=1;
		for(int i=1;i<=rows*2-1;i++)
      		{
			xflag=0;
			for(j=count;j<rows;j++)
			{
				System.out.print(" ");
			}
			//n=1;	
			for(k=1;k<=count*2-1;k++)
			{
				System.out.print(n);
			
			if(n==1)
			{
				xflag=1;
			}
			if(yflag==0 && xflag==1 && k==count*2-1)
			{
				n--;
			}
			else if(xflag==1 && n<rows)
			{
				n++;
			}
			else
			{
				n--;
			}
		}
		if(i<rows)
		{
			count++;
				
		}
		else
		{
			yflag=0;
			count--;
		}
		System.out.println();
		}		
   }

}
