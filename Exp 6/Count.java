import java.util.*;
class Count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ab=0,uc=0,lc=0,wsp=0,dg=0,spc=0;
		System.out.println("Enter a multiword string: ");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				ab++;
				if(Character.isUpperCase(s.charAt(i)))
					uc++;
				else if(Character.isLowerCase(s.charAt(i)))
					lc++;
			}
			else if(Character.isDigit(s.charAt(i)))
				dg++;
			else if(Character.isWhitespace(s.charAt(i)))
				wsp++;
			else
				spc++;
		}
		System.out.println("\nAlphabets= "+ab);
		System.out.println("\nUppercase= "+uc);
		System.out.println("\nLowercase= "+lc);
		System.out.println("\nDigits= "+dg);
		System.out.println("\nWhitespace= "+wsp);
		System.out.println("\nSpecial characters= "+spc);
	}
}
