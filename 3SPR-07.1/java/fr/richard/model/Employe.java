package fr.richard.model;

public class Employe {
	private static final int MONTH_NB = 12;
	private static final float TAX_PERCENT = 0.9f;
	
	String firstName="";
	String lastName="";
	String firm="";
	int age=0;
	int mSal=0;
	int yCost;	// out att: year cost
	
	
	
	
	
	public Employe() {
		super();
	}






	public Employe(String firstName, String lastName, String firm, int age, int mSal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName.toUpperCase();
		this.firm = firm;
		this.age = age;
		this.mSal = mSal;
		
		this.yCost = 0;	// todo!!
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






	public String getFirm() {
		return firm;
	}






	public void setFirm(String firm) {
		this.firm = firm;
	}






	public int getAge() {
		return age;
	}






	public void setAge(int age) {
		this.age = age;
	}






	public int getmSal() {
		return mSal;
	}






	public void setmSal(int mSal) {
		this.mSal = mSal;
	}






	public static int getMonthNb() {
		return MONTH_NB;
	}






	public static float getTaxPercent() {
		return TAX_PERCENT;
	}






	public int getyCost() {
		return yCost;
	}






	public void run() {
		this.setyCost((int) (MONTH_NB *  (1 + TAX_PERCENT) * mSal));		
	}
	
	private void setyCost(int yCost) {
		this.yCost = yCost;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", firm=" + firm + ", age=" + age
				+ ", mSal=" + mSal + ", yCost=" + yCost + "]";
	}

}
