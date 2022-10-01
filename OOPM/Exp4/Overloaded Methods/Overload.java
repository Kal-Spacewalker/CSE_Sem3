class Area
{
	int r;
	int l,b;
	void areaOf(int a)
	{
		r=a;
		System.out.println(" The area of circle is  "+(3.142*r*r));
	}
    void areaOf(int lh,int br)
	{
		l=lh;
		b=br;
		System.out.println(" The area of rectangle is  "+l*b);	
	}
}
class Overload
{
	public static void main(String args[])
	{
		Area a1=new Area();
		a1.areaOf(4);
		a1.areaOf(4,5);
	}
}