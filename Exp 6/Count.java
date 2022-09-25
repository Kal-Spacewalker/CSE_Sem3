import java.util.*;
class Count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ab=0,uc=0,lc=0,wspc=0,dg=0,sc=0;
		System.out.println("Enter a multiword string: \n");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				az++;
				if(Character.isUpperCase(s.charAt(i)))
					uc++;
				else if(Character.isLowerCase(s.charAt(i)))
					lc++;
			}
			else if(Character.isDigit(s.charAt(i)))
				dg++;
			else if(Character.isWhitespace(s.charAt(i)))
				wspc++;
			else
				sc++;
		}
		System.out.println("Alphabets= "+ab);
		System.out.println("Uppercase= "+uc);
		System.out.println("Lowercase= "+lc);
		System.out.println("Digits= "+dg);
		System.out.println("Whitespace= "+wspc);
		System.out.println("Special characters= "+sc);
	}
}
