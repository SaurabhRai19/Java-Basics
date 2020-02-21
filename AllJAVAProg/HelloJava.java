import java.awt.*;
import java.applet.*;
public class HelloJava extends Applet
{	
	public void paint(Graphics g)
	{
		int val1=10;
		int val2=20;
		int sum=val1+val2;
		String s="Sum: " + String.valueOf(sum);
		g.drawString (s, 10, 100);

	}		
}