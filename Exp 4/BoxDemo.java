class Box
{
	int l;
	int b;
	int h;
	int v;
	Box()
	{
		l=0;
		b=0;
		h=0;
	}
	Box(int ln,int bh,int ht)
	{
		l=ln;
		b=bh;
		h=ht;
	}
	void show()
	{
		System.out.println(" Length = "+l+" Breadth = "+b+" Height = "+h);
	}
	void findVol()
	{
		v=l*b*h;
		System.out.println(" Volume is "+v+" cu. units");
	}
}

class BoxDemo
{

	public static void main(String args[])
	{
	  	Box b1=new Box();
		Box b2=new Box(4,5,6);
		b1.show();
		b2.show();
		b2.findVol();
	}
}
