package test;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoCardLayout extends JFrame {
	public DemoCardLayout(String title)
	{
		super (title);
		setVisible (true);
		setSize(500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().setBackground(Color.CYAN);
		final JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new CardLayout());
		final JPanel pnCard1= new JPanel ();
		pnCard1.setBackground(Color.CYAN);
		final JPanel pnCard2 = new JPanel();
		pnCard2.setBackground(Color.darkGray);
		pnCenter.add(pnCard1,"My Card 1");
		pnCenter.add(pnCard2,"My Card 2");
		final JButton btnShowCard1 = new JButton ();
		btnShowCard1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cl = (CardLayout) pnCenter.getLayout();
				cl.show(pnCenter, "My card1");
			}
		});
		Container con = getContentPane();
		//con.add(pnCard1);
		//con.add(pnCard2);
		//con.add(pnCenter);
		con.add(btnShowCard1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoCardLayout("title");

	}

}
