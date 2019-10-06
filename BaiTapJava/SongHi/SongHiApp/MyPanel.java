package SongHiApp;

import	java.awt.Graphics;
import java.util.concurrent.ExecutionException;
import	java.util.logging.Level;
import java.util.logging.Logger;
import	javax.swing.JFrame;
import	javax.swing.JPanel;

public class MyPanel extends JPanel implements Runnable {
	public static int soLan = 0;
	Thread thread = null;
	JFrame f ;
	MyList mList = null;
	
	public MyPanel (MyList ml)
	{
		f.setSize(700,700);
		mList = ml;
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
        f.setLocationRelativeTo(null);
        
	}
	
	public void paint (Graphics g)
	{
			try
			{
		
				mList.draw(g);
				
			}
		catch (Exception ex)
			{
			Logger.getLogger(MyPanel.class.getName()).log(Level.SEVERE, null, ex);
			}
			soLan++;
	}
	public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
	public void stop ()
	{
		thread = null;
	}
	@Override
	public void run() {
		while (thread!=null)
		{
			try
			{
				Thread.sleep(50);
			}
			catch (Exception e)
			{
				thread = null;
			}
			repaint();
		}
		
	}
	public void update(Graphics g)
	{
		paint(g);
	}
	
	
	

}
