package model;

public class Samsung extends Telephone{

	public Samsung(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int discount() {
		return 10;
	}

}
