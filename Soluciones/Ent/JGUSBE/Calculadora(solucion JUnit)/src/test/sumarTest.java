package test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import Programa.Calculadora;
public class sumarTest {
	
	
	public static Calculadora Calculadora;
	
	@BeforeAll
	public static void prepareTestCase ()
	{
		Calculadora= new Calculadora();
	}
	
	@Test
	public void sumartest1 () 
	{
		Integer sumando1=2;
		Integer sumando2=3;
		Integer resultado=Calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(5, resultado,0);		
		
	}
	@Test
	public void sumartest2 () 
	{
		Integer sumando1=7;
		Integer sumando2=-3;
		Integer resultado=Calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(4, resultado,0);		
		
	}
	@Test
	public void sumartest3 () 
	{
		Integer sumando1=-10;
		Integer sumando2=10;
		Integer resultado=Calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(0, resultado,0);		
		
	}
	@Test
	public void sumartest4 () 
	{
		Integer sumando1=20;
		Integer sumando2=-2;
		Integer resultado=Calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(18, resultado,0);		
		
	}
}
