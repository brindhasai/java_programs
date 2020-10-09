import java.util.Scanner;
public class Dice
{
    public static String res=""; 
    public static String finalres=""; 
    public static int sum=0; 
    public static int finalsum=0;  
    public static int numOfDice;
    public static int number;
	public static int Diceface=6;
	public static int total = 0;
	
	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=s.nextInt();		
		System.out.println("Enter the number of dice ");
		numOfDice=s.nextInt();
		recursion(1, res, sum);
    }
    
    public static void recursion(int iter, String res, int sum) 
	{
        
       int count=0;
       while(count<Diceface) 
		{
          count++;
		    if(iter <= number) 
			{
				finalres = res + count;
                finalsum = sum + count;
				
               if(finalres.length()==numOfDice && finalsum==number)
			   {
				   System.out.println(finalres);
			   }	
				
                recursion(iter+1, finalres, finalsum);
                
            }
            
        }
        
    }
}