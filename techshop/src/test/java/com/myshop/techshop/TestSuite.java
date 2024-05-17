package com.myshop.techshop;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.myshop.techshop.model.Device;

@Suite
@SelectClasses({AppTest.class})
public class TestSuite {
	
	@Test
	public void checkPrice() {
		Device device = new Device();
		device.setPrice(40.0f);
		assertTrue(device.getPrice().compareTo(20.9f) == 0);
	}

}
