package com.jdh.daw.ed.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CicloDeVidaTest {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Al comienzo del test.");
	}

	@AfterAll
	public  static void afterAll() {
		System.out.println("Al final del test.");
	}
	
	@BeforeEach
	public void antesDelTest() {
		System.out.println("Antes de cada test.");
	}
	
	@AfterEach
	public void despuesDelTest() {
		System.out.println("Después del test.");
	}
	
	@Test
	public void test() {
		System.out.println("Testeando ...");
	}
	
	@Disabled
	public void disabledTest() {
		System.out.println("Testeand ...?");
	}
}
