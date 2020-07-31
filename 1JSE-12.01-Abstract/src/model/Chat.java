package model;

public class Chat extends Animal {
	
	proçtected String name;

	public Chat(String string) {
		
	}

	@Override
	public void eat() {
		System.out.println("Je suis un " + super.name + "je mange de la viande");
	}

}
