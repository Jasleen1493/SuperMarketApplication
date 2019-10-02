package com.tworks.entity;

import org.junit.Assert;
import org.junit.Test;

public class SellingUnitTest {
	
	@Test
	public void testSellingUnitEnum(){
		Assert.assertSame(SellingUnit.WEIGHT.getUnit(),"kg");
	}
}