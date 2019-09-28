package Lab3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai_1 extends JFrame{
	public Bai_1() {
		setVisible(true);
		setTitle("Trò chơi xếp ô số");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBackground(Color.YELLOW);
		panel.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblTrChiXp = new JLabel("Trò Chơi Xếp Ô Số");
		lblTrChiXp.setForeground(Color.RED);
		lblTrChiXp.setBackground(Color.LIGHT_GRAY);
		lblTrChiXp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTrChiXp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblTrChiXp);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton So1 = new JButton("1");
		panel_2.add(So1);
		
		JButton So2 = new JButton("2");
		panel_2.add(So2);
		
		JButton So3 = new JButton("3");
		panel_2.add(So3);
		
		JButton So4 = new JButton("4");
		panel_2.add(So4);
		
		JButton So5 = new JButton("5");
		panel_2.add(So5);
		
		JButton So6 = new JButton("6");
		panel_2.add(So6);
		
		JButton So7 = new JButton("7");
		panel_2.add(So7);
		
		JButton So8 = new JButton("8");
		panel_2.add(So8);
		
		JButton So9 = new JButton("9");
		panel_2.add(So9);
		
		JButton So10 = new JButton("10");
		panel_2.add(So10);
		
		JButton So11 = new JButton("11");
		panel_2.add(So11);
		
		JButton So12 = new JButton("12");
		panel_2.add(So12);
		
		JButton So13 = new JButton("13");
		panel_2.add(So13);
		
		JButton So14 = new JButton("14");
		panel_2.add(So14);
		
		JButton So15 = new JButton("15");
		panel_2.add(So15);
		
		JButton Trong = new JButton("");
		panel_2.add(Trong);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnBtu = new JButton("Bắt Đầu");
		btnBtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					String getTitle = JOptionPane.showInputDialog("Nhập tên người chơi:");
					setTitle("Player " + getTitle);

			}
		});
		panel_3.add(btnBtu);
	}

}
