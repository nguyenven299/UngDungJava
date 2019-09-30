package test;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class DemoBtnGroupvaJRadioBtn extends JFrame {
	public DemoBtnGroupvaJRadioBtn(String title)
	{
		setTitle ("title");
		setVisible (true);
		setSize(500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().setBackground(Color.CYAN);
		JPanel pnGroup = new JPanel();
		pnGroup.setLayout(new BoxLayout(pnGroup, BoxLayout.Y_AXIS));
		Border  bor = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titlebor = new TitledBorder(bor, "chon ne");
		pnGroup.setBorder(titlebor);
		JRadioButton rad1 =new JRadioButton("rat hai long");
		JRadioButton rad2 = new JRadioButton("Hai Long");
		JRadioButton rad3 = new JRadioButton("tam chap nhan");
		JRadioButton rad4 = new JRadioButton("khong hai long");
		ButtonGroup group = new ButtonGroup();//khi chon chi chon duoc 1
		group.add(rad1);
		group.add(rad2);
		group.add(rad3);
		group.add(rad4);
		pnGroup.add(rad1);
		pnGroup.add(rad2);
		pnGroup.add(rad3);
		pnGroup.add(rad4);
		add(pnGroup); // đưa vào JFrame
		
		
	}
	public static void main (String [ ] args)
	{
		new DemoBtnGroupvaJRadioBtn("title");
	}

}
