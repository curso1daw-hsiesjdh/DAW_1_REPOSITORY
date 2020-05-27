package test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import Programa.Calculadora;
public class dividirTest {
	
	
	public static Calculadora Calculadora;
	
	@BeforeAll
	public static void prepareTestCase ()
	{
		Calculadora= new Calculadora();
	}
	
	@Test
	public void dividirtest1 () 
	{
		Integer dividendo=9;
		Integer divisor=3;
		Double resultado=Calculadora.dividir(dividendo, divisor);
		
		Assert.assertEquals(3.0, resultado,0);		
		
	}
	@Test
	public void dividirtest2 () 
	{
		Integer dividendo=5;
		Integer divisor=2;
		Double resultado=Calculadora.dividir(dividendo, divisor);
		
		Assert.assertEquals(2.5, resultado,0);		
		
	}
	@Test
	public void dividirtest3 () 
	{
		Integer dividendo=-10;
		Integer divisor=-10;
		Double resultado=Calculadora.dividir(dividendo, divisor);
		
		Assert.assertEquals(1, resultado,0);		
		
	}
	
	@Test
	public void dividirtest4 () 
	{
		Integer dividendo=-9;
		Integer divisor=3;
		Double resultado=Calculadora.dividir(dividendo, divisor);
		
		Assert.assertEquals(-3, resultado,0);		
		
	}
}
