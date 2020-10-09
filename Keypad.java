import java.util.Scanner;
class Keypad 
{
	static String stringArray[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static void main(String[] args) 
	{
		Keypad key = new Keypad();
		key.Action();
	}
	
	public static void Action() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find possible keys");
		String str = s.next();
		//System.out.println("string: "+str);
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		//System.out.println("charac: "+ch[i]);
		Combination(ch, 0 ,"");
	}

	public static void Combination(char[] ch, int count, String strngCom) 
	{

		if(count == ch.length)
		{
			System.out.println(strngCom+",");
			return;
		}
		
		if(count<ch.length)
		{
			//System.out.println("ch[count] " +ch[count]);
			int c = ch[count]-'0';
			//System.out.println("int c" +c);
			for(int i = 0; i < stringArray[c].length(); i++)
			{
				Combination(ch, count+1, strngCom+String.valueOf(stringArray[c].charAt(i)));
			}
		}

	}
}
