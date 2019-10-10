package Books;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Scrollbar;
import java.awt.TextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class QLSach extends JFrame {
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtContact;
	private JTextField txtEmail;
	private JTable tblBooksSuppliers;
	public QLSach() {
		initComponents();
		
		setSize(684, 506);
		setVisible(true);
		setTitle("Books Suppliers");
		
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 685, 47);
		panel_1.setBackground(new Color(25, 25, 112));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Suppliers");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(199, 0, 281, 36);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setBounds(0, 47, 497, 233);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSuppliersId = new JLabel("Suppliers ID");
		lblSuppliersId.setForeground(new Color(255, 255, 255));
		lblSuppliersId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSuppliersId.setBounds(10, 8, 109, 14);
		panel_2.add(lblSuppliersId);
		
		JLabel lblSuppliersName = new JLabel("Suppliers Name");
		lblSuppliersName.setForeground(new Color(255, 255, 255));
		lblSuppliersName.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblSuppliersName.setBounds(10, 33, 109, 14);
		panel_2.add(lblSuppliersName);
		
		JLabel lblSuppliersType = new JLabel("Suppliers Type");
		lblSuppliersType.setForeground(new Color(255, 255, 255));
		lblSuppliersType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSuppliersType.setBounds(10, 58, 109, 14);
		panel_2.add(lblSuppliersType);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAddress.setForeground(new Color(255, 255, 255));
		lblAddress.setBounds(10, 83, 53, 14);
		panel_2.add(lblAddress);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setForeground(new Color(255, 255, 255));
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblContactNo.setBounds(10, 108, 62, 14);
		panel_2.add(lblContactNo);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setForeground(new Color(255, 255, 255));
		lblEmailId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEmailId.setBounds(10, 133, 53, 14);
		panel_2.add(lblEmailId);
		
		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setForeground(new Color(255, 255, 255));
		lblRemarks.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblRemarks.setBounds(10, 158, 53, 14);
		panel_2.add(lblRemarks);
		
		txtID = new JTextField();
		txtID.setBackground(new Color(255, 255, 255));
		txtID.setBounds(129, 5, 70, 20);
		panel_2.add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBackground(new Color(255, 255, 255));
		txtName.setBounds(129, 30, 196, 20);
		panel_2.add(txtName);
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBackground(new Color(255, 255, 255));
		txtAddress.setBounds(129, 80, 282, 20);
		panel_2.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtContact = new JTextField();
		txtContact.setBackground(new Color(255, 255, 255));
		txtContact.setBounds(129, 105, 196, 20);
		panel_2.add(txtContact);
		txtContact.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(255, 255, 255));
		txtEmail.setBounds(129, 130, 142, 20);
		panel_2.add(txtEmail);
		txtEmail.setColumns(10);
		
		JCheckBox chckbxBooks = new JCheckBox("Books");
		chckbxBooks.setBackground(new Color(30, 144, 255));
		chckbxBooks.setBounds(129, 54, 53, 23);
		panel_2.add(chckbxBooks);
		
		JCheckBox chckbxNewsPapers = new JCheckBox("News Papers");
		chckbxNewsPapers.setBackground(new Color(30, 144, 255));
		chckbxNewsPapers.setBounds(206, 55, 116, 23);
		panel_2.add(chckbxNewsPapers);
		
		JCheckBox chckbxJournalsAndMagazines = new JCheckBox("Journals and Magazines");
		chckbxJournalsAndMagazines.setBackground(new Color(30, 144, 255));
		chckbxJournalsAndMagazines.setBounds(324, 55, 167, 23);
		panel_2.add(chckbxJournalsAndMagazines);
		
		TextArea txtArRemarks = new TextArea();
		txtArRemarks.setBounds(129, 158, 282, 61);
		panel_2.add(txtArRemarks);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBounds(0, 279, 447, 62);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtID.setText("");
				txtName.setText("");
				chckbxBooks.setSelected(false);
				chckbxJournalsAndMagazines.setSelected(false);
				chckbxNewsPapers.setSelected(false);
				txtArRemarks.setText("");
				txtContact.setText("");
				txtEmail.setText("");
				txtArRemarks.setText("");
				
			}
		});
		btnNew.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNew.setBackground(new Color(240, 230, 140));
		btnNew.setBounds(10, 11, 89, 40);
		panel_3.add(btnNew);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection conn = null;
				
				String strName = txtName.getText();
				String strType =chckbxBooks.getText();
				String strAddress= txtAddress.getText();
				String strContact = txtContact.getText();
				String strEmail= txtEmail.getText();
				String strRemarks = txtArRemarks.getText();
				int row;
				
				String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=DBBooksSuppliers;" + "integratedSecurity=true";
				String user = "sa";
				String password = "123";
				
				PreparedStatement preStmmt = null;
				
				
				if (chckbxBooks.isSelected())
				{
					strType = "Books";
				}
				else if (chckbxNewsPapers.isSelected())
				{
					strType ="News Papers";
				}
				else if (chckbxJournalsAndMagazines.isSelected())
				{
					strType = "Journals and Magazines";
				}
				
				try
				{
					String sql = "INSERT INTO BooksSuppliers VALUES (?,?,?,?,?,?)";
					conn =DriverManager.getConnection(url,user,password);
					preStmmt = conn.prepareStatement(sql);
					
					preStmmt.setString(1, strName);
					preStmmt.setString(2, strType);
					preStmmt.setString(3, strAddress);
					preStmmt.setString(4, strContact);
					preStmmt.setString(5, strEmail);
					preStmmt.setString(6, strRemarks);
					row = preStmmt.executeUpdate();
					System.out.println("So dong inserted" +row);
					conn.close();
					
					
				}
				catch (SQLException e)
				{
					e.printStackTrace();
					
				}
				
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSave.setBackground(new Color(238, 232, 170));
		btnSave.setBounds(109, 11, 89, 40);
		panel_3.add(btnSave);
		
		JButton btnDelt = new JButton("Delete");
		btnDelt.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelt.setBackground(new Color(240, 230, 140));
		btnDelt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Connection conn = null;
				
				String strName = txtName.getText();
				String strType =chckbxBooks.getText();
				String strAddress= txtAddress.getText();
				String strContact = txtContact.getText();
				String strEmail= txtEmail.getText();
				String strRemarks = txtArRemarks.getText();
				int row;
				
				String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=DBBooksSuppliers;" + "integratedSecurity=true";
				String user = "sa";
				String password = "123";
				
				PreparedStatement preStmmt = null;
				
				
				
				
				
				try
				{
					String sql = "DELETE FROM BooksSuppliers WHERE id = ?";
					conn =DriverManager.getConnection(url,user,password);
					preStmmt = conn.prepareStatement(sql);

					preStmmt.setString(1, txtID.getText());
					
					row = preStmmt.executeUpdate();
					System.out.println("So dong delete" +row);
					conn.close();
					
					
				}
				catch (SQLException e)
				{
					e.printStackTrace();
					
				}
				
				
			}
				
			}
		);
		btnDelt.setBounds(331, 11, 89, 40);
		panel_3.add(btnDelt);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection conn = null;
				
				String strName = txtName.getText();
				String strType =chckbxBooks.getText();
				String strAddress= txtAddress.getText();
				String strContact = txtContact.getText();
				String strEmail= txtEmail.getText();
				String strRemarks = txtArRemarks.getText();
				int row;
				PreparedStatement preStmmt = null;
				String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=DBBooksSuppliers;" + "integratedSecurity=true";
				String user = "sa";
				String password = "123";

				if (chckbxBooks.isSelected())
				{
					strType = "Books";
				}
				else if (chckbxNewsPapers.isSelected())
				{
					strType ="News Papers";
				}
				else if (chckbxJournalsAndMagazines.isSelected())
				{
					strType = "Journals and Magazines";
				}
				try
				{
					String sql = "UPDATE BooksSuppliers SET name=?,type=?,address=?,contact=?,email=?,remarks=? WHERE id=? ";
					conn =DriverManager.getConnection(url,user,password);
					preStmmt = conn.prepareStatement(sql);
					
					preStmmt.setString(1, strName);
					preStmmt.setString(2, strType);
					preStmmt.setString(3, strAddress);
					preStmmt.setString(4, strContact);
					preStmmt.setString(5, strEmail);
					preStmmt.setString(6, strRemarks);
					preStmmt.setString(7, txtID.getText());
					row = preStmmt.executeUpdate();
					System.out.println("So dong update" +row);
					conn.close();
					
					
				}
				catch (SQLException e)
				{
					e.printStackTrace();
					
				}
				
			}
		});
		btnUpdate.setBounds(208, 11, 113, 40);
		panel_3.add(btnUpdate);
		btnUpdate.setBackground(new Color(240, 230, 140));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 340, 685, 133);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 664, 122);
		panel_4.add(scrollPane);
		
		tblBooksSuppliers = new JTable();
		tblBooksSuppliers.setBackground(Color.MAGENTA);
		tblBooksSuppliers.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Type", "Address", "Contact", "Email", "Remarks"
			}
		));
		scrollPane.setColumnHeaderView(tblBooksSuppliers);
		scrollPane.setViewportView(tblBooksSuppliers);
		
		showBooksSuppliers();
