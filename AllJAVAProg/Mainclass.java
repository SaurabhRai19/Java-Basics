class Abc
{	
	private int len;
	
	public void setLength(int a){
		len=a;
	}
	public Abc(){
		
	}
	public Abc(int a){
		len=a;
	}
	public void display(){
		System.out.println("Length is: "+len);
	}
}
class Mainclass{
	public static void main(String args[]){
		Abc obj=new Abc();
		obj.setLength(10);
		obj.display();
		Abc obj1=new Abc(4);
		obj1.display();
	}
}