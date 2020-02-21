import java.awt.*;
import java.applet.*;
public class UserAppletInput extends Applet
{	
	TextField text1,text2;
	public void init()
	{
		text1=new TextField(8);
		text2=new TextField(8);
		add(text1);
		add(text2);
		text1.setText("0");
		text2.setText("0");
	}
	public void paint(Graphics g)
	{
		int x=0,y=0,z=0;
		String s1,s2,s;
		g.drawString("Input number in each box", 10, 150);
		s1=text1.getText();
		x=Integer.parseInt(s1);
		s2=text2.getText();
		y=Integer.parseInt(s2);
		z=x+y;
		s=String.valueOf(z);
		g.drawString("The Sum is: ",10, 75);
		g.drawString(s, 100, 75);		
	}	
	
	
}