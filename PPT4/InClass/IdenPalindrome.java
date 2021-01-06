import java.util.Scanner;

public class IdenPalindrome
{
	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
		String inp = scan.next();
		Palindrome pali = new Palindrome(inp);
		pali.getLength();
		pali.isTrue();
		System.out.println(pali.toString());
	}
}