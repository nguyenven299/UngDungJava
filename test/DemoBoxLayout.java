package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoBoxLayout extends JFrame {
	public DemoBoxLayout (String title)
	{
		setTitle ("First Title");
		setVisible (true);
		setSize(500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.CYAN);
		JPanel pnBox = new JPanel();
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
		JButton btn1 = new JButton("Box Layout");
		btn1.setForeground(Color.GRAY);
		Font font = new Font ("Arial",Font.BOLD/Font.ITALIC,25);
		btn1.setFont(font);
		pnBox.add(btn1);
		JButton btn2 = new JButton("X_Axis");
		btn1.setForeground(Color.ORANGE);
//		Font font = new Font ("Arial",Font.BOLD/Font.ITALIC,25);
		btn1.setFont(font);
		pnBox.add(btn2);
		JButton btn3 = new JButton("Y_Axis");
		btn3.setForeground(Color.cyan);

		btn3.setFont(font);pnBox.add(btn3);
		Container con = getContentPane();
		con.add(pnBox);
		
	}
	public static void main(String [] args)
	{
		new DemoBoxLayout("title");
	}
	

}
