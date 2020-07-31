package com.phdareys.shape.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.phdareys.shape.exceptions.ShapeException;
import com.phdareys.shape.model.Disk;
import com.phdareys.shape.model.Rectangle;

public class TestModel {

	@Test
	public void test() {
		try {
				// the way to test the return value of a business method
			if (18 != new Rectangle (0,0, 4, 5).perim())
				fail("Test 1 fails!");
			if (40 != new Rectangle (0,0, 10, 10).perim())
				fail("Test 2 fails!");
			if (20 != new Rectangle (0,0, 4, 5).area())
				fail("Test 3 fails!");
			if (18 != (int) (new Disk (0,0,3).perim()))
				fail("Test 4 fails!");
		}
		catch ( ShapeException e) {
			e.display();
		}
	}

}
