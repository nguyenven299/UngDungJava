package test;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

public class DemoJTable extends JFrame {
	public DemoJTable (String Title)
	{
		setTitle("Demo JTable");
		setVisible(true);
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // set giua
		JPanel jpn = new JPanel();
		jpn.setLayout(new BorderLayout());
		
		DefaultTableModel dm = new DefaultTableModel();
		dm.addColumn("ID");
		dm.addColumn("Name");
		dm.addColumn("Age");
		
		final JTable tbl = new JTable(dm); // dm tieu de phia tren
		dm.addRow(new String [] {
				"112" , "Mr Lee" , "21"
		});
		dm.addRow(new String [] {
				"113" , "Mr Suong" , "51"
		});
		dm.addRow(new String [] {
				"114" , "Mr Jun" , "41"
		});
		
//		dm.setRowCount(0);
//		xoa tat ca database
		JScrollPane sc = new JScrollPane(tbl); // neu qua dai hoac rong, tao keo
		jpn.add(sc,BorderLayout.CENTER);
		add(jpn);
//		Container con = getContentPane();
//		con.add(jpn);
		
	}
	

	public static void main(String[] args) {
		new DemoJTable("Title");
		// TODO Auto-generated method stub

	}

}
