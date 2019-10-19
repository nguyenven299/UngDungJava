package Books;

public class BooksSuppliers {
	private String id;
	private String name;
	private String books;
	private String newsPaper;
	private String journalsAndMagazines;
	private String address;
	private String contact;
	private String mail;
	private String remarks;
	
	

	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBooks() {
		return books;
	}


	public void setBooks(String books) {
		this.books = books;
	}


	public String getNewsPaper() {
		return newsPaper;
	}


	public void setNewsPaper(String newsPaper) {
		this.newsPaper = newsPaper;
	}


	public String getJournalsAndMagazines() {
		return journalsAndMagazines;
	}


	public void setJournalsAndMagazines(String journalsAndMagazines) {
		this.journalsAndMagazines = journalsAndMagazines;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public BooksSuppliers() {
	}


	public BooksSuppliers(String id, String name, String books, String newsPaper, String journalsAndMagazines,
			String address, String contact, String mail, String remarks) {
		this.id = id;
		this.name = name;
		this.books = books;
		this.newsPaper = newsPaper;
		this.journalsAndMagazines = journalsAndMagazines;
		this.address = address;
		this.contact = contact;
		this.mail = mail;
		this.remarks = remarks;
	}





}
