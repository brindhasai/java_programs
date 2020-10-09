import java.util.Scanner;
public class lock
{
    public static String res=""; 
    public static String finalres=""; 
    public static int sum=0; 
    public static int finalsum=0;  
    public static int digits;
    public static int number;
    public static int total = 0;
	
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of digits: ");
	digits=s.nextInt();		
	System.out.println("Enter the number to rotate ");		
	number=s.nextInt();
	recursion(1, res, sum);
    }
    
    public static void recursion(int iter, String res, int sum) 
    {
        
       int count=0;
       while(count<number) 
       {
          count++;
 	  if(iter <= digits) 
	  {
		finalres = res + count;
                finalsum = sum + count;
           
                if(finalres.length()==digits)
		{
		     System.out.println(finalres);
		}	
				
                recursion(iter+1, finalres, finalsum);
                
          }
            
       }
        
    }
}
