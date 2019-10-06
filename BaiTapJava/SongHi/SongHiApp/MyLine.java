package SongHiApp;

public class MyLine {
	
	 private int [] x;
	  private int y;
	  
	  public MyLine( int []x , int y)
	  {
		  this.x = new int [x.length];
		  for (int  i = 0 ; i < x.length ; i ++)
		  {
			  this.x[i] = x [i];
			  this.y = y;
		  }
	  }
	public int[] getX() {
		return x;
	}
	public void setX(int[] x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

}
