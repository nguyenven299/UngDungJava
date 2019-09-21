package Lab;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JButton;


public class Bai5 extends JFrame {
	private JTextField lblTieuDe;
	private JTextField txtSoa;
	private JTextField txtSob;
	private JTextField txtSoc;
	private JTextField txtKetqua;
	public Bai5(String Title) {
		setTitle("Bài 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 444);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JPanel pnBorder = new JPanel();
		pnBorder.setBounds(0, 0, 557, 397);
		getContentPane().add(pnBorder);
		pnBorder.setLayout(null);
		
		 lblTieuDe = new JTextField();
		lblTieuDe.setBounds(0, 0, 557, 60);
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setFont(new Font("Arial", Font.BOLD, 20));
		lblTieuDe.setBackground(Color.LIGHT_GRAY);
		lblTieuDe.setText("GIẢI PHƯƠNG TRÌNH BẬC 2");
		pnBorder.add(lblTieuDe);
		lblTieuDe.setColumns(10);
		
		JPanel pnBorder_1 = new JPanel();
		pnBorder_1.setBackground(Color.WHITE);
		pnBorder_1.setBounds(0, 69, 557, 236);
		pnBorder_1.setForeground(Color.RED);
		pnBorder_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Nh\u1EADp a,b,c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnBorder_1.setToolTipText("");
		pnBorder.add(pnBorder_1);
		pnBorder_1.setLayout(null);
		JLabel lblA = new JLabel("a:");
		lblA.setBounds(168, 51, 21, 16);
		pnBorder_1.add(lblA);
		JLabel lblB = new JLabel("b:");
		lblB.setBounds(168, 90, 21, 16);
		pnBorder_1.add(lblB);
		JLabel lblC = new JLabel("c:");
		lblC.setBounds(168, 125, 21, 16);
		pnBorder_1.add(lblC);
		txtSoa = new JTextField();
		txtSoa.setBounds(188, 48, 229, 22);
		pnBorder_1.add(txtSoa);
		txtSoa.setColumns(10);
		txtSob = new JTextField();
		txtSob.setBounds(188, 87, 229, 22);
		pnBorder_1.add(txtSob);
		txtSob.setColumns(10);
		txtSoc = new JTextField();
		txtSoc.setBounds(188, 122, 229, 22);
		pnBorder_1.add(txtSoc);
		txtSoc.setColumns(10);
		JLabel lblKtQu = new JLabel("Kết Quả");
		lblKtQu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKtQu.setBounds(279, 157, 56, 16);
		pnBorder_1.add(lblKtQu);
		txtKetqua = new JTextField();
		txtKetqua.setBackground(UIManager.getColor("Button.background"));
		txtKetqua.setBounds(188, 186, 229, 22);
		pnBorder_1.add(txtKetqua);
		txtKetqua.setColumns(10);
		JPanel pnBorder_3 = new JPanel();
		pnBorder_3.setForeground(new Color(255, 182, 193));
		pnBorder_3.setToolTipText("");
		pnBorder_3.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 153, 255), new Color(255, 153, 255), new Color(255, 153, 255), new Color(255, 153, 255)), "Ch\u1ECDn thao t\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnBorder_3.setBounds(0, 318, 557, 79);
		pnBorder.add(pnBorder_3);
		pnBorder_3.setLayout(null);
		JButton btnGiai = new JButton("Giải");
		btnGiai.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGiai.setBounds(167, 23, 65, 43);
		pnBorder_3.add(btnGiai);
		JButton btnXoaTrang = new JButton("Xóa");
		btnXoaTrang.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXoaTrang.setBounds(244, 23, 97, 43);
		pnBorder_3.add(btnXoaTrang);
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThoat.setBounds(354, 23, 72, 43);
		pnBorder_3.add(btnThoat);

	}

	public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5 frame = new Bai5("title");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
