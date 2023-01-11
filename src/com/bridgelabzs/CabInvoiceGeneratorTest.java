package com.bridgelabzs;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	@Test
	public void CalculateFareTest()  {
		CabInvoiceGenarator obj=new CabInvoiceGenarator();
		double test=obj.calculateFare(10, 15);
		double test1=obj.calculateFare(10, 15)+obj.calculateFare(10, 15);;
		Assert.assertEquals(230.0, test1, 0.0);
	}
	@Test
	public void MonthFareTest()  {
		CabInvoiceGenarator obj=new CabInvoiceGenarator();
		TotalRide[] rides= { new TotalRide(1,23), new TotalRide(1,2)};
		double monthfare=obj.calculateFare(rides);
		Assert.assertEquals(45.0,monthfare , 0.0);
		
		}
}