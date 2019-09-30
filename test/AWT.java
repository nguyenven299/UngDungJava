package test;
//import java.awt.;

import java.awt.Frame;

public class AWT extends Frame { //kế thừa extends , Frame từ AWT
	public AWT(String title) // constructer tên trùng tên class
	{
		super(title); //sử dụng lại contructer của lớp cha Frame
		setVisible (true); // thừa kế từ Frame 
		setSize (400,400); // rộng và dài
		
	}
	public static void main (String [] args) {
		new AWT ("First App");
	}

}
