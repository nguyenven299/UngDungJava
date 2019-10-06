		
package SongHiApp;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class MyList {
		private final ArrayList mList = new ArrayList<>();
		private final int xStart = 90;
		private final int yStart = 40;
		private final int cSize = 20;
		public void add(MyLine ml)
		{
			mList.add(ml);
		}
		public void addData()
		{
			new MyLine(new int[]{2,3,6,7},0);
			new MyLine(new int[]{1,4,5,8},1);
			new MyLine(new int[]{2,3,6,7},2);
			new MyLine(new int[]{0,9},3);
			new MyLine(new int[]{},4);
			new MyLine(new int[]{1,4,5,8},5);
			new MyLine(new int[]{1,2,3,4,5,6,7,8},6);
			new MyLine(new int[]{1,4,5,8},7);
			new MyLine(new int[]{2,3,6,7},8);
			new MyLine(new int[]{0,9},9);
			new MyLine(new int[]{2,3,6,7},10);
			new MyLine(new int[]{1,4,5,8},11);
			new MyLine(new int[]{1,2,3,4,5,6,7,8},12);
			new MyLine(new int[]{1,4,5,8},13);
			
		}
		public void printOut()
		{
			for (int i =0 ; i <mList.size()-1;i++)
			{
				MyLine ml = (MyLine) mList.get(i);
				System.out.println("<");
				for (int j = 0 ; j < ml.getX().length -1 ; j++)
				{
					System.out.println(ml.getX().length-1+(j<ml.getX().length-1?",":""));
				}
				System.out.println(">," +ml.getY());
			}
			
		}
		public void draw(Graphics g)
		{
			int iColor =  (MyPanel.soLan / cSize) %2;
			g.setColor(iColor== 0? Color.pink:Color.red);
			int iLan = MyPanel.soLan%(mList.size()*cSize);
			if(iLan == 0)
			{
				try {
					
				
				Thread.sleep(1000);
				g.clearRect(0,0,400,400);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			int ii = (iLan/cSize) % mList.size();
			for(int i = 0 ; i < ii; i++)
			{
				MyLine ml = (MyLine) mList.get(i);
				for (int j = 0; j<ml.getX().length; j+=2)
				{
					int cc= iLan%cSize;
					g.fillRect(ml.getX()[j]*cSize+xStart, ml.getY()*cSize+yStart, (ml.getX()[j+1]-ml.getX()[j])*cSize, cc+1);
				}
			}
		
		}
		


}
