import java.util.*;

public class ChangeCase
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Whats your string:");
		String fin = "", target = scan.nextLine();
		int le = target.length();
		for (int i = 0; i < le; i ++)
		{
			if (((String.valueOf(target.charAt(i))).toLowerCase()).equals(String.valueOf(target.charAt(i))))
			{
				fin += (String.valueOf(target.charAt(i))).toUpperCase();
			}
			else 
			{
				fin += (String.valueOf(target.charAt(i))).toLowerCase();
			}
		}
		System.out.println("This is your final string:");
		System.out.println(fin);
	}
}