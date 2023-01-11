package com.bridgelabzs;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	@Test
	public void calculateFareOfOneRide() {
		CabInvoiceGenarator Object = new CabInvoiceGenarator();
		double test = Object.calculateFare(10, 15);
		Assert.assertEquals(115.0, test, 0.0);
	}
}
