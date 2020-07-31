package com.phdareys.bank.model;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

class TestBank {

	@Test
	void test() {
		BNRAccount bnrA = new BNRAccount ("xxx");
		bnrA.add(1000);
		bnrA.withdraw(2000);
		if (-1175 != bnrA.getBalance())
			fail("Pb on BNAccount!");
	}

}
