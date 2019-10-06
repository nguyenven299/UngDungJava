package Swing_Practices;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;

public class Bai_6 extends JFrame{
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtkq;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public Bai_6() {
		
		setTitle("Cộng Trừ Nhân Chia");
	
	
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 434, 34);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cộng Trừ Nhân Chia");
		lblNewLabel.setBounds(129, 5, 175, 24);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(0, 241, 434, 20);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(197, 5, 10, 10);
		panel_4.setBackground(Color.RED);
		panel_2.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(212, 5, 10, 10);
		panel_5.setBackground(Color.BLUE);
		panel_2.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(227, 5, 10, 10);
		panel_6.setBackground(Color.YELLOW);
		panel_2.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Nh\u1EADp 2 s\u1ED1 a v\u00E0 b:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(83, 34, 351, 207);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNhapa = new JLabel("Nhập a");
		lblNhapa.setBounds(42, 30, 46, 14);
		panel_7.add(lblNhapa);
		
		JLabel lblNhapb = new JLabel("Nhập b");
		lblNhapb.setBounds(42, 55, 46, 14);
		panel_7.add(lblNhapb);
		
		txta = new JTextField();
		txta.setHorizontalAlignment(SwingConstants.RIGHT);
		txta.setText("0");
		txta.setBounds(111, 27, 156, 20);
		panel_7.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setHorizontalAlignment(SwingConstants.RIGHT);
		txtb.setText("0");
		txtb.setBounds(111, 52, 156, 20);
		panel_7.add(txtb);
		txtb.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ch\u1ECDn ph\u00E9p to\u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(110, 90, 156, 76);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		
		JRadioButton radCong = new JRadioButton("Cộng");
		buttonGroup.add(radCong);
		radCong.setBounds(6, 24, 57, 23);
		panel_8.add(radCong);
		
		JRadioButton radTru = new JRadioButton("Trừ");
		buttonGroup.add(radTru);
		radTru.setBounds(93, 24, 57, 23);
		panel_8.add(radTru);
		
		JRadioButton radNhan = new JRadioButton("Nhân");
		buttonGroup.add(radNhan);
		radNhan.setBounds(6, 50, 57, 19);
		panel_8.add(radNhan);
		
		JRadioButton radChia = new JRadioButton("Chia");
		buttonGroup.add(radChia);
		radChia.setBounds(93, 50, 57, 19);
		panel_8.add(radChia);
		
		JLabel lblKtQu = new JLabel("Kết Quả");
		lblKtQu.setBounds(42, 182, 46, 14);
		panel_7.add(lblKtQu);
		
		txtkq = new JTextField();
		txtkq.setHorizontalAlignment(SwingConstants.RIGHT);
		txtkq.setText("0");
		txtkq.setBounds(111, 179, 156, 20);
		panel_7.add(txtkq);
		txtkq.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Ch\u1ECDn t\u00E1c v\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_3.setBounds(0, 34, 84, 207);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sa=txta.getText();
				int a=0,b=0;
				try
				{
					a=Integer.parseInt(sa);
				}
				catch(Exception ex)
				{
					
			JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
					txta.selectAll();
					txta.requestFocus();
					return;
				}
				String sb=txtb.getText();
				try
				{
					b=Integer.parseInt(sb);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
					txtb.selectAll();
					txtb.requestFocus();
					return;
				}
				double kq=0;
				if(radCong.isSelected())
				{
					kq=(a+b);
				}
				else if(radTru.isSelected())
				{
					kq=(a-b);
				}
				else if(radNhan.isSelected())
				{
					kq=(a*b);
				}
				else
				{
					kq=a*1.0/b*1.0;
				}
				txtkq.setText(kq+"");
			}

				
			
		});
		btnGiai.setBounds(12, 54, 49, 23);
		panel_3.add(btnGiai);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txta.setText("");
				txtb.setText("");
				txtkq.setText("");
				txta.requestFocus();

			}
		});
		btnXoa.setBounds(10, 88, 51, 23);
		btnXoa.setHorizontalAlignment(SwingConstants.LEADING);
		panel_3.add(btnXoa);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ret=JOptionPane.showConfirmDialog(null, "Muốn thoát hả?", "Thoát", JOptionPane.YES_NO_OPTION);
				if(ret==JOptionPane.YES_OPTION)
					System.exit(0);

			}
		});
		btnThoat.setBounds(10, 122, 61, 23);
		btnThoat.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_3.add(btnThoat);
		Container con=getContentPane();
		con.add(panel);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bai_6();

	}
}
