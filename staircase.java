import java.util.Scanner;
public class staircase
{
    public static String res=""; // intermediate res variable
    public static String finalres=""; //final res for every iteration till recursion level variable
    public static int sum=0; // intermediate sum count for every loop variable
    public static int finalsum=0;  //step count incremental variable
    public static int number_of_steps; // total no of steps to climb
    public static int n;
    public static int total = 0;
	
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of steps: ");
	number_of_steps=s.nextInt();
	System.out.println("Enter the number to climb: ");
	n=s.nextInt();
	int[] depth=new int[n];
	System.out.println("Enter the climbing steps: ");
	for(int i=0;i<n;i++)
	{
		depth[i]=s.nextInt();
	}
	recursion(1, res, sum,depth);
	System.out.println("total path: " + total);
    }
    
    public static void recursion(int iter, String res, int sum,int [] depth) 
    {
        
      	for(int i:depth)
       	{
        	if(iter <= number_of_steps) 
		{
			finalres = res + i;
              		finalsum = sum + i;
               		
			if(finalsum == number_of_steps) 
			{
				total+=1;
                    		System.out.println(finalres);
					
			}
				
                recursion(iter+1, finalres, finalsum,depth);
                
            	}
            
        }
        
    }
}
