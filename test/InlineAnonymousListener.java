package test;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InlineAnonymousListener extends JFrame {

	public InlineAnonymousListener(String title)
	{
		setTitle ("title");
		setVisible (true);
		setSize(500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn1 = new JButton ("Say Hello");
		Container con = getContentPane();
		con.add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Hello Suong");
			}
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InlineAnonymousListener("title");

	}

}
