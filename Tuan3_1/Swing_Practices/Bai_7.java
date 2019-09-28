package Swing_Practices;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai_7 extends JFrame{
	private JTextField textField;
	public Bai_7() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 533, 48);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thao Tác Trên Jlist - CheckBox");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(137, 11, 270, 24);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBackground(Color.BLUE);
		panel_1.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0)), "Ch\u1ECDn T\u00E1c V\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(0, 48, 184, 247);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnTenS = new JButton("Tô Đen Số Chẵn");
		btnTenS.setVerticalAlignment(SwingConstants.BOTTOM);
		btnTenS.setHorizontalAlignment(SwingConstants.LEFT);
		btnTenS.setBounds(10, 29, 104, 23);
		panel_4.add(btnTenS);
		
		JButton btnTenS_1 = new JButton("Tô Đen Số Lẻ");
		btnTenS_1.setBounds(10, 63, 104, 23);
		panel_4.add(btnTenS_1);
		
		JButton btnTenS_2 = new JButton("Tô Đen Số Nguyên Tố");
		btnTenS_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTenS_2.setBounds(10, 97, 158, 23);
		panel_4.add(btnTenS_2);
		
		JButton btnBTen = new JButton("Bỏ Tô Đen");
		btnBTen.setBounds(10, 127, 89, 23);
		panel_4.add(btnBTen);
		
		JButton btnXaCcGi = new JButton("Xóa Các Giá Trị Tô Đen");
		btnXaCcGi.setBounds(10, 161, 158, 23);
		panel_4.add(btnXaCcGi);
		
		JButton btnTngGiTr = new JButton("Tổng Giá Trị Trong JList");
		btnTngGiTr.setBounds(10, 195, 158, 23);
		panel_4.add(btnTngGiTr);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Nh\u1EADp Th\u00F4ng Tin", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(184, 48, 349, 247);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JCheckBox chckbxChnSm = new JCheckBox("Chọn Số Âm");
		chckbxChnSm.setBounds(215, 18, 97, 23);
		panel_5.add(chckbxChnSm);
		
		textField = new JTextField();
		textField.setBounds(108, 19, 86, 20);
		panel_5.add(textField);
		textField.setColumns(10);
		
		JButton btnNhp = new JButton("Nhập");
		btnNhp.setBounds(9, 18, 89, 23);
		panel_5.add(btnNhp);
		
		JList list = new JList();
		list.setBackground(Color.LIGHT_GRAY);
		list.setBounds(9, 68, 303, 148);
		panel_5.add(list);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(0, 295, 533, 48);
		panel.add(panel_2);
		
		JButton btnngChngTrnh = new JButton("Đóng Chương Trình");
		panel_2.add(btnngChngTrnh);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
