package Books;

public class BooksSuppliers {
	private int Id;
	private String Name;
	private String Type;
	private String Address;
	private String Contact;
	private String Mail;
	private String Remarks;
	
	public void BooksSuppliers (String Name, String Type, String Address, String Contact, String Mail, String Remarks)
	{
		this.Name = Name;
		this.Type = Type;
		this.Address = Address;
		this.Contact = Contact;
		this.Mail = Mail;
		 this.Remarks = Remarks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getContact() {
		return Contact;
	}


	public void setContact(String contact) {
		Contact = contact;
	}


	public String getMail() {
		return Mail;
	}


	public void setMail(String mail) {
		Mail = mail;
	}


	public String getRemarks() {
		return Remarks;
	}


	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

}
