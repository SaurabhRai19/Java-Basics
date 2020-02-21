abstract class One
{
	public abstract void display();
}
class OneOfOne extends One
{
	public void display()
	{
		System.out.println("Inside ONEOFONE");
	}
}
class TwoOfOne extends One
{
	public void display()
	{
		System.out.println("Inside TWOOFONE");
	}
}
class Polymorphismex
{
	public static void main(String args[])
	{
		One ptr;		
		OneOfOne o1=new OneOfOne();
		TwoOfOne o2=new TwoOfOne();
		ptr=o1;
		ptr.display();
		ptr=o2;
		ptr.display();
	}
}

