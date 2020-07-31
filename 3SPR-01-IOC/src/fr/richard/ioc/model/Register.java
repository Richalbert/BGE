package fr.richard.ioc.model;


/**
 * c la classe B
 * @author richard
 *
 */
public class Register implements TennisCapable{
	private String name;
	private String password;
	private String firstname;
	
	public Register(String name, String password, String firstname){
		super();
		this.name = name;
		this.password = password;
		this.firstname = firstname;
	}

	public Register() {
		super();
		this.firstname = this.name = this.password = "";
	}

	public String getName() {
		return name.toUpperCase();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname.toLowerCase();
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public void etreEndurant() {
		System.out.println("... et en plus je suis endurant");
		
	}

	@Override
	public void servirFort() {
		System.out.println(".. et en plus je sers fort");
		
	}

	@Override
	public void joueTennis() {
		System.out.println("... et je joue au tennis");
		
	}
	
}
