package com.phdareys.convert.model;

import com.phdareys.convert.exception.EDConvertException;

public class EDConvert {
	private static final double ED_RATE = 1.14f;
	private static final int THRESHOLD = 1000;
	private static final String AMOUNT_TOO_HIGH = "Amount is too high for me!!";
	
	private boolean eToD = true;
	private int amount = 0;
	private double result = 0f;
	
	public EDConvert() {
		super();
	}

	public EDConvert(boolean eToD, int amount) {
		super();
		this.eToD = eToD;
		this.amount = amount;
	}
	
	public void run() throws EDConvertException {
		this.result = this.round(eToD ? this.amount*ED_RATE: this.amount/ED_RATE, 2);
		if (this.result > THRESHOLD) 
			throw new EDConvertException (AMOUNT_TOO_HIGH);
			//throw new Exception (AMOUNT_TOO_HIGH);
	}
	
	public double getResult() {
		return result;
	}

	public boolean isEToD() {
		return eToD;
	}

	public boolean getEToD() {
		return eToD;
	}
	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "EDConvert [eToD=" + eToD + ", amount=" + amount + ", result=" + result + "]";
	}

	// only a few digits after .
	private double round(double a, int b) {
		return (double) ( (int) (a * Math.pow(10, b) + .5)) / 
				Math.pow(10, b);
	}
}
