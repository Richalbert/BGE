
public class Nis {
	private long nis13 = 0L;	// attribute IN or Instance Variable
	private int key2 = 0;		// attribute OUT
	private long nis15 = 0L;	// attribute OUT
	
	public Nis(long nis13) {	// constructor
		super();
		this.nis13 = nis13;
	}
	public long getNis15() {	// getter
		return this.nis15;
	}
			// do the job
	public void run() {
		this.key2 = 97 - (int) (this.nis13 % 97);	// insee algo
		this.nis15 = (long) (Math.pow(10, 2)*this.nis13 + this.key2);		
	}

}
