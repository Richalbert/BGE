package fr.richard.twobeans.beanmodel;

public class Address {

	private String town;
	private String country;
	
	
	
	public Address() {
		this("Paris","France");
	}
	
	
	public Address(String town, String country) {
		super();
		this.town = town;
		this.country = country;
	}


	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [town=" + town + ", country=" + country + "]";
	}
	
	
	
}
