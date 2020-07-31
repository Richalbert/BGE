package fr.richard.move.model;

public class Tel {
	
	private String model;
	private long num;
	
	
	public Tel(String model, long num) {
		super();
		this.model = model;
		this.num = num;
	}

	
	
	

	@Override
	public String toString() {
		return "Tel [model=" + model + ", num=" + num + "]";
	}
	
	
	
}
