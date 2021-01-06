public class Palindrome
{
	private String wd;
	private int len;
	private boolean deterW;

	
	public Palindrome(String word)
	{
		wd = word;
	}

	public int getLength()
	{
		return wd.length();
	}	

	public boolean isTrue()
	{
		for (int i = 0; i <= ((len + 1) / 2); i ++)
		{
			if (wd.charAt(i) == wd.charAt((((len+1) / 2) + i)))
			{
				deterW = true; 
			}

			else
			{
				deterW = false;
			}
		}

		return deterW;
	}
	public String toString()
	{
		return "Whether your string is Palindrome: " + isTrue();
	}
}