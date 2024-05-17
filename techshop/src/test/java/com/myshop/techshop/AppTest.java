package com.myshop.techshop;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.myshop.techshop.model.Device;

public class AppTest {
	
	static Float devicePrice;
	static Float deviceTotalPrice;
	
	@BeforeAll
	public static void setUp() {
		devicePrice = 50.0f;
		Device device = new Device("Test", devicePrice, "Test");
		deviceTotalPrice = device.getTotalPrice();
		
		System.out.println("setUp called");
		System.out.println("deviceTotalPrice: " + deviceTotalPrice);
	}
	
	@Test
	public void checkTotalPrice() {
		Float trueTotal = getTotal();
		//System.out.println("trueTotalPrice: " + trueTotal);
		//System.out.println("assert value: " + (deviceTotalPrice.compareTo(trueTotal)));
		assertTrue((deviceTotalPrice.compareTo(trueTotal)) == 0);
		System.out.println("checkTotalPrice called");
 	}
	public static Float getTotal() {
		float tax = 0.095f;
		System.out.println("getTotal called");
		return (devicePrice * tax + 1.0f);
	}
	
	@AfterAll
	public static void tearDown() {
		
		devicePrice = null;
		deviceTotalPrice = null;
		System.out.println("tearDown called");
	}
}
