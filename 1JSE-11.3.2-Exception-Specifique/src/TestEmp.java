import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.richard.exceptionSpecifique.exception.MyException;
import fr.richard.exceptionSpecifique.model.Salarie;

class TestEmp {

	@Test
	void test() {

		try {
			Salarie jacques = new Salarie("Jacques","SFR");
			if (!jacques.getSociete().equalsIgnoreCase("SFR"));
			fail("Not yet implemented");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
