package test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Test_Tuan4 extends JFrame{
	private JTextField txtName;
	private JTextField txtAddress;
	public Test_Tuan4() {
		
		setVisible(true);
		setSize(401,276);
		setTitle ("Test Tuan 4");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(54, 28, 46, 14);
		panel.add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(54, 66, 46, 14);
		panel.add(lblAddress);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(54, 99, 46, 14);
		panel.add(lblGender);
		
		JLabel lblKnowledge = new JLabel("Knowledge");
		lblKnowledge.setBounds(51, 132, 61, 14);
		panel.add(lblKnowledge);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(54, 170, 46, 14);
		panel.add(lblSubject);
		
		txtName = new JTextField();
		txtName.setBounds(161, 25, 167, 20);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(161, 63, 167, 20);
		panel.add(txtAddress);
		txtAddress.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(161, 95, 61, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(243, 95, 75, 23);
		panel.add(rdbtnFemale);
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(161, 128, 61, 23);
		panel.add(chckbxJava);
		
		JCheckBox chckbxPython = new JCheckBox("Python");
		chckbxPython.setBounds(243, 128, 67, 23);
		panel.add(chckbxPython);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(161, 197, 75, 23);
		panel.add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(259, 197, 75, 23);
		panel.add(btnReset);
		
		JComboBox cbbSubject = new JComboBox();
		cbbSubject.setBounds(161, 167, 167, 20);
		panel.add(cbbSubject);
		
		ButtonGroup ptg = new ButtonGroup();
		ptg.add(rdbtnMale);
		ptg.add(rdbtnFemale); // chi chon duoc 1 cai...
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test_Tuan4();
	}
}
