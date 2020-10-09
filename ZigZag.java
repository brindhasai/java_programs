class ZigZag
{
	public static void main(String[] args)
	{
		String str="thisisazigzag";
		int k=4,j,i=0;
		int upStream=0;
		int n=str.length();
		char [][] zigzag=new char[k][n];
		for(j=0;j<n;j++)
		{
			if(i<k && upStream==0)
			{
				zigzag[i][j]=str.charAt(j);
				i++;
				
			}
			
			if(i>=0 && upStream == 1)
			{
				i--;
				zigzag[i][j]=str.charAt(j);
				
			}
			
			if(i==k)
			{
				i--;
				upStream=1;
			}
			if(i==0)
			{
				i++;
				upStream=0;
			}
			
		}
		print(zigzag,k,n);
	}

	static void print(char[][] zigzag,int k,int n)
	{
		
		for (int row=0; row<k; row++)
		{
			for (int col=0; col<n; col++)
			{
				if ((int)zigzag[row][col] != 0){
					System.out.print(zigzag[row][col]);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
