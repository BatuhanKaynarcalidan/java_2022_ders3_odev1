package java_2022_ders3_odev1.entities;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalNumber;
	public Customer() {

	}
	public Customer(int id, String firstName, String lastName, String nationalNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalNumber = nationalNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalNumber() {
		return nationalNumber;
	}
	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
	}
	
	
}
