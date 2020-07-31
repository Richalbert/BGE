
public class Insee {
	// long code sur 32 bits
	private long code13;	//nir
	private int cle;
	private long code15;

	public Insee(long code13) {
		super();
		this.code13 = code13;
		this.cle = (int)(97 - (code13 % 97 ));
		this.code15 = this.code13*100 + this.cle;
	}

	public long getCode13() {
		return code13;
	}

	public int getCle() {
		return cle;
	}

	public long getCode15() {
		return code15;
	}

}

