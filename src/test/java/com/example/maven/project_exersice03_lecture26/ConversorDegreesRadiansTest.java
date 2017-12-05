package com.example.maven.project_exersice03_lecture26;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDegreesRadiansTest {
	ConversorDegreesRadians cdr = new ConversorDegreesRadians();
	
	//implement the conversion in another way.
	//compare the results of the two implementations.
	
	public double degrees2radians(double valueInDegrees) {
		double radians = valueInDegrees * (Math.PI / 180);
		return radians;
	}
	
	public double radians2degrees(double valueInRadians) {
		double degrees = valueInRadians * (180 / Math.PI );
		return degrees;
	}

	@Test
	public void testMethodDegreesToRadians() {
		assertEquals(degrees2radians(3.8), cdr.convertDegreesToRadians(3.8), 0.1);
	}

	@Test
	public void testMethodDegreesToDegrees() {
		assertEquals(radians2degrees(3.8), cdr.convertRadiansToDegrees(3.8), 0.1);
	}
}
