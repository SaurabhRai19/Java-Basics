interface Mouse
{
	void lBtn(int x,int y);
	void rBtn(int x,int y);
}
class GeniusMouse implements Mouse
{
	@Override public void lBtn(int x,int y){
		System.out.println("Left"+x+" "+y);
	}
	@Override public void rBtn(int x,int y){
		System.out.println("Right"+x+" "+y);
	}
}
class Interfaceex
{
	public static void main(String args[])
	{
		GeniusMouse ob=new GeniusMouse();
		ob.lBtn(10,20);
		ob.rBtn(30,40);
	}
}