//		
//		
//		
//		
//		loadTable();
	}
	private  List<BooksSuppliers> getAllBooksSuppliers ()
	{
		List<BooksSuppliers> listAllB = new ArrayList<>();
		Connection conn = null ;
		PreparedStatement preStmmt = null;
		String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=DBBooksSuppliers;" + "integratedSecurity=true";
		String user = "sa";
		String password = "123";
		String sql = "SELECT * FROM BooksSuppliers";
		ResultSet rsBooksSuppliers;
		Statement stmt;
		try 
		{
			
			conn =DriverManager.getConnection(url,user,password);
			stmt =conn.createStatement();
			rsBooksSuppliers = stmt.executeQuery(sql);
			BooksSuppliers BooksSuppliers = null;
			
			
			 while(rsBooksSuppliers.next()){
				 BooksSuppliers = new BooksSuppliers();
				 BooksSuppliers.setName(rsBooksSuppliers.getString("Name"));
				 BooksSuppliers.setType(rsBooksSuppliers.getString("Type"));
				 BooksSuppliers.setAddress(rsBooksSuppliers.getString("Address"));
				 BooksSuppliers.setContact(rsBooksSuppliers.getString("Contact"));
				 BooksSuppliers.setMail(rsBooksSuppliers.getString("Email"));
				 BooksSuppliers.setRemarks(rsBooksSuppliers.getString("Remarks"));
	                listAllB.add(BooksSuppliers);
	            }
			 conn.close();
			 rsBooksSuppliers.close();
			 stmt.close();
		}
		catch (SQLException ex)
		{
            Logger.getLogger(BooksSuppliers.class.getName()).log(Level.SEVERE, null, ex);
		}
		return listAllB;
	}
	private void showBooksSuppliers(){
        List<BooksSuppliers> listAllB = getAllBooksSuppliers();
        DefaultTableModel model = (DefaultTableModel) tblBooksSuppliers.getModel();
        Object []row = new Object[6];
        for(int i = 0; i < listAllB.size(); i++)
        {
            row[0] = listAllB.get(i).getName();
            row[1] = listAllB.get(i).getType();
            row[2] = listAllB.get(i).getAddress();
            row[3] = listAllB.get(i).getContact();
            row[4] = listAllB.get(i).getMail();
            row[5] = listAllB.get(i).getRemarks();
            model.addRow(row);
        }
        
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}


	public void loadTable() {

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QLSach();

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}



}
