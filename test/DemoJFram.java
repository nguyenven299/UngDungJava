package test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Component;

public class DemoJFram extends JFrame {
	private JTextField textField;
	public DemoJFram() {
		setTitle("DemoJFrame");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 559, 121);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(236, 5, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 118, 559, 248);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 0, 186, 57);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(186, 0, 186, 57);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(372, 0, 186, 57);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(0, 57, 186, 57);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(186, 57, 186, 57);
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(372, 57, 186, 57);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 114, 186, 57);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(186, 114, 186, 57);
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(372, 114, 186, 57);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(0, 171, 186, 57);
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(186, 171, 186, 57);
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(372, 171, 186, 57);
		panel_2.add(btnNewButton_11);
		setVisible(true);
	}

}
