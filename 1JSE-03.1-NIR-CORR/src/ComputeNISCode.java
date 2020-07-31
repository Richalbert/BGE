
public class ComputeNISCode {
	public static void main(String[] args) {
		long nis13 = 2690549588157L;
		
		Nis nis = new Nis(nis13);
		nis.run();
		System.out.println ("Code13: " + nis13 + " -> code15: " + nis.getNis15());		
	}

}
