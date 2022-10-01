class Student
{
	int r;
	int m1,m2,m3;
	String n;
	void set(int roll, String nm, int mk1, int mk2, int mk3)
	{
		r=roll;
		n=nm;
		m1=mk1;
		m2=mk2;
		m3=mk3;
	}	
	void display()
	{
		System.out.println("Roll no.: "+r+"\nName: "+n+"\nsub1: "+m1+"\nsub2: "+m2+"\nsub3: "+m3);
	}
	double avg()
	{
		return(double)(m1+m2+m3)/3;
	}
}
class StudentDemo
{
	public static void main(String args[])
	{
		Student s1;
		s1=new Student();
		s1.set(58,"KS",82,85,90);
		s1.display();
		System.out.println("Average is "+s1.avg());
	}
}