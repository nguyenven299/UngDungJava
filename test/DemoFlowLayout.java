package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoFlowLayout extends JFrame {
	public DemoFlowLayout (String title)
	{
	setTitle ("First Swing");
		
		setVisible (true);
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // đóng cửa sổ
		setLocationRelativeTo(null); //đặt cửa sổ giữua màn hình
		getContentPane().setBackground(Color.CYAN); // cài màu background
		JPanel pnFlow= new JPanel(new FlowLayout()); //cách 1
		//pnFlow.setLayout( new FlowLayout()); // cách 2
		pnFlow.setBackground(Color.GREEN);
		// thành phần
		JButton btn1 = new JButton ("FlowLayout");
		JButton btn2 = new JButton ("Add các control");
		JButton btn3 = new JButton ("............");
		JButton btn4 = new JButton ("Add các control");
		JButton btn5 = new JButton ("Add các control");
		pnFlow.add(btn1); // add button vào layout
		pnFlow.add(btn2);pnFlow.add(btn3);
		pnFlow.add(btn4);pnFlow.add(btn5);
		Container con = getContentPane();
		con.add(pnFlow);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoFlowLayout("title");
		
	}

}
