package newphase;
import java.awt.*;
import java.applet.*;
/*<appplet align = "CENTER" code="First.class" width="800"height="500"></applet>*/
public class first extends Applet
{
	int x,y;
	public void init()
	{
		int x=0,y=45;
		setSize(250,300);
	}
	public void paint (Graphics g)
	{
		g.drawString("First applet", x, y);
	}
}

