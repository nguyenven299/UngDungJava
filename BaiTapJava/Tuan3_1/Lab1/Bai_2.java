package Lab1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;

public class Bai_2 extends JFrame {
	public Bai_2() {
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setBounds(0, 0, 225, 225);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Bai_2();
	}

}
