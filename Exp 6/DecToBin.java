import java.util.*;
class DecToBin
{
	public static void main(String args[])
	{
		int[] rem=new int[50];
		int n,i=0,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		while(n!=0)
		{
			rem[i]=n%2;
			n=n/2;
			i++;
		}
		System.out.print("Binary equivelent of "+n+" n is: "+);
		for(j=i-1;j>=0;j--)
		{
			System.out.print(rem[j]);
		}
	}
}
