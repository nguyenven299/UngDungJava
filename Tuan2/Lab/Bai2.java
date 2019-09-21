package Lab;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai2 extends JFrame {
	public Bai2 (String title)
	{
		setTitle("Demo FlowLayout");
		setVisible(true);
		setSize(400, 500);
		JPanel pnFlow = new JPanel();
		pnFlow.setLayout(new FlowLayout());
		pnFlow.setBackground(Color.cyan);
		JButton btn1 = new JButton("FlowLayout");
		JButton btn2 = new JButton("Add cac Control");
		JButton btn3 = new JButton("Tren 1 dong");
		JButton btn4 = new JButton("Het cho chua");
		JButton btn5 = new JButton("Thi xuong dong");
		pnFlow.add(btn1);pnFlow.add(btn2);pnFlow.add(btn3);pnFlow.add(btn4);pnFlow.add(btn5);
		Container con = getContentPane();
		con.add(pnFlow);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bai2("title");
	}

}
