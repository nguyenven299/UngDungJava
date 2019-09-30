package test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingJFrame extends JFrame {
	public SwingJFrame()//tên trùng với class
	{
		setTitle ("First Swing");
		
		setVisible (true);
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // đóng cửa sổ
		setLocationRelativeTo(null); //đặt cửa sổ giữua màn hình
		getContentPane().setBackground(Color.CYAN); // cài màu background
	}
	public static void main (String [] args)
	{
		SwingJFrame objFrame = new SwingJFrame();  //cách 1
		//JFrame obỉeame = new JFrame() ; cách 2
		//flowLayout tự xuống dòng 
		//boxlayout 
		//borderlayout nhiều hướng

	}
	
	

}