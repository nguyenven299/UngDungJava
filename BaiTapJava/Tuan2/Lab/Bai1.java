package Lab;

import javax.swing.JFrame;

public class Bai1 extends JFrame {
	public Bai1(String title)
	{
		setTitle ("Demo Windows");
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Bai1 ("title");
	}

}
