package Lab2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class Bai_1 extends JFrame {
	private long a = 0;
	private String phepToan = "";
	public Bai_1(String Title) {
		
		setSize(444,343);
		setVisible(true);
		setTitle("Caculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		
		JLabel hienThi = new JLabel("0");
		hienThi.setForeground(Color.BLACK);
		hienThi.setBackground(Color.WHITE);
		hienThi.setHorizontalAlignment(SwingConstants.RIGHT);
		hienThi.setBounds(0, 24, 434, 48);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 71, 434, 240);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 5, 0, 0));
		
		JButton So1 = new JButton("1");
		So1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So1.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So1);
		
		JButton So2 = new JButton("2");
		So2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So2.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So2);
		
		JButton So3 = new JButton("3");
		So3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So3.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So3);
		
		JButton Chia = new JButton("/");
		Chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(hienThi.getText());
				if (a!= 0)
				{
					phepToan = "/";
					hienThi.setText("0");
				}
			}
		});
		panel.add(Chia);
		
		JButton canBac2 = new JButton("sqrt");
		canBac2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(hienThi.getText());
				float b = (float) Math.sqrt(a);
				hienThi.setText(String.valueOf(b));
				
			}
		});
		
		panel.add(canBac2);
		
		JButton So4 = new JButton("4");
		So4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So4.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So4);
		
		JButton So5 = new JButton("5");
		So5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So5.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So5);
		
		JButton So6 = new JButton("6");
		So6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So6.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So6);
		
		JButton Nhan = new JButton("*");
		Nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(hienThi.getText());
				
					phepToan = "*";
					hienThi.setText("0");
				
			}
		});
		panel.add(Nhan);
		
		JButton phanTram = new JButton("%");
		phanTram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(hienThi.getText());
				
			long b = a/100;
			hienThi.setText(String.valueOf(b));
			}
		});
		panel.add(phanTram);
		
		JButton So7 = new JButton("7");
		So7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So7.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So7);
		
		JButton So8 = new JButton("8");
		So8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So8.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So8);
		
		JButton So9 = new JButton("9");
		So9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So9.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So9);
		
		JButton Tru = new JButton("-");
		Tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(hienThi.getText());
				
					phepToan = "-";
					hienThi.setText("0");
				
			}
		});
		panel.add(Tru);
		
		JButton ChiaX = new JButton("1/x");
		ChiaX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(hienThi.getText());
				
				long b = 1/a;
				hienThi.setText(String.valueOf(b));
			}
		});
		panel.add(ChiaX);
		
		JButton So0 = new JButton("0");
		So0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0") )
						gt = "";
				}
				long so = Long.parseLong(gt + So0.getText());
				hienThi.setText(String.valueOf(so));
			}
		});
		panel.add(So0);
		
		JButton amDuong = new JButton("+/-");
		amDuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			a= Long.parseLong(hienThi.getText());
			long b = 0;
			if (a<0)
			{
				b = (long)Math.abs(a);
			}
			else
			{
				b= (long)(0-a);
			}
			hienThi.setText(String.valueOf(b));
			}
		});
		panel.add(amDuong);
		
		JButton Xoa = new JButton("C");
		Xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a =0;
			phepToan="";
			hienThi.setText("0");
			
			}
		});
		panel.add(Xoa);
		
		JButton Cong = new JButton("+");
		Cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(hienThi.getText());
				
					phepToan = "+";
					hienThi.setText("0");
				
			}
		});
		panel.add(Cong);
		
		JButton Bang = new JButton("=");
		Bang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (phepToan.length()>0)
				{
					long b = Long.parseLong(hienThi.getText());
					if (phepToan.equals("+"))
					{
						long kq = a + b;
						hienThi.setText(String.valueOf(kq));
					}
					else if (phepToan.equals("-"))
					{
						long kq = a - b;
						hienThi.setText(String.valueOf(kq));
					}
					else if(phepToan.equals("*"))
					{
						long kq = a * b;
						hienThi.setText(String.valueOf(kq));
					}
					else if (phepToan.equals("/"))
					{
						float kq = (float) a / b;
						hienThi.setText(String.valueOf(kq));
					}
					
					phepToan = "";
					a = 0;
				}
			}
		});
		
		panel.add(Bang);
		
		
		getContentPane().add(hienThi);
	}

	public void Bai_1 (String Title)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bai_1("Title");

	}
}
