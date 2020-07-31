package fr.richard.convert.bean;

public class Convert {
	
	private static final float RATE = 1.14F;	// 1 € =1.14 USD
	
	private int inAmount;						// somme a convertir
	private float outAmount;					// resultat de la convertion
	private boolean euroToDollar;				// sens de la convertion
	
	
	
	
//	public Convert(int inAmount, boolean euroToDollar) throws Exception {
//		super();
//		this.inAmount = inAmount;
//		this.outAmount = run(inAmount,euroToDollar);
//		if ( this.outAmount > 1000) {
//			throw new Exception("valeur trop grande");
//		}
//		this.euroToDollar = euroToDollar;
//	}

	public float run(int inAmount, boolean euroToDollard) {
		return (euroToDollard ? (float) inAmount*RATE : (float) inAmount/RATE );
	}

	public int getInAmount() {
		return inAmount;
	}

	public void setInAmount(int inAmount) {
		this.inAmount = inAmount;
	}

	public float getOutAmount() {
		return outAmount;
	}

	public void setOutAmount(float outAmount) {
		this.outAmount = outAmount;
	}

	public boolean isEuroToDollar() {
		return euroToDollar;
	}

	public void setEuroToDollar(boolean euroToDollar) {
		this.euroToDollar = euroToDollar;
	}

	@Override
	public String toString() {
		return "Convert [inAmount=" + inAmount + ", outAmount=" + outAmount + ", euroToDollar=" + euroToDollar + "]";
	}
	


}
