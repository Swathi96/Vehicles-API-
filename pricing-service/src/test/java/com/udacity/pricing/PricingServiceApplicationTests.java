package com.udacity.pricing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceApplicationTests {

	
	
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void getPrice() throws PriceException {
		Assert.assertNotNull(PricingService.getPrice(1L).getPrice());
	}
	
	@Test
	public void getCurrency() throws PriceException {
		Assert.assertEquals("USD",PricingService.getPrice(5L).getCurrency());
	}
}
