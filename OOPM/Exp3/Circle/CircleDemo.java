import java.util.*;
class Circle
{
	int r;
	double pi=3.142;
	void setValues()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius: ");
		r=sc.nextInt();
	}
	void getValues()
	{
		System.out.println("Radius of the circle is "+r+" units");
	}	
	double findArea()
	{
		return(double)(pi*r*r);
	}
	double findPerimeter()
	{
		return(double)(2*pi*r);
	}
}
class CircleDemo
{
	public static void main(String args[])
	{
		Circle c1;
		c1=new Circle();
		c1.setValues();
		c1.getValues();
		System.out.println("Area of the circle is "+c1.findArea()+" units");
		System.out.println("Perimeter of the circle is "+c1.findPerimeter()+" units");
	}
}