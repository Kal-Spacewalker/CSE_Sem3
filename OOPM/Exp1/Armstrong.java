class Armstrong
{
	public static void main(String args[])
	{
		int num,n,temp,sum=0;
		num=Integer.parseInt(args[0]);
		n=num;
		while(n!=0)
		{
			temp=n%10;
			sum=sum+temp*temp*temp;
			n/=10;
		}
		if(sum==num)
			System.out.println(num+" is an Armstrong number");
		else
			System.out.println(num+" is not an Armstrong number");
	}
}