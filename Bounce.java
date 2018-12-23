import java.awt.*;
import java.applet.*;
public class BounceB extends Applet implements Runnable
{
	int x=100;
	int y=100;
	int r=40;
	Thread thread;
	int dx=50;
	int dy=40;
	boolean stop=false;
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(x-r,y-r,r*2,r*2);
		
	}
	public void animate()
	{
		
		Rectangle bounds=getBounds();
   		if ((y-r+dy<0)||(y+r+dy>bounds.height))
    		dy=-dy;
		y+=dy;
		repaint();

	}
	public void run()
	{
		while(!stop)
		{
			animate();
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{}
		}

	}
	public void start()
	{
		thread=new Thread(this);
		stop=false;
		thread.start();
	}
	/*public void stop()
	{
		stop=true;
	}*/


}
/*
<applet code="Bounce.java" width="500" height="500">
</applet>
*/