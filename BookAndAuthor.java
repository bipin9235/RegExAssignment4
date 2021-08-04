/*
 * #Task-17: Objective: Implement the Book and Author classes based on the class diagram and description given
	below.
	Registration ID: JIRSS1132
	Name: Bipin Kumar
 */
package ConstructorAndStaticKeyword;

class Author{
	// Author class data members
	String name;
	String emailId;
	char gender;
	// Author class parametrized construtor
	Author(String name, String emailId, char gender){
		this.name=name;
		this.gender=gender;
		this.emailId=emailId;
	}
	// Getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}

class Book{
	// data members
	String name;
	Author author;
	double price;
	int quantity;
		
	//class parametrized constructor
	public Book(String name, Author author, double price, int quantity) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	// getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// Method Description
	void displayAuthorDetails() {
		System.out.println("---Details of Author---");
		System.out.println("Name of Author : "+author.getName());
		System.out.println("Email-ID : "+author.getEmailId());
		System.out.println("Gender : "+author.getGender());
	}
}

public class BookAndAuthor {
	
		public static void main(String[] args) {
			Author author1=new Author("Joshua Bloch","joshua@gmail.com",'M');
			Book book1=new Book("Effective Java",author1,45.0,15);
			book1.displayAuthorDetails();
		}
}
