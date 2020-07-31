package fr.richard.excep3.model;



public class Employee {
	

	private String name;
	private String firm;
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
//	public void hire(String firm) throws EmployeeException {
//		if (firm.equalsIgnoreCase(FORBIDDEN_FIRM))
//			throw new EmployeeException (true, FORBIDDEN_FIRM_MESS);
//		if (firm.equalsIgnoreCase(FORBIDDEN_FIRM2) && name.equalsIgnoreCase(FORBIDDEN_EMP))
//			throw new EmployeeException (true, FORBIDDEN_EMP_MESS);
//		this.firm = firm;
//	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", firm=" + firm + "]";
	}
	
	public String getFirm() {
		// TODO Auto-generated method stub
		return firm;
	}

}
