package Lab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai4 extends JFrame {
	public Bai4 (String title)
	{
		setTitle("Demo BorderLayout");
		setVisible(true);
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pnBorDer = new JPanel();
		pnBorDer.setLayout(new BorderLayout());
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.RED);
		pnBorDer.add(pnNorth,BorderLayout.NORTH);
		pnNorth.setPreferredSize(new Dimension(0, 50));
		JLabel lblTitleNorth=new JLabel("NORTH");
		pnNorth.add(lblTitleNorth);
		lblTitleNorth.setForeground(Color.WHITE);
		lblTitleNorth.setFont(new Font("", Font.BOLD,15));
		JPanel pnSouth = new JPanel ();
		pnSouth.setBackground(Color.RED);
		pnSouth.setPreferredSize(new Dimension(0, 50));
		JLabel lblTitleSouth=new JLabel("SOUTH");
		pnSouth.add(lblTitleSouth);
		lblTitleSouth.setForeground(Color.WHITE);
		lblTitleSouth.setFont(new Font("", Font.BOLD,15));
		pnBorDer.add(pnSouth,BorderLayout.SOUTH);
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.BLUE);
		pnWest.setPreferredSize(new Dimension(70, 0));
		JLabel lblTitleWest=new JLabel("WEST");
		pnWest.add(lblTitleWest);
		lblTitleWest.setForeground(Color.WHITE);
		lblTitleWest.setFont(new Font("", Font.BOLD,15));
		pnBorDer.add(pnWest,BorderLayout.WEST);
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.BLUE);
		pnEast.setPreferredSize(new Dimension(70, 0));
		JLabel lblTitleEast=new JLabel("EAST");
		pnEast.add(lblTitleEast);
		lblTitleEast.setForeground(Color.WHITE);
		lblTitleEast.setFont(new Font("", Font.BOLD,15));
		pnBorDer.add(pnEast,BorderLayout.EAST);
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.YELLOW);
		JLabel lblTitleCenter=new JLabel("CENTER");
		pnCenter.add(lblTitleCenter);
		lblTitleCenter.setForeground(Color.WHITE);
		lblTitleCenter.setFont(new Font("", Font.BOLD,15));
		pnBorDer.add(pnCenter,BorderLayout.CENTER);
		getContentPane().add(pnBorDer);
//		Container con=getContentPane();
//		con.add(pnBorDer);
		// setLocationRelativeTo(null);
		
		
	}
	public static void main (String[] args) {
		 new Bai4("title");
		
	}
		
}